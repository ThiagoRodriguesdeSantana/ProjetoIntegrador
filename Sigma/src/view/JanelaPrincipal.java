/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author bruno
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    public JanelaPrincipal() {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        desktopPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnNovo = new javax.swing.JMenu();
        miNovoAluno = new javax.swing.JMenuItem();
        miNovoProfessor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miNovoDisciplina = new javax.swing.JMenuItem();
        miPeriodo = new javax.swing.JMenuItem();
        miNovoCurso = new javax.swing.JMenuItem();
        mnGerenciar = new javax.swing.JMenu();
        miGerenciarAluno = new javax.swing.JMenuItem();
        miGerenciarProfessor = new javax.swing.JMenuItem();
        miGerenciarTurma = new javax.swing.JMenuItem();
        miGerenciarCurso = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );

        mnNovo.setText("Novo");

        miNovoAluno.setText("Aluno");
        miNovoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovoAlunoActionPerformed(evt);
            }
        });
        mnNovo.add(miNovoAluno);

        miNovoProfessor.setText("Professor");
        miNovoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovoProfessorActionPerformed(evt);
            }
        });
        mnNovo.add(miNovoProfessor);
        mnNovo.add(jSeparator1);

        miNovoDisciplina.setText("Disciplina");
        miNovoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovoDisciplinaActionPerformed(evt);
            }
        });
        mnNovo.add(miNovoDisciplina);

        miPeriodo.setText("Periodo");
        miPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPeriodoActionPerformed(evt);
            }
        });
        mnNovo.add(miPeriodo);

        miNovoCurso.setText("Curso");
        miNovoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovoCursoActionPerformed(evt);
            }
        });
        mnNovo.add(miNovoCurso);

        jMenuBar1.add(mnNovo);

        mnGerenciar.setText("Gerenciar");

        miGerenciarAluno.setText("Alunos");
        miGerenciarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGerenciarAlunoActionPerformed(evt);
            }
        });
        mnGerenciar.add(miGerenciarAluno);

        miGerenciarProfessor.setText("Professores");
        miGerenciarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGerenciarProfessorActionPerformed(evt);
            }
        });
        mnGerenciar.add(miGerenciarProfessor);

        miGerenciarTurma.setText("Turmas");
        miGerenciarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGerenciarTurmaActionPerformed(evt);
            }
        });
        mnGerenciar.add(miGerenciarTurma);

        miGerenciarCurso.setText("Cursos");
        miGerenciarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGerenciarCursoActionPerformed(evt);
            }
        });
        mnGerenciar.add(miGerenciarCurso);

        jMenuBar1.add(mnGerenciar);

        jMenu1.setText("Ajuda");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miNovoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovoAlunoActionPerformed
        CadastroAluno cadastroAluno = new CadastroAluno();
        desktopPrincipal.add(cadastroAluno);
        cadastroAluno.setVisible(true);
    }//GEN-LAST:event_miNovoAlunoActionPerformed

    private void miNovoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovoProfessorActionPerformed
        CadastroProfessor cadastroProfessor = new CadastroProfessor();
        desktopPrincipal.add(cadastroProfessor);
        cadastroProfessor.setVisible(true);
    }//GEN-LAST:event_miNovoProfessorActionPerformed

    private void miNovoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovoCursoActionPerformed
    }//GEN-LAST:event_miNovoCursoActionPerformed

    private void miPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPeriodoActionPerformed
        CadastroPeriodo cadastroPeriodo = new CadastroPeriodo();
        desktopPrincipal.add(cadastroPeriodo);
        cadastroPeriodo.setVisible(true);
    }//GEN-LAST:event_miPeriodoActionPerformed

    private void miNovoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovoDisciplinaActionPerformed
        CadastroDisciplina cadastroDisciplina = new CadastroDisciplina();
        desktopPrincipal.add(cadastroDisciplina);
        cadastroDisciplina.setVisible(true);
    }//GEN-LAST:event_miNovoDisciplinaActionPerformed

    private void miGerenciarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGerenciarAlunoActionPerformed
        GerenciarAluno gerenciarAluno = new GerenciarAluno(desktopPrincipal);
        desktopPrincipal.add(gerenciarAluno);
        gerenciarAluno.setVisible(true);
    }//GEN-LAST:event_miGerenciarAlunoActionPerformed

    private void miGerenciarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGerenciarProfessorActionPerformed
        GerenciarProfessor gerenciarProfessor = new GerenciarProfessor(desktopPrincipal);
        desktopPrincipal.add(gerenciarProfessor);
        gerenciarProfessor.setVisible(true);
    }//GEN-LAST:event_miGerenciarProfessorActionPerformed

    private void miGerenciarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGerenciarTurmaActionPerformed
        GerenciarTurma gerenciarTurma = new GerenciarTurma();
        desktopPrincipal.add(gerenciarTurma);
        gerenciarTurma.setVisible(true);
    }//GEN-LAST:event_miGerenciarTurmaActionPerformed

    private void miGerenciarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGerenciarCursoActionPerformed
        /*GerenciarCurso gerenciarCurso = new GerenciarCurso();
        desktopPrincipal.add(gerenciarCurso);
        gerenciarCurso.setVisible(true);*/
    }//GEN-LAST:event_miGerenciarCursoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem miGerenciarAluno;
    private javax.swing.JMenuItem miGerenciarCurso;
    private javax.swing.JMenuItem miGerenciarProfessor;
    private javax.swing.JMenuItem miGerenciarTurma;
    private javax.swing.JMenuItem miNovoAluno;
    private javax.swing.JMenuItem miNovoCurso;
    private javax.swing.JMenuItem miNovoDisciplina;
    private javax.swing.JMenuItem miNovoProfessor;
    private javax.swing.JMenuItem miPeriodo;
    private javax.swing.JMenu mnGerenciar;
    private javax.swing.JMenu mnNovo;
    // End of variables declaration//GEN-END:variables
}
