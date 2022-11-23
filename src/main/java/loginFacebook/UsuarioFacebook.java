/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginFacebook;

import com.restfb.types.User;

/**
 *
 * @author Gael
 */
public class UsuarioFacebook {
    
    User user;
    String Atoken;

    public UsuarioFacebook(User user, String Atoken) {
        this.user = user;
        this.Atoken = Atoken;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAtoken() {
        return Atoken;
    }

    public void setaAtoken(String Atoken) {
        this.Atoken = Atoken;
    }
    
    
    
}
