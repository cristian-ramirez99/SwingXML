/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crearficheroxml;

import java.awt.Dimension;

/**
 *
 * @author Alumno
 */
public class GUI extends javax.swing.JFrame {
    
    public String extension;
    public String ficheroName;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ficheroForm = new javax.swing.JFrame();
        AutorLabel = new javax.swing.JLabel();
        CategoriaLabel = new javax.swing.JLabel();
        aceptarButton2 = new javax.swing.JButton();
        cancelarButton2 = new javax.swing.JButton();
        autorField = new javax.swing.JTextField();
        categoriaField = new javax.swing.JTextField();
        TituloLabel1 = new javax.swing.JLabel();
        tituloField = new javax.swing.JTextField();
        libroLabel = new javax.swing.JLabel();
        aceptarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        tipoFicheroLablel = new javax.swing.JLabel();
        CrearUnFicheroLabel = new javax.swing.JLabel();
        extensionComboBox = new javax.swing.JComboBox<>();
        nombreDelFicheroLabel = new javax.swing.JLabel();
        nombreDelFicheroField = new javax.swing.JTextField();

        AutorLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AutorLabel.setText("Autor");

        CategoriaLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CategoriaLabel.setText("Categoria");

        aceptarButton2.setText("Aceptar");
        aceptarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButton2ActionPerformed(evt);
            }
        });

        cancelarButton2.setText("Cancelar");
        cancelarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButton2ActionPerformed(evt);
            }
        });

        autorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorFieldActionPerformed(evt);
            }
        });

        TituloLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TituloLabel1.setText("Titulo");

        tituloField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloFieldActionPerformed(evt);
            }
        });

        libroLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        libroLabel.setText("Libro");

        javax.swing.GroupLayout ficheroFormLayout = new javax.swing.GroupLayout(ficheroForm.getContentPane());
        ficheroForm.getContentPane().setLayout(ficheroFormLayout);
        ficheroFormLayout.setHorizontalGroup(
            ficheroFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ficheroFormLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(ficheroFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ficheroFormLayout.createSequentialGroup()
                        .addComponent(libroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(ficheroFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ficheroFormLayout.createSequentialGroup()
                            .addComponent(aceptarButton2)
                            .addGap(46, 46, 46)
                            .addComponent(cancelarButton2)
                            .addGap(111, 111, 111))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ficheroFormLayout.createSequentialGroup()
                            .addGroup(ficheroFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CategoriaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AutorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TituloLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(13, 13, 13)
                            .addGroup(ficheroFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(categoriaField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tituloField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(autorField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))))
        );
        ficheroFormLayout.setVerticalGroup(
            ficheroFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ficheroFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(libroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ficheroFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TituloLabel1)
                    .addComponent(tituloField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ficheroFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AutorLabel)
                    .addComponent(autorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ficheroFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoriaLabel)
                    .addComponent(categoriaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(ficheroFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarButton2)
                    .addComponent(cancelarButton2))
                .addGap(18, 18, 18))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButton(evt);
            }
        });

        tipoFicheroLablel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tipoFicheroLablel.setText("Tipo fichero ");

        CrearUnFicheroLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CrearUnFicheroLabel.setText("Crear un fichero ");

        extensionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".txt", ".xml" }));

        nombreDelFicheroLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombreDelFicheroLabel.setText("Nombre del fichero");

        nombreDelFicheroField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreDelFicheroFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nombreDelFicheroField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(tipoFicheroLablel)
                                .addGap(18, 18, 18)
                                .addComponent(extensionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(aceptarButton)
                                .addGap(18, 18, 18)
                                .addComponent(cancelarButton))
                            .addComponent(nombreDelFicheroLabel)
                            .addComponent(CrearUnFicheroLabel))
                        .addGap(0, 29, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(CrearUnFicheroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreDelFicheroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreDelFicheroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoFicheroLablel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extensionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarButton)
                    .addComponent(cancelarButton))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButton
        System.exit(0);
    }//GEN-LAST:event_cancelarButton

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        // TODO add your handling code here:
        ficheroName = this.nombreDelFicheroField.getText();
        extension = this.extensionComboBox.getSelectedItem().toString();
        this.ficheroForm.setVisible(true);
        this.ficheroForm.setSize(400, 300);

    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void aceptarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButton2ActionPerformed
        // TODO add your handling code here:
        String titulo = this.tituloField.getText();
        String autor = this.autorField.getText();
        String categoria = this.categoriaField.getText();
        CrearFicheroXML newFichero = new CrearFicheroXML();
        newFichero.FileWriterWrite(ficheroName, extension, titulo, autor, categoria);
        this.tituloField.setText("");
        this.autorField.setText("");
        this.categoriaField.setText("");

    }//GEN-LAST:event_aceptarButton2ActionPerformed

    private void cancelarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelarButton2ActionPerformed

    private void autorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autorFieldActionPerformed

    private void tituloFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloFieldActionPerformed

    private void nombreDelFicheroFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreDelFicheroFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreDelFicheroFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AutorLabel;
    private javax.swing.JLabel CategoriaLabel;
    private javax.swing.JLabel CrearUnFicheroLabel;
    private javax.swing.JLabel TituloLabel1;
    private javax.swing.JButton aceptarButton;
    private javax.swing.JButton aceptarButton2;
    private javax.swing.JTextField autorField;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton cancelarButton2;
    private javax.swing.JTextField categoriaField;
    private javax.swing.JComboBox<String> extensionComboBox;
    private javax.swing.JFrame ficheroForm;
    private javax.swing.JLabel libroLabel;
    private javax.swing.JTextField nombreDelFicheroField;
    private javax.swing.JLabel nombreDelFicheroLabel;
    private javax.swing.JLabel tipoFicheroLablel;
    private javax.swing.JTextField tituloField;
    // End of variables declaration//GEN-END:variables
}