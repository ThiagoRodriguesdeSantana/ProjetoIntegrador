/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Conexao;
import model.DAO.DAOTurma;
import controller.Turma;

public class CadastroTurma extends javax.swing.JInternalFrame {

    private Connection conectar = null;
    
    public CadastroTurma() {
        initComponents();
        conectar = Conexao.getConexao();
        preencherComboAno();
        preencherComboCurso();
        preencherComboHorario();
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
<<<<<<< HEAD
        jtfDescricao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        cbCurso = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        CBoAno = new javax.swing.JComboBox();
        CbHorario = new javax.swing.JComboBox();

        jTextField2.setText("jTextField2");
=======
        jtfCod = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        btnInserir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbEstado1 = new javax.swing.JComboBox<>();
>>>>>>> 0a53d67c8fe1f2c509e2d9fc9c52ab2ff4dcdb47

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Nova Turma"));

        jLabel1.setText("Descrição:");

        jLabel2.setText("Curso:");

        jLabel3.setText("Horário:");

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/delete.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cbCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Ano:");

        CBoAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CbHorario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< HEAD
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
=======
                        .addGap(38, 38, 38)
                        .addComponent(btnInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
>>>>>>> 0a53d67c8fe1f2c509e2d9fc9c52ab2ff4dcdb47
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CBoAno, 0, 155, Short.MAX_VALUE)
                                    .addComponent(CbHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCancelar)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
<<<<<<< HEAD
                    .addComponent(jButton1)
                    .addComponent(jBCancelar))
                .addContainerGap(48, Short.MAX_VALUE))
=======
                    .addComponent(btnInserir)
                    .addComponent(btnCancelar))
                .addContainerGap(72, Short.MAX_VALUE))
>>>>>>> 0a53d67c8fe1f2c509e2d9fc9c52ab2ff4dcdb47
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed

<<<<<<< HEAD
        try {
            
            int id = 1;
            String descricao = jtfDescricao.getText();
            int curso = (int)cbCurso.getSelectedIndex();
            String horario = (String)CbHorario.getSelectedItem();
            int ano  = (int)CBoAno.getSelectedItem();
            
             Turma turma = new Turma(id, descricao, ano, horario, curso);
             
            DAOTurma turmaDao = new DAOTurma();
            
            turmaDao.incluir(turma);
          
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed
=======
    }//GEN-LAST:event_btnInserirActionPerformed
>>>>>>> 0a53d67c8fe1f2c509e2d9fc9c52ab2ff4dcdb47

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JComboBox CBoAno;
    private javax.swing.JComboBox CbHorario;
    private javax.swing.JComboBox<String> cbCurso;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jButton1;
=======
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbEstado1;
>>>>>>> 0a53d67c8fe1f2c509e2d9fc9c52ab2ff4dcdb47
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jtfDescricao;
    // End of variables declaration//GEN-END:variables


    private void preencherComboAno() {
        String sql = "select * from ano";
        try{
            PreparedStatement pst = conectar.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                CBoAno.addItem(rs.getString("Ano"));
            }
            
        }
        catch(Exception e){
            
        }

    }


    private void preencherComboHorario() {
        String sql = "select * from Horario";
        try{
            PreparedStatement pst = conectar.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                CbHorario.addItem(rs.getString("Horario"));
            }
            
        }
        catch(Exception e){
            
        }

    }
    private void preencherComboCurso() {
        String sql = "select * from Curso";
        try{
            PreparedStatement pst = conectar.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                cbCurso.addItem(rs.getString("Curso"));
            }
            
        }
        catch(Exception e){
            
        }

    }
}


