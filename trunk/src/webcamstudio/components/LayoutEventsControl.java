/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LayoutEventsControl.java
 *
 * Created on 2011-05-27, 23:31:07
 */
package webcamstudio.components;

import java.util.Collection;
import javax.swing.DefaultComboBoxModel;
import webcamstudio.layout.Layout;

/**
 *
 * @author patrick
 */
public class LayoutEventsControl extends javax.swing.JPanel {

    private Layout layout = null;
    private boolean notHuman = true;

    /** Creates new form LayoutEventsControl */
    public LayoutEventsControl(Layout l, Collection<Layout> layouts) {
        initComponents();
        layout = l;

        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Layout temp : layouts) {
            model.addElement(temp.toString());
        }
        cboLayouts.setModel(model);
        spinDuration.setValue(new Integer(layout.getDuration()));
        cboLayouts.setSelectedItem(layout.getNextLayout());
        notHuman = false;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboLayouts = new javax.swing.JComboBox();
        spinDuration = new javax.swing.JSpinner();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("webcamstudio/Languages"); // NOI18N
        jLabel1.setText(bundle.getString("DURATION")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(bundle.getString("NEXT_LAYOUT")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        cboLayouts.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboLayouts.setName("cboLayouts"); // NOI18N
        cboLayouts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLayoutsActionPerformed(evt);
            }
        });

        spinDuration.setName("spinDuration"); // NOI18N
        spinDuration.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinDurationStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboLayouts, 0, 230, Short.MAX_VALUE)
                    .addComponent(spinDuration, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spinDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboLayouts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(226, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboLayoutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLayoutsActionPerformed
        if (!notHuman) {
            if (cboLayouts.getSelectedItem() == null) {
                cboLayouts.setSelectedIndex(0);
            }
            layout.setDuration((Integer) spinDuration.getValue(), cboLayouts.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cboLayoutsActionPerformed

    private void spinDurationStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinDurationStateChanged
        if (!notHuman) {
            if (cboLayouts.getSelectedItem() == null) {
                cboLayouts.setSelectedIndex(0);
            }
            layout.setDuration((Integer) spinDuration.getValue(), cboLayouts.getSelectedItem().toString());
        }
    }//GEN-LAST:event_spinDurationStateChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboLayouts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner spinDuration;
    // End of variables declaration//GEN-END:variables
}