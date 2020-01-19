package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ClassesUsers.Usuarios;
import persistencia.ConexaoBanco;
/**
 *
 * @author Dragonborn
 */
public class UsuariosDAO {
    public void cadastrarUsuario(Usuarios u) throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            //String que receberá instrução SQL
            String sql;

            /* Montando a instrução INSERT para inserir
             um objeto a no Banco MySQL */
            sql = "insert into users(id,senha,nome,fone,nivel)"
            + "values('"+u.getId()+"','"+u.getSenha()+"','"+u.getNome()+"'"
                    + ",'"+u.getFone()+"','"+u.getNivel()+"')";

            //Executando o sql
            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir user!"+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método


    public ArrayList<Usuarios> buscarUsuarios() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from users";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<Usuarios> listU = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                Usuarios u = new Usuarios();

                /* Mapeando a tabela do banco para objeto
                 chamado a */
                u.setId(rs.getString("id"));
                u.setSenha(rs.getString("senha"));
                u.setNome(rs.getString("nome"));
                u.setFone(rs.getString("fone"));
                u.setNivel(rs.getString("nivel"));
                

                /* Inserindo o objeto a no ArrayList */
                listU.add(u);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return listU;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar users! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método buscarProduto

    //Método deletarProduto

    public void deletarUsuarios(String id) throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            String sql;
            /* Montando uma String que delete um registro através de um
             código(idProduto) enviado pelo usuário. */
            sql = "delete from users where id=" + id;
            
            int escolha=JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?");
            
            if(escolha==JOptionPane.YES_OPTION){
                stat.execute(sql);
                JOptionPane.showMessageDialog(null,"Dado excluído!");
            }else{
                JOptionPane.showMessageDialog(null,"Dado não excluído!");
            }
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao deletar user! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método deletarProduto    


    public ArrayList<Usuarios> filtrar(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from users " + query;

            ResultSet rs = stat.executeQuery(sql);
            ArrayList<Usuarios> listU = new ArrayList<>();

            while (rs.next()) {
                Usuarios u = new Usuarios();
                u.setId(rs.getString("id"));
                u.setSenha(rs.getString("senha"));
                u.setNome(rs.getString("nome"));
                u.setFone(rs.getString("fone"));
                u.setNivel(rs.getString("nivel"));
                listU.add(u);
            }//Fecha while
            return listU;
        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método filtrar  
    public boolean validarSenha(Usuarios u) throws SQLException {                  

        Connection conexao = ConexaoBanco.getConexao();
        Statement stat = conexao.createStatement();

        String sql;

        sql = "select count(*)"
                + " from users"
                + " where id ='" + u.getId() + "' and"
                + " senha = '" + u.getSenha() + "' and"
                + " nivel = '" + u.getNivel() +"' ";

        ResultSet rs = stat.executeQuery(sql);
        int retorno = -2;

        while (rs.next()) {
            retorno = rs.getInt(1);
        }//fecha while

        if (retorno == 1) {
            stat.close();
            return true;
        } else {
            return false;
        }//fecha else
    }//fecha método  
}
