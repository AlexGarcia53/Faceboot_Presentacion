/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logueo;
import dominio.*;
/**
 *
 * @author Gael
 */
public class ConstructorAdapterFacebook {
//        private IMetodoLogueo estrategia;
    
    private static ConstructorAdapterFacebook adapter;
    
    private ConstructorAdapterFacebook(){
        
    }
    
    public static ConstructorAdapterFacebook getInstancia(){
        if(adapter==null){
            adapter= new ConstructorAdapterFacebook();
        }
        return adapter;
    }
    
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
