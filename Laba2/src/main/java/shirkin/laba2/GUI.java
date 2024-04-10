package shirkin.laba2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException;

public class GUI extends javax.swing.JFrame {

    Manager manager = new Manager();

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        ButtonExport = new javax.swing.JButton();
        ButtonImport = new javax.swing.JButton();
        ButtonExit = new javax.swing.JButton();
        FieldPathToFile = new javax.swing.JTextField();
        TextInfo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonExport.setText("Экспорт");
        ButtonExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExportActionPerformed(evt);
            }
        });

        ButtonImport.setText("Импорт");
        ButtonImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonImportActionPerformed(evt);
            }
        });

        ButtonExit.setText("Выход");
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });

        FieldPathToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPathToFileActionPerformed(evt);
            }
        });

        TextInfo.setText("Введите путь к файлу");
        TextInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonExport)
                    .addComponent(ButtonImport))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonExit)
                        .addContainerGap())
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(TextInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(193, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(FieldPathToFile, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonExit)
                .addGap(32, 32, 32)
                .addComponent(ButtonImport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(ButtonExport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldPathToFile, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(TextInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonImportActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Exel files", "xlsx"));
        int window = fileChooser.showDialog(this, "Выберете файл");
        if (window == JFileChooser.APPROVE_OPTION) {
            try {
                manager.Import(fileChooser.getSelectedFile().getAbsolutePath());
            }catch(NotOfficeXmlFileException | InvalidFormatException e){
                 JOptionPane.showMessageDialog(null, "Указан неверный формат файла");
            } catch (FileNotFoundException e) {
                 JOptionPane.showMessageDialog(null, "Системе не удается найти указанный путь");    
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Произошла ошибка при чтении файла");
        }
        }
    }//GEN-LAST:event_ButtonImportActionPerformed

    private void ButtonExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExportActionPerformed
        if(manager.getStorage().getData().isEmpty()){
            JOptionPane.showMessageDialog(this, "вы ещё не загрузили данные");
            return;
        }
        File file = new File(FieldPathToFile.getText());
        if (!file.isAbsolute()) {
            JOptionPane.showMessageDialog(this, "Вы не указали путь");
            return;
        }   
        try {
            manager.Export(FieldPathToFile.getText());
        }catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Вы неверно указали путь для сохранения");   
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Произошла ошибка при записи файла");
        }
    }//GEN-LAST:event_ButtonExportActionPerformed

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void FieldPathToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPathToFileActionPerformed

    }//GEN-LAST:event_FieldPathToFileActionPerformed

    private void TextInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextInfoActionPerformed

    }//GEN-LAST:event_TextInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonExport;
    private javax.swing.JButton ButtonImport;
    private javax.swing.JTextField FieldPathToFile;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField TextInfo;
    // End of variables declaration//GEN-END:variables
}
