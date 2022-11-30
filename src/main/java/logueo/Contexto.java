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
public class Contexto {
//        private IMetodoLogueo estrategia;
    
    private static Contexto contexto;
    
    private Contexto(){
        
    }
    
    public static Contexto getInstancia(){
        if(contexto==null){
            contexto= new Contexto();
        }
        return contexto;
    }
    
    public IMetodoLogueo obtenerAdaptador(){
        return new EstrategiaFacebook();
    }
    
//    public void establecerEstrategia(IMetodoLogueo estrategia){
//        this.estrategia = estrategia;
//    }
//    
//    public Usuario iniciarSesion(){
//       return this.estrategia.iniciarSesion();
//    }  
    
}
