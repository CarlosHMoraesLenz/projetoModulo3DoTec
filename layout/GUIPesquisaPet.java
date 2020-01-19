package layout;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servicos.*;
import ClassesAnimal.*;

/**
 * @author Carlos Lenz
 * @author Lucas de Almeida
 */
public class GUIPesquisaPet extends javax.swing.JInternalFrame {
    
    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"idAnimal","nome","especie","porte","pelagem","peso","altura","primConsulta","idade","nomeDono","fone","email"});
    
    public GUIPesquisaPet() {
        initComponents();
        
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jlPesquisar = new javax.swing.JLabel();
        jlDigite = new javax.swing.JLabel();
        jtfDigite = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbtnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPesqAn = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);

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
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jlPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
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
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLayeredPane2.setEnabled(false);

        jbtnExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnExcluir.setText("Excluir");
        jbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExcluirActionPerformed(evt);
            }
        });

        jtPesqAn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, "", null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, "", null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "idAnimal", "nome", "especie", "porte", "pelagem", "peso", "altura", "primConsulta", "idade", "nomeDono", "fone", "email"
            }
        ));
        jtPesqAn.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jtPesqAn);

        jLayeredPane2.setLayer(jbtnExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnExcluir)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void preencherTabela() {
        try {

            //Buscando objeto ProdutoServicos     
            AnimalServicos as = ServicosFactory.getAnimalServicos();

            /* Criando um ArrayList<ProdutoVO> vazio
             para receber o ArrayList com os dados */
            ArrayList<Animal> a = new ArrayList<>();

            //Recebendo o ArrayList cheio em produtos
            a = as.buscarAnimal();

            for (int i = 0; i < a.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(a.get(i).getIdAnimal()),
                    String.valueOf(a.get(i).getNome()),
                    String.valueOf(a.get(i).getEspecie()),
                    String.valueOf(a.get(i).getPorte()),
                    String.valueOf(a.get(i).getPelagem()),
                    String.valueOf(a.get(i).getPeso()),
                    String.valueOf(a.get(i).getAltura()),
                    String.valueOf(a.get(i).getPrimConsulta()),
                    String.valueOf(a.get(i).getIdade()),
                    String.valueOf(a.get(i).getNomeDono()),
                    String.valueOf(a.get(i).getFone()),
                    String.valueOf(a.get(i).getEmail())
                });
            }//fecha for

            /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
            jtPesqAn.setModel(dtm);

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
            int linha = jtPesqAn.getSelectedRow();
            
            /* Testando se o usuário selecionou alguma linha. */
            if (linha == -1) {
                JOptionPane.showMessageDialog(
                        this,
                        "Você não selecionou nenhuma linha!");
            } else {
                AnimalServicos as = ServicosFactory.getAnimalServicos();
                
                /* Buscando o idProduto da linha selecionada. O zero(0) indica
                   que vamos buscar o valor da primeira coluna. */
                String idAnimal = (String) jtPesqAn.getValueAt(linha, 0);
                
                /* Enviando o idProduto para ser excluido. */
                as.deletarAnimal(Integer.parseInt(idAnimal));

                //Mensagem de sucesso para o usuário!
                JOptionPane.showMessageDialog(this,
                        "animal excluido com sucesso!");

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
                AnimalServicos ps = ServicosFactory.getAnimalServicos();
                               
                //Criando variável que armazenará a consulta.
                String query;
                
                /* Testando o que o usuário escolheu no JComboBox. Conforme
                    o que foi escolhido uma determinada consulta será montada. */
                query = "where idAnimal = "+jtfDigite.getText();
                

                /* Criando um ArrayList vazio para receber os dados do banco. */
                ArrayList<Animal> a = new ArrayList<>();               
                
                /* Buscando um ArrayList conforme o filtro que o usuário
                    solicitou. */                
                a = ps.filtrar(query);
                
                /* For que preenche o modelo de tabela (dtm) buscando 
                   dados do ArrayList chamado p. */
                for (int i = 0; i < a.size(); i++) {
                    dtm.addRow(new String[]{
                        String.valueOf(a.get(i).getIdAnimal()),
                        String.valueOf(a.get(i).getNome()),
                        String.valueOf(a.get(i).getEspecie()),
                        String.valueOf(a.get(i).getPorte()),
                        String.valueOf(a.get(i).getPelagem()),
                        String.valueOf(a.get(i).getPeso()),
                        String.valueOf(a.get(i).getAltura()),
                        String.valueOf(a.get(i).getPrimConsulta()),
                        String.valueOf(a.get(i).getIdade()),
                        String.valueOf(a.get(i).getNomeDono()),
                        String.valueOf(a.get(i).getFone()),
                        String.valueOf(a.get(i).getEmail())
                    });
                }//fecha for
                jtPesqAn.setModel(dtm);                
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
    private javax.swing.JTable jtPesqAn;
    private javax.swing.JTextField jtfDigite;
    // End of variables declaration//GEN-END:variables
}
