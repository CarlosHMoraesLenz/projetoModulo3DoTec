/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import DAO.DAOFactory;
import DAO.AnimalDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import ClassesAnimal.Animal;


public class AnimalServicos {

    /**
     * @param pVO Objeto proveniente da interface
     * @throws SQLException Lançando exceção de SQL
     */
    public void cadastrarAnimal(Animal a) throws SQLException {
        AnimalDAO aDAO = DAOFactory.getAnimalDAO();
        aDAO.cadastrarAnimal(a);
    }//fecha método

    /**
     * @return Retornando um Array contendo todos os produtos do banco de dados.
     * @throws SQLException Lançando exceção de SQL
     */
    public ArrayList<Animal> buscarAnimal() throws SQLException {
        AnimalDAO aDAO = DAOFactory.getAnimalDAO();
        return aDAO.buscarAnimal();
    }//fecha método
    
    //Método deletarProduto
 
    public void deletarAnimal(int idAnimal) throws SQLException{
        AnimalDAO aDAO = DAOFactory.getAnimalDAO();
        aDAO.deletarAnimal(idAnimal);
    }//fecha método deletarProduto
    
    //Método filtrar
     
    public ArrayList<Animal> filtrar(String query) throws SQLException{
        AnimalDAO aDAO = DAOFactory.getAnimalDAO();
        return aDAO.filtrar(query);
    }//fecha método filtrar    
    
}//fecha classe