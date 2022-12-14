/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logueo;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.User;
import dominio.Usuario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Clase que realiza el inicio de sesión con facebook y devuelve un objeto
 * de tipo usuario en base a los datos obtenidos.
 *
 * @author Equipo broker
 */
public class AdaptadorFacebook implements IAdapterLogueo {
    /**
     * Identificador de APP.
     */
    private final String APP_ID = "2105096923023572";
    /**
     * Redireccionamiento.
     */
    private final String REDIRECT_URI = "https://localhost/";
    /**
     * Url completa.
     */
    private final String AUTHURL = "https://graph.facebook.com/oauth/authorize?type=user_agent&client_id=" + APP_ID + "&redirect_uri=" + REDIRECT_URI + "&scope=user_about_me,"
            + "user_actions.books,user_actions.fitness,user_actions.music,user_actions.news,user_actions.video,user_activities,user_birthday,user_education_history,"
            + "user_events,user_photos,user_friends,user_games_activity,user_groups,user_hometown,user_interests,user_likes,user_location,user_photos,user_relationship_details,"
            + "user_relationships,user_religion_politics,user_status,user_tagged_places,user_videos,user_website,user_work_history,ads_management,ads_read,email,"
            + "manage_notifications,manage_pages,publish_actions,read_insights,read_mailbox,read_page_mailboxes,read_stream,rsvp_event";
    /**
     * Método utilizado para iniciar sesión con facebook.
     * @return Usuario.
     */
    @Override
    public Usuario iniciarSesion() {
        
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(AUTHURL);
        String url;
        String[] accessToken;
                
        while (true) {

            if (!driver.getCurrentUrl().contains("facebook.com")) {
                url = driver.getCurrentUrl();

                url = url.replaceAll(".*#access_token=(.+)&.*", "$1");
                accessToken = url.split("&");
                    
                driver.quit();
                
                FacebookClient fbClient = new DefaultFacebookClient(accessToken[0]);

                User user = fbClient.fetchObject("me", User.class, Parameter.with("fields", "id,name,email,birthday,age_range,gender, verified"));
                Usuario usuarioFacebok = new Usuario(user.getName(),user.getEmail(),user.getId());
                return usuarioFacebok;

            }

        }

    }
    
}

