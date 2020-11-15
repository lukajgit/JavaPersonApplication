/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silab.sd.personapp.view.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import silab.sd.personapp.utils.PersonConfiguration;
import silab.sd.personapp.utils.Utils;
import silab.sd.personapp.view.component.InputComboPanel;
import silab.sd.personapp.view.component.InputDateSeparateElements;
import silab.sd.personapp.view.component.InputTextfieldPanel;
import silab.sd.personapp.view.component.validator.impl.RequiredStringValidator;

/**
 *
 * @author lukaj
 */
public class FrmAddPersonDependsOnConfiguration extends javax.swing.JDialog {

    /**
     * Creates new form FrmAddPersonDependsOnConfiguration
     */
    public FrmAddPersonDependsOnConfiguration(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        prepareComponents();
        initComponents();
        setTitle("Add person");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prepareComponents() {
        PersonConfiguration personConfiguration = Utils.getPersonConfiguration();
        InputTextfieldPanel inputFirstname = new InputTextfieldPanel();
        inputFirstname.setValidator(new RequiredStringValidator());
        inputFirstname.getLblText().setText("Firstname:");
        inputFirstname.getLblErrorValue().setText("");
        inputFirstname.setBounds(0, 0, 600, 50);
        this.add(inputFirstname);

        InputTextfieldPanel inputLastname = new InputTextfieldPanel();
        inputLastname.setValidator(new RequiredStringValidator());
        inputLastname.getLblText().setText("Lastname:");
        inputLastname.getLblErrorValue().setText("");
        inputLastname.setBounds(0, 50, 600, 50);
        this.add(inputLastname);

        if(personConfiguration.getGender() == 0) {
            InputTextfieldPanel inputGender = new InputTextfieldPanel();
            inputGender.setValidator(new RequiredStringValidator());
            inputGender.getLblText().setText("Gender:");
            inputGender.getLblErrorValue().setText("");
            inputGender.setBounds(0, 100, 600, 50);
            this.add(inputGender);
        } else {
            InputComboPanel inputGender = new InputComboPanel();
            inputGender.getLblText().setText("Gender");
            inputGender.getLblErrorValue().setText("");
            inputGender.getCbValue().removeAllItems();
            inputGender.getCbValue().addItem("Male");
            inputGender.getCbValue().addItem("Female");
            inputGender.setBounds(0, 100, 600, 50);
            this.add(inputGender);
        }
        
        if(personConfiguration.getBirthday() == 0) {
            InputTextfieldPanel inputBirthday = new InputTextfieldPanel();
            inputBirthday.setValidator(new RequiredStringValidator());
            inputBirthday.getLblText().setText("Birthday:");
            inputBirthday.getLblErrorValue().setText("");
            inputBirthday.setBounds(0, 150, 600, 50);
            this.add(inputBirthday);
        } else {
            InputDateSeparateElements inputBirthday = new InputDateSeparateElements();
            inputBirthday.getLblText().setText("Birthday:");
            inputBirthday.getLblErrorValue().setText("");
            inputBirthday.setBounds(0, 150, 600, 50);
            this.add(inputBirthday);
        }
        
        if(personConfiguration.getMarried() == 0) {
            InputTextfieldPanel inputMarried = new InputTextfieldPanel();
            inputMarried.setValidator(new RequiredStringValidator());
            inputMarried.getLblText().setText("Married:");
            inputMarried.getLblErrorValue().setText("");
            inputMarried.setBounds(0, 200, 600, 50);
            this.add(inputMarried);
        } else {
            InputComboPanel inputMarried = new InputComboPanel();
            inputMarried.getLblText().setText("Married");
            inputMarried.getLblErrorValue().setText("");
            inputMarried.getCbValue().removeAllItems();
            inputMarried.getCbValue().addItem("Yes");
            inputMarried.getCbValue().addItem("No");
            inputMarried.setBounds(0, 200, 600, 50);
            this.add(inputMarried);
        }
        
        JButton btnSave = new JButton();
        btnSave.setBounds(300, 300, 80, 30);
        btnSave.setText("Save");
        this.add(btnSave);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}