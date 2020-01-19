package layout;

import ClassesAnimal.*;
import java.util.Calendar;
import javax.swing.JOptionPane;
import servicos.*;

/**
 * @author Carlos Lenz
 * @author Lucas de Almeida
 */
public class GUICadPet extends javax.swing.JInternalFrame {
    
    public GUICadPet() {
        initComponents();
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEspecie = new javax.swing.ButtonGroup();
        bgPorte = new javax.swing.ButtonGroup();
        bgSaude = new javax.swing.ButtonGroup();
        jpCAdPets = new javax.swing.JPanel();
        jlCadPet = new javax.swing.JLabel();
        jlNomePet = new javax.swing.JLabel();
        jtfNomePet = new javax.swing.JTextField();
        jlEspecie = new javax.swing.JLabel();
        jrbEspecieCachorro = new javax.swing.JRadioButton();
        jrbEspecieGato = new javax.swing.JRadioButton();
        jrbEspecieRoedor = new javax.swing.JRadioButton();
        jrbEspecieOutro = new javax.swing.JRadioButton();
        jlPorte = new javax.swing.JLabel();
        jrbPortePequeno = new javax.swing.JRadioButton();
        jrbPorteMedio = new javax.swing.JRadioButton();
        jrbPorteGrande = new javax.swing.JRadioButton();
        jlPeso = new javax.swing.JLabel();
        jtfPeso = new javax.swing.JTextField();
        jlAltura = new javax.swing.JLabel();
        jtfAltura = new javax.swing.JTextField();
        jlAnoNasc = new javax.swing.JLabel();
        jtfAnoNasc = new javax.swing.JTextField();
        jlPelagem = new javax.swing.JLabel();
        jtfPelagem = new javax.swing.JTextField();
        jlConsulta = new javax.swing.JLabel();
        jtfConsulta = new javax.swing.JTextField();
        jlCadDono = new javax.swing.JLabel();
        jlNomeDono = new javax.swing.JLabel();
        jtfNomeDono = new javax.swing.JTextField();
        jlFone = new javax.swing.JLabel();
        jtfFone = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jbtnSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(671, 523));
        setRequestFocusEnabled(false);
        setVisible(false);

        jpCAdPets.setPreferredSize(new java.awt.Dimension(326, 596));

        jlCadPet.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlCadPet.setText("Cadastro Pets");

        jlNomePet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlNomePet.setText("Nome");

        jtfNomePet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jlEspecie.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlEspecie.setText("Especie");

        bgEspecie.add(jrbEspecieCachorro);
        jrbEspecieCachorro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrbEspecieCachorro.setSelected(true);
        jrbEspecieCachorro.setText("Cachorro");

        bgEspecie.add(jrbEspecieGato);
        jrbEspecieGato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrbEspecieGato.setText("Gato");

        bgEspecie.add(jrbEspecieRoedor);
        jrbEspecieRoedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrbEspecieRoedor.setText("Roedor");

        bgEspecie.add(jrbEspecieOutro);
        jrbEspecieOutro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrbEspecieOutro.setText("Outro");

        jlPorte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlPorte.setText("Porte");

        bgPorte.add(jrbPortePequeno);
        jrbPortePequeno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrbPortePequeno.setSelected(true);
        jrbPortePequeno.setText("Pequeno");

        bgPorte.add(jrbPorteMedio);
        jrbPorteMedio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrbPorteMedio.setText("Medio");

        bgPorte.add(jrbPorteGrande);
        jrbPorteGrande.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrbPorteGrande.setText("Grande");

        jlPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlPeso.setText("Peso ");

        jtfPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jlAltura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlAltura.setText("Altura");

        jtfAltura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jlAnoNasc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlAnoNasc.setText("Ano de Nasc.");

        jtfAnoNasc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jlPelagem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlPelagem.setText("Pelagem");

        jtfPelagem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jlConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlConsulta.setText("Prim. Consulta");

        jtfConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jlCadDono.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlCadDono.setText("Cadastro Dono");

        jlNomeDono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlNomeDono.setText("Nome");

        jtfNomeDono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jlFone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlFone.setText("Fone");

        jtfFone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jlEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlEmail.setText("E-mail");

        jtfEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jbtnSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnSalvar.setText("Cadastrar");
        jbtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCAdPetsLayout = new javax.swing.GroupLayout(jpCAdPets);
        jpCAdPets.setLayout(jpCAdPetsLayout);
        jpCAdPetsLayout.setHorizontalGroup(
            jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCAdPetsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCAdPetsLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jlCadPet, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(345, Short.MAX_VALUE))
                    .addGroup(jpCAdPetsLayout.createSequentialGroup()
                        .addGroup(jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpCAdPetsLayout.createSequentialGroup()
                                .addComponent(jlPelagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPelagem, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlConsulta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jpCAdPetsLayout.createSequentialGroup()
                                    .addComponent(jlPeso)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jlAltura)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jlAnoNasc)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfAnoNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpCAdPetsLayout.createSequentialGroup()
                                    .addGroup(jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlEspecie)
                                        .addGroup(jpCAdPetsLayout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(jrbEspecieCachorro)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jrbEspecieGato)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jrbEspecieRoedor)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jrbEspecieOutro)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlPorte)
                                        .addGroup(jpCAdPetsLayout.createSequentialGroup()
                                            .addComponent(jrbPortePequeno)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jrbPorteMedio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jrbPorteGrande))))
                                .addGroup(jpCAdPetsLayout.createSequentialGroup()
                                    .addComponent(jlNomePet)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfNomePet))))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpCAdPetsLayout.createSequentialGroup()
                            .addComponent(jlNomeDono)
                            .addGap(18, 18, 18)
                            .addComponent(jtfNomeDono))
                        .addGroup(jpCAdPetsLayout.createSequentialGroup()
                            .addComponent(jlCadDono)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jpCAdPetsLayout.createSequentialGroup()
                            .addComponent(jlFone)
                            .addGap(18, 18, 18)
                            .addComponent(jtfFone, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jlEmail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfEmail)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCAdPetsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnSalvar))))
        );
        jpCAdPetsLayout.setVerticalGroup(
            jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCAdPetsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCadPet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomePet)
                    .addComponent(jtfNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEspecie)
                    .addComponent(jlPorte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbEspecieCachorro)
                    .addComponent(jrbEspecieGato)
                    .addComponent(jrbEspecieRoedor)
                    .addComponent(jrbEspecieOutro)
                    .addComponent(jrbPortePequeno)
                    .addComponent(jrbPorteMedio)
                    .addComponent(jrbPorteGrande))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPeso)
                    .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAltura)
                    .addComponent(jtfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAnoNasc)
                    .addComponent(jtfAnoNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPelagem)
                    .addComponent(jtfPelagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlConsulta)
                    .addComponent(jtfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlCadDono)
                .addGroup(jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCAdPetsLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jlNomeDono))
                    .addComponent(jtfNomeDono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCAdPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFone)
                    .addComponent(jtfFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEmail)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnSalvar)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpCAdPets, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCAdPets, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cadastrar() {
        try {
            Animal a = new Animal();
            Calendar date=Calendar.getInstance();
            a.setNome(jtfNomePet.getText());
            if(jrbEspecieCachorro.isSelected()){
                a.setEspecie(jrbEspecieCachorro.getText());
                if(jrbPortePequeno.isSelected()){
                    a.setPorte(jrbPortePequeno.getText());
                }else if(jrbPorteMedio.isSelected()){
                    a.setPorte(jrbPorteMedio.getText());
                }else if(jrbPorteGrande.isSelected()){
                    a.setPorte(jrbPorteGrande.getText());
            }
            }else if(jrbEspecieGato.isSelected()){
                a.setEspecie(jrbEspecieGato.getText());
                
           }else if(jrbEspecieRoedor.isSelected()){
                a.setEspecie(jrbEspecieRoedor.getText());
               
            }else if(jrbEspecieOutro.isSelected()){
                a.setEspecie(jrbEspecieOutro.getText());
                
            }
            a.setPeso(Double.parseDouble(jtfPeso.getText()));
            a.setAltura(Double.parseDouble(jtfAltura.getText()));
            a.setAnoNascimento(Integer.parseInt(jtfAnoNasc.getText()));
            a.setAnoAtual(date.get(date.YEAR));
            a.idade();
            a.setPelagem(jtfPelagem.getText());
            a.setPrimConsulta(jtfConsulta.getText());
            a.setNomeDono(jtfNomeDono.getText());
            a.setEmail(jtfEmail.getText());
            a.setFone(jtfFone.getText());
            
            //Enviando o objeto pVO para o banco de dados
            AnimalServicos as = servicos.ServicosFactory.getAnimalServicos();
            //Chamando o método 
            as.cadastrarAnimal(a);
            
            JOptionPane.showMessageDialog(
                    rootPane, 
                    "Animal cadastrado com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro! "+e.getMessage(),
                    "erro",
                    JOptionPane.ERROR_MESSAGE);
        }//fecha catch
        
    }//fecha método cadastrar

    private void limpar() {
        jtfAltura.setText("");
        jtfAnoNasc.setText("");
        jtfConsulta.setText("");
        jtfEmail.setText("");
        jtfFone.setText("");
        jtfNomeDono.setText("");
        jtfNomePet.setText("");
        jtfPelagem.setText("");
        jtfPeso.setText("");
        jrbEspecieCachorro.setSelected(true);
        jrbPortePequeno.setSelected(true);
    }//fecha método limpar
    private void jbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalvarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_jbtnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEspecie;
    private javax.swing.ButtonGroup bgPorte;
    private javax.swing.ButtonGroup bgSaude;
    private javax.swing.JButton jbtnSalvar;
    private javax.swing.JLabel jlAltura;
    private javax.swing.JLabel jlAnoNasc;
    private javax.swing.JLabel jlCadDono;
    private javax.swing.JLabel jlCadPet;
    private javax.swing.JLabel jlConsulta;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlEspecie;
    private javax.swing.JLabel jlFone;
    private javax.swing.JLabel jlNomeDono;
    private javax.swing.JLabel jlNomePet;
    private javax.swing.JLabel jlPelagem;
    private javax.swing.JLabel jlPeso;
    private javax.swing.JLabel jlPorte;
    private javax.swing.JPanel jpCAdPets;
    private javax.swing.JRadioButton jrbEspecieCachorro;
    private javax.swing.JRadioButton jrbEspecieGato;
    private javax.swing.JRadioButton jrbEspecieOutro;
    private javax.swing.JRadioButton jrbEspecieRoedor;
    private javax.swing.JRadioButton jrbPorteGrande;
    private javax.swing.JRadioButton jrbPorteMedio;
    private javax.swing.JRadioButton jrbPortePequeno;
    private javax.swing.JTextField jtfAltura;
    private javax.swing.JTextField jtfAnoNasc;
    private javax.swing.JTextField jtfConsulta;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfFone;
    private javax.swing.JTextField jtfNomeDono;
    private javax.swing.JTextField jtfNomePet;
    private javax.swing.JTextField jtfPelagem;
    private javax.swing.JTextField jtfPeso;
    // End of variables declaration//GEN-END:variables
}
