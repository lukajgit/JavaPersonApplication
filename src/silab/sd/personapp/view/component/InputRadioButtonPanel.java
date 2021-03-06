/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silab.sd.personapp.view.component;

import javax.swing.ButtonGroup;

/**
 *
 * @author lukaj
 */
public class InputRadioButtonPanel extends javax.swing.JPanel implements GetValue {

    /**
     * Creates new form InputRadioButtonPanel
     */
    public InputRadioButtonPanel() {
        initComponents();
        group = new ButtonGroup();
        radioValue1.setSelected(true);
        group.add(radioValue1);
        group.add(radioValue2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblText = new javax.swing.JLabel();
        radioValue1 = new javax.swing.JRadioButton();
        radioValue2 = new javax.swing.JRadioButton();

        lblText.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(radioValue1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioValue2)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioValue2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioValue1)
                        .addComponent(lblText)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblText;
    private javax.swing.JRadioButton radioValue1;
    private javax.swing.JRadioButton radioValue2;
    // End of variables declaration//GEN-END:variables
    private ButtonGroup group;

    @Override
    public Object getValue() throws Exception {
        if(radioValue1.isSelected()) return radioValue1.getText();
        else
            return radioValue2.getText();
    }

}
