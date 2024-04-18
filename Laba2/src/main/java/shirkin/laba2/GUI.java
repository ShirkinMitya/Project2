package shirkin.laba2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
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
        TextFieldForVariant = new javax.swing.JTextField();
        RadioButtonIsIndex = new javax.swing.JRadioButton();
        LabelVariant = new javax.swing.JLabel();

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

        RadioButtonIsIndex.setText("Выбрать варинат числом");
        RadioButtonIsIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonIsIndexActionPerformed(evt);
            }
        });

        LabelVariant.setText("Введите вариант текстом");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(LabelVariant, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonExit)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(TextFieldForVariant, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RadioButtonIsIndex)
                .addGap(47, 47, 47))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ButtonImport))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(ButtonExport)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(ButtonExit))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(LabelVariant, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(ButtonImport))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldForVariant, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RadioButtonIsIndex))))
                .addGap(64, 64, 64)
                .addComponent(ButtonExport)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonImportActionPerformed
        if (TextFieldForVariant.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(this, "Укажите вариант");
            return;
        }
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Exel files", "xlsx"));
        int window = fileChooser.showDialog(this, "Выберете файл");
        if (window == JFileChooser.APPROVE_OPTION) {
            try {
                manager.Import(fileChooser.getSelectedFile().getAbsolutePath(),
                        TextFieldForVariant.getText(), RadioButtonIsIndex.isSelected());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Вариант указан неверно(укажите число)");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(this, "Вариант указан неверно");
            } catch (NotOfficeXmlFileException e) {
                JOptionPane.showMessageDialog(this, "Указан неверный формат файла");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(this, "Вариант указан неверно(нет листа по такому индексу)");
            } catch (IllegalStateException e) {
                JOptionPane.showMessageDialog(this, "Выбран не тот файл");
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this, "Системе не удается найти указанный путь");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Произошла ошибка при чтении файла");
            }
        }
    }//GEN-LAST:event_ButtonImportActionPerformed

    private void ButtonExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExportActionPerformed
        if (manager.getStorage().getData().isEmpty()) {
            JOptionPane.showMessageDialog(this, "вы ещё не загрузили данные");
            return;
        }
        JFileChooser fileChooser = new JFileChooser();
        int window = fileChooser.showDialog(this, "Выберете файл");
        if (window == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            if (!filePath.toLowerCase().endsWith(".xlsx")) {
                filePath += ".xlsx";
            }
            try {
                manager.Export(filePath);
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Произошла ошибка при записи файла");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Произошла ошибка при записи файла");
            }
        }
    }//GEN-LAST:event_ButtonExportActionPerformed

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void RadioButtonIsIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonIsIndexActionPerformed
        if (RadioButtonIsIndex.isSelected() == true) {
            LabelVariant.setText("Введите вариант числом");
        }
        if (RadioButtonIsIndex.isSelected() == false) {
            LabelVariant.setText("Введите вариант текстом");
        }
    }//GEN-LAST:event_RadioButtonIsIndexActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonExport;
    private javax.swing.JButton ButtonImport;
    private javax.swing.JLabel LabelVariant;
    private javax.swing.JPanel Panel;
    private javax.swing.JRadioButton RadioButtonIsIndex;
    private javax.swing.JTextField TextFieldForVariant;
    // End of variables declaration//GEN-END:variables
}
