/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

public class DAOFactory {
    
    private static AnimalDAO aDAO = new AnimalDAO();
    
    public static AnimalDAO getAnimalDAO(){
        return aDAO;
      }
    
    private static UsuariosDAO uDAO = new UsuariosDAO();
    
    public static UsuariosDAO getUsuariosDAO(){
        return uDAO;
      }
    
}
