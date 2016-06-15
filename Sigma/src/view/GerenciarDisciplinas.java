package view;

import java.awt.event.ActionEvent;

public class GerenciarDisciplinas extends javax.swing.JInternalFrame {
    
    
    public GerenciarDisciplinas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPGerenciarProDisciplinas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbListagem = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tfLocalizar = new javax.swing.JTextField();
        btnLocalizar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNovoDisciplina = new javax.swing.JButton();

        setClosable(true);

        jPGerenciarProDisciplinas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código:", "Disciplina:", "Carga Horária:", "Ementa:", "Período:", "Bibliografia:"
            }
        ));
        jScrollPane3.setViewportView(tbListagem);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Gerenciar Disciplinas");

        btnLocalizar.setText("Localizar");

        btnListar.setText("Listar tudo");

        btnAlterar.setText("Alterar");

        btnExcluir.setText("Excluir");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNovoDisciplina.setText("Novo");

        javax.swing.GroupLayout jPGerenciarProDisciplinasLayout = new javax.swing.GroupLayout(jPGerenciarProDisciplinas);
        jPGerenciarProDisciplinas.setLayout(jPGerenciarProDisciplinasLayout);
        jPGerenciarProDisciplinasLayout.setHorizontalGroup(
            jPGerenciarProDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGerenciarProDisciplinasLayout.createSequentialGroup()
                .addGroup(jPGerenciarProDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPGerenciarProDisciplinasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPGerenciarProDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                            .addGroup(jPGerenciarProDisciplinasLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnNovoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLocalizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnListar))))
                    .addGroup(jPGerenciarProDisciplinasLayout.createSequentialGroup()
                        .addGroup(jPGerenciarProDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPGerenciarProDisciplinasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(jPGerenciarProDisciplinasLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPGerenciarProDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPGerenciarProDisciplinasLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addGap(1, 1, 1)))
        );
        jPGerenciarProDisciplinasLayout.setVerticalGroup(
            jPGerenciarProDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGerenciarProDisciplinasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(55, 55, 55)
                .addGroup(jPGerenciarProDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizar)
                    .addComponent(btnListar)
                    .addComponent(btnNovoDisciplina))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPGerenciarProDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPGerenciarProDisciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPGerenciarProDisciplinasLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(398, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPGerenciarProDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPGerenciarProDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnNovoDisciplina;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPGerenciarProDisciplinas;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbListagem;
    private javax.swing.JTextField tfLocalizar;
    // End of variables declaration//GEN-END:variables
}
