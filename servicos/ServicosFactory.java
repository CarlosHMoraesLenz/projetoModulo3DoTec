/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servicos;


public class ServicosFactory {
    
   private static AnimalServicos aServicos= new AnimalServicos();

   public static AnimalServicos getAnimalServicos(){
       
       return aServicos;                                
   }//fecha metodo
    
   private static UsuariosServicos uServicos = new UsuariosServicos();
   
   public static UsuariosServicos getUsuariosServicos(){
       return uServicos;
   }//fecha metodo
}//fecha classe
