package layout;

import ClassesUsers.Usuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servicos.*;

/**
 * @author Carlos Lenz
 * @author Lucas de Almeida
 */
public class GUIPesquisaUser extends javax.swing.JInternalFrame {
    
    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"id","senha","nome","fone","nivel"});
    
    public GUIPesquisaUser() {
        initComponents();
        
        preencherTabela();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbtnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPesqUs = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jlPesquisar = new javax.swing.JLabel();
        jlDigite = new javax.swing.JLabel();
        jtfDigite = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jbtnExcluir.setText("Excluir");
        jbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExcluirActionPerformed(evt);
            }
        });

        jtPesqUs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "senha", "nome", "fone", "nivel"
            }
        ));
        jScrollPane1.setViewportView(jtPesqUs);

        jLayeredPane2.setLayer(jbtnExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(736, Short.MAX_VALUE)
                .addComponent(jbtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlPesquisar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jlPesquisar.setText("Pesquisar");

        jlDigite.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlDigite.setText("digite:");

        jtfDigite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfDigiteKeyReleased(evt);
            }
        });

        jLayeredPane1.setLayer(jlPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlDigite, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfDigite, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jlPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jlDigite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfDigite)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDigite)
                    .addComponent(jtfDigite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void preencherTabela() {
        try {

            //Buscando objeto ProdutoServicos     
            UsuariosServicos us = ServicosFactory.getUsuariosServicos();

            /* Criando um ArrayList<ProdutoVO> vazio
             para receber o ArrayList com os dados */
            ArrayList<Usuarios> u = new ArrayList<>();

            //Recebendo o ArrayList cheio em produtos
            u = us.buscarUsuarios();

            for (int i = 0; i < u.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(u.get(i).getId()),
                    String.valueOf(u.get(i).getSenha()),
                    String.valueOf(u.get(i).getNome()),
                    String.valueOf(u.get(i).getFone()),
                    String.valueOf(u.get(i).getNivel())
                });
            }//fecha for

            /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
            jtPesqUs.setModel(dtm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }//fecha catch
    }//fecha preencherTabela

    private void limparTabela() {
        /* Para limpar a tabela temos que setar o número de
         linhas para zero no default table model */
        dtm.setNumRows(0);
    }//fecha limparTabela

    private void deletar() {
        try {
            /* Buscando a linha que o usuário clicou */
            int linha = jtPesqUs.getSelectedRow();
            
            /* Testando se o usuário selecionou alguma linha. */
            if (linha == -1) {
                JOptionPane.showMessageDialog(
                        this,
                        "Você não selecionou nenhuma linha!");
            } else {
                UsuariosServicos us = ServicosFactory.getUsuariosServicos();
                
                /* Buscando o idProduto da linha selecionada. O zero(0) indica
                   que vamos buscar o valor da primeira coluna. */
                String id = (String) jtPesqUs.getValueAt(linha, 0);
                
                /* Enviando o idProduto para ser excluido. */
                us.deletarUsuarios(id);

                //Mensagem de sucesso para o usuário!
                JOptionPane.showMessageDialog(this,
                        "Usuarios excluido com sucesso!");

            }//fecha else
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao deletar! " + e.getMessage());
        }//fecha catch        
    }//fecha deletar

    private void filtrar(){
        try {
            if (jtfDigite.getText().isEmpty()) {
                preencherTabela();
            }else{
                UsuariosServicos us = ServicosFactory.getUsuariosServicos();
               
                //Criando variável que armazenará a consulta.
                String query;
                
                /* Testando o que o usuário escolheu no JComboBox. Conforme
                    o que foi escolhido uma determinada consulta será montada. */
                query = "where id = "+jtfDigite.getText();
                

                /* Criando um ArrayList vazio para receber os dados do banco. */
                ArrayList<Usuarios> u = new ArrayList<>();               
                
                /* Buscando um ArrayList conforme o filtro que o usuário
                    solicitou. */                
                u = us.filtrar(query);
                
                /* For que preenche o modelo de tabela (dtm) buscando 
                   dados do ArrayList chamado p. */
                for (int i = 0; i < u.size(); i++) {
                    dtm.addRow(new String[]{
                        String.valueOf(u.get(i).getId()),
                    String.valueOf(u.get(i).getSenha()),
                    String.valueOf(u.get(i).getNome()),
                    String.valueOf(u.get(i).getFone()),
                    String.valueOf(u.get(i).getNivel())
                    });
                }//fecha for
                jtPesqUs.setModel(dtm);                
            }//fecha else
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao buscar! " + e.getMessage());
        }//fecha catch        
    }//fecha filtrar
    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
        deletar();
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbtnExcluirActionPerformed

    private void jtfDigiteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDigiteKeyReleased
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtfDigiteKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JLabel jlDigite;
    private javax.swing.JLabel jlPesquisar;
    private javax.swing.JTable jtPesqUs;
    private javax.swing.JTextField jtfDigite;
    // End of variables declaration//GEN-END:variables
}

