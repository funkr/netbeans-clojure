/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clojure.options;

import java.io.File;
import javax.swing.JFileChooser;
import org.openide.util.NbPreferences;

final class ClojurePanel extends javax.swing.JPanel {

    private final ClojureOptionsPanelController controller;
    private JFileChooser jFileChooser;

    ClojurePanel(ClojureOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLeinpath = new javax.swing.JTextField();
        jBrowseLein = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jReplHost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jReplPort = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(ClojurePanel.class, "ClojurePanel.jLabel1.text")); // NOI18N

        jLeinpath.setText(org.openide.util.NbBundle.getMessage(ClojurePanel.class, "ClojurePanel.jLeinpath.text")); // NOI18N
        jLeinpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLeinpathActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jBrowseLein, org.openide.util.NbBundle.getMessage(ClojurePanel.class, "ClojurePanel.jBrowseLein.text")); // NOI18N
        jBrowseLein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrowseLeinActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(ClojurePanel.class, "ClojurePanel.jLabel2.text")); // NOI18N

        jReplHost.setText(org.openide.util.NbBundle.getMessage(ClojurePanel.class, "ClojurePanel.jReplHost.text")); // NOI18N
        jReplHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReplHostActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(ClojurePanel.class, "ClojurePanel.jLabel3.text")); // NOI18N

        jReplPort.setText(org.openide.util.NbBundle.getMessage(ClojurePanel.class, "ClojurePanel.jReplPort.text")); // NOI18N
        jReplPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReplPortActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(ClojurePanel.class, "ClojurePanel.jLabel4.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jReplHost, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jReplPort, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLeinpath))
                .addGap(18, 18, 18)
                .addComponent(jBrowseLein)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLeinpath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBrowseLein))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jReplHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jReplPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBrowseLeinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrowseLeinActionPerformed

        if (jFileChooser == null) {
            jFileChooser = new JFileChooser();
        }

        if (jFileChooser.showDialog(ClojurePanel.this, "Attach") == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            String s = file.getAbsolutePath();
            jLeinpath.setText(s);

            //Reset the file chooser for the next time it's shown.
            jFileChooser.setSelectedFile(null);
        }
    }//GEN-LAST:event_jBrowseLeinActionPerformed

    private void jLeinpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLeinpathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLeinpathActionPerformed

    private void jReplHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReplHostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jReplHostActionPerformed

    private void jReplPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReplPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jReplPortActionPerformed

    void load() {
        // TODO read settings and initialize GUI
        // Example:        
        // someCheckBox.setSelected(Preferences.userNodeForPackage(ClojurePanel.class).getBoolean("someFlag", false));
        // or for org.openide.util with API spec. version >= 7.4:
        jLeinpath.setText(NbPreferences.forModule(ClojurePanel.class).get("lein_path", ""));
        jReplHost.setText(NbPreferences.forModule(ClojurePanel.class).get("repl_host", "localhost"));
        jReplPort.setText(NbPreferences.forModule(ClojurePanel.class).get("repl_port", "6996"));
        // or:
        // someTextField.setText(SomeSystemOption.getDefault().getSomeStringProperty());
    }

    void store() {
        // TODO store modified settings
        // Example:
        // Preferences.userNodeForPackage(ClojurePanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or for org.openide.util with API spec. version >= 7.4:
        NbPreferences.forModule(ClojurePanel.class).put("lein_path", jLeinpath.getText());
        NbPreferences.forModule(ClojurePanel.class).put("repl_host", jReplHost.getText());
        NbPreferences.forModule(ClojurePanel.class).put("repl_port", jReplPort.getText());
        // or:
        // SomeSystemOption.getDefault().setSomeStringProperty(someTextField.getText());
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBrowseLein;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jLeinpath;
    private javax.swing.JTextField jReplHost;
    private javax.swing.JTextField jReplPort;
    // End of variables declaration//GEN-END:variables
}
