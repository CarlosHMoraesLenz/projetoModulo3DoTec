/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import DAO.DAOFactory;
import DAO.UsuariosDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import ClassesUsers.Usuarios;


public class UsuariosServicos {

    /**
     * @param pVO Objeto proveniente da interface
     * @throws SQLException Lançando exceção de SQL
     */
    public void cadastrarUsuarios(Usuarios u) throws SQLException {
        UsuariosDAO uDAO = DAOFactory.getUsuariosDAO();
        uDAO.cadastrarUsuario(u);
    }//fecha método

    /**
     * @return Retornando um Array contendo todos os produtos do banco de dados.
     * @throws SQLException Lançando exceção de SQL
     */
    public ArrayList<Usuarios> buscarUsuarios() throws SQLException {
        UsuariosDAO aDAO = DAOFactory.getUsuariosDAO();
        return aDAO.buscarUsuarios();
    }//fecha método
    
    //Método deletarProduto
 
    public void deletarUsuarios(String id) throws SQLException{
        UsuariosDAO uDAO = DAOFactory.getUsuariosDAO();
        uDAO.deletarUsuarios(id);
    }//fecha método deletarProduto
    
    //Método filtrar
     
    public ArrayList<Usuarios> filtrar(String query) throws SQLException{
        UsuariosDAO uDAO = DAOFactory.getUsuariosDAO();
        return uDAO.filtrar(query);
    }//fecha método filtrar    
    
    public boolean validarSenha(Usuarios u) throws SQLException {
        UsuariosDAO uDAO = DAOFactory.getUsuariosDAO();
        return uDAO.validarSenha(u);
    }//fecha método
}//fecha classe