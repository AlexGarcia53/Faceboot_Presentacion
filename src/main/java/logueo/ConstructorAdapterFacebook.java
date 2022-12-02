/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logueo;
import dominio.*;
/**
 * Método que construye al adaptador.
 *
 * @author Equipo broker
 */
public class ConstructorAdapterFacebook {
    /**
     * Instancia de ConstructorAdapter.
     */
    private static ConstructorAdapterFacebook adapter;
    /**
     * Constructor vacío.
     */
    private ConstructorAdapterFacebook(){
        
    }
    /**
     * Método que devuelve una instancia de ConstructorAdapter.
     * @return instancia de ConstructorAdapter.
     */
    public static ConstructorAdapterFacebook getInstancia(){
        if(adapter==null){
            adapter= new ConstructorAdapterFacebook();
        }
        return adapter;
    }
    /**
     * Método para obtener una instancia AdaptadorFacebook.
     * @return AdaptadorFacebook
     */
    public IAdapterLogueo obtenerAdaptador(){
        return new AdaptadorFacebook();
    }
    
//    public void establecerEstrategia(IMetodoLogueo estrategia){
//        this.estrategia = estrategia;
//    }
//    
//    public Usuario iniciarSesion(){
//       return this.estrategia.iniciarSesion();
//    }  
    
}
