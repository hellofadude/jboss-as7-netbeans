/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.jbossas7.wizard;

import javax.swing.JFileChooser;
import javax.swing.event.ChangeListener;

/**
 *
 * @author kulikov
 */
public class AddServerLocationVisualPanel extends javax.swing.JPanel implements Retriever.Updater {

    private ServerWizardIterator wizardIterator;

    /**
     * Creates new form AddServerLocationVisualPanel
     */
    public AddServerLocationVisualPanel(ServerWizardIterator wizardIterator) {
        this.wizardIterator = wizardIterator;
        initComponents();
        initLocationField();
        setName("Server location");
    }

    private void initLocationField() {
        String path = System.getenv("JBOSS_HOME");
        if (path != null) {
            this.locationField.setText(path);
        }
    }

    public String getServerLocation() {
        return this.locationField.getText();
    }

    public boolean isDomain() {
        return this.domainOption.isSelected();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        locationLabel = new javax.swing.JLabel();
        locationField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        buttonGroupPanel = new javax.swing.JPanel();
        stanaloneOption = new javax.swing.JRadioButton();
        domainOption = new javax.swing.JRadioButton();

        locationLabel.setText(org.openide.util.NbBundle.getMessage(AddServerLocationVisualPanel.class, "AddServerLocationVisualPanel.locationLabel.text")); // NOI18N

        locationField.setText(org.openide.util.NbBundle.getMessage(AddServerLocationVisualPanel.class, "AddServerLocationVisualPanel.locationField.text")); // NOI18N

        browseButton.setText(org.openide.util.NbBundle.getMessage(AddServerLocationVisualPanel.class, "AddServerLocationVisualPanel.browseButton.text")); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        buttonGroupPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(AddServerLocationVisualPanel.class, "AddServerLocationVisualPanel.buttonGroupPanel.border.title"))); // NOI18N

        buttonGroup1.add(stanaloneOption);
        stanaloneOption.setSelected(true);
        stanaloneOption.setText(org.openide.util.NbBundle.getMessage(AddServerLocationVisualPanel.class, "AddServerLocationVisualPanel.stanaloneOption.text")); // NOI18N

        buttonGroup1.add(domainOption);
        domainOption.setText(org.openide.util.NbBundle.getMessage(AddServerLocationVisualPanel.class, "AddServerLocationVisualPanel.domainOption.text")); // NOI18N

        javax.swing.GroupLayout buttonGroupPanelLayout = new javax.swing.GroupLayout(buttonGroupPanel);
        buttonGroupPanel.setLayout(buttonGroupPanelLayout);
        buttonGroupPanelLayout.setHorizontalGroup(
            buttonGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonGroupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stanaloneOption)
                    .addComponent(domainOption))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        buttonGroupPanelLayout.setVerticalGroup(
            buttonGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonGroupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stanaloneOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(domainOption)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonGroupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(locationField, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(locationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonGroupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fileChooser.showDialog(this, "Select");
        if (result == JFileChooser.APPROVE_OPTION) {
            this.locationField.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel buttonGroupPanel;
    private javax.swing.JRadioButton domainOption;
    private javax.swing.JTextField locationField;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JRadioButton stanaloneOption;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateMessageText(String msg) {
    }

    @Override
    public void updateStatusText(String status) {
    }

    @Override
    public void clearCancelState() {
    }

    public void addChangeListener(ChangeListener l) {
//         listeners.add(l);
     }
}
