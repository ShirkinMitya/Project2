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
        TextFieldForVariant = new javax.swing.JTextField();
        RadioButtonIsIndex = new javax.swing.JRadioButton();

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

        RadioButtonIsIndex.setText("Выбрать варинат по индексу");
        RadioButtonIsIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonIsIndexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextFieldForVariant, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonExit)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonExport)
                    .addComponent(ButtonImport))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(TextInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RadioButtonIsIndex)
                        .addGap(155, 155, 155))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(FieldPathToFile, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(104, Short.MAX_VALUE))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ButtonExit)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonImport)
                    .addComponent(RadioButtonIsIndex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(TextFieldForVariant, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(ButtonExport)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(TextInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FieldPathToFile, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
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
        if(TextFieldForVariant.getText().trim().isBlank()){
           JOptionPane.showMessageDialog(this, "Укажити вариант");
           return;
        }
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Exel files", "xlsx"));
        int window = fileChooser.showDialog(this, "Выберете файл");
        if (window == JFileChooser.APPROVE_OPTION) {
            try{
                manager.Import(fileChooser.getSelectedFile().getAbsolutePath(), 
                        TextFieldForVariant.getText(), RadioButtonIsIndex.isSelected());
            }catch(NullPointerException | NumberFormatException e){
                 JOptionPane.showMessageDialog(this, "Вариант указан неверно");    
            }catch(NotOfficeXmlFileException | InvalidFormatException e){
                 JOptionPane.showMessageDialog(this, "Указан неверный формат файла");
            } catch (FileNotFoundException e) {
                 JOptionPane.showMessageDialog(this, "Системе не удается найти указанный путь");    
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

    private void RadioButtonIsIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonIsIndexActionPerformed
       
    }//GEN-LAST:event_RadioButtonIsIndexActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonExport;
    private javax.swing.JButton ButtonImport;
    private javax.swing.JTextField FieldPathToFile;
    private javax.swing.JPanel Panel;
    private javax.swing.JRadioButton RadioButtonIsIndex;
    private javax.swing.JTextField TextFieldForVariant;
    private javax.swing.JTextField TextInfo;
    // End of variables declaration//GEN-END:variables
}
