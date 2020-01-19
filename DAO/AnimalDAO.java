package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ClassesAnimal.Animal;
import persistencia.ConexaoBanco;
/**
 *
 * @author Dragonborn
 */
public class AnimalDAO {
    public void cadastrarAnimal(Animal a) throws SQLException {

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
            sql = "insert into animal(idAnimal,nome,especie,porte,pelagem,peso,altura,primConsulta,idade,nomeDono,fone,email)"
            + "values(null, '"+a.getNome()+ "', '"+a.getEspecie()+"', '"+a.getPorte()+"', '"+a.getPelagem()+"', "+a.getPeso()+","
            +a.getAltura()+",'"+a.getPrimConsulta()+"',"+a.idade()+", '"+a.getNomeDono()+"', '"+a.getFone()+"'"+ ", '"+a.getEmail()+"')";

            //Executando o sql
            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir Animal!"+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método


    public ArrayList<Animal> buscarAnimal() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from animal";

            /* Executando o SQL  e armazenando throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<Animal> listA = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                Animal a = new Animal();

                /* Mapeando a tabela do banco para objeto
                 chamado a */
                a.setIdAnimal(rs.getInt("idAnimal"));
                a.setNome(rs.getString("nome"));
                a.setEspecie(rs.getString("especie"));
                a.setPorte(rs.getString("porte"));
                a.setPelagem(rs.getString("pelagem"));
                a.setPeso(rs.getDouble("peso"));
                a.setAltura(rs.getDouble("altura"));
                a.setPrimConsulta(rs.getString("primConsulta"));
                a.setIdade(rs.getInt("idade"));
                a.setNomeDono(rs.getString("nomeDono"));
                a.setFone(rs.getString("fone"));
                a.setEmail(rs.getString("email"));
                

                /* Inserindo o objeto a no ArrayList */
                listA.add(a);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return listA;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar produtos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método buscarProduto

    //Método deletarProduto

    public void deletarAnimal(int idAnimal) throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            String sql;
            /* Montando uma String que delete um registro através de um
             código(idProduto) enviado pelo usuário. */
            sql = "delete from Animal where idAnimal=" + idAnimal;
            
            int escolha=JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?");
            
            if(escolha==JOptionPane.YES_OPTION){
                stat.execute(sql);
                JOptionPane.showMessageDialog(null,"Dado excluído!");
            }else{
                JOptionPane.showMessageDialog(null,"Dado não excluído!");
            }
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao deletar Animal! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método deletarProduto    


    public ArrayList<Animal> filtrar(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from animal " + query;

            ResultSet rs = stat.executeQuery(sql);
            ArrayList<Animal> listA = new ArrayList<>();

            while (rs.next()) {
                Animal a = new Animal();
                a.setIdAnimal(rs.getInt("idAnimal"));
                a.setNome(rs.getString("nome"));
                a.setEspecie(rs.getString("especie"));
                a.setPorte(rs.getString("porte"));
                a.setPelagem(rs.getString("pelagem"));
                a.setPeso(rs.getDouble("peso"));
                a.setAltura(rs.getDouble("altura"));
                a.setPrimConsulta(rs.getString("primConsulta"));
                a.setIdade(rs.getInt("idade"));
                a.setNomeDono(rs.getString("nomeDono"));
                a.setFone(rs.getString("fone"));
                a.setEmail(rs.getString("email"));
                listA.add(a);
            }//Fecha while
            return listA;
        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método filtrar    

}//fecha classe

