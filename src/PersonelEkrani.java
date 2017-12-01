
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muaz Ahmed
 */
public class PersonelEkrani extends javax.swing.JFrame {
    DefaultListModel DLM=new DefaultListModel();
    /**
     * Creates new form PersonelEkrani
     */
    public PersonelEkrani() {
        initComponents();
        this.setLocationRelativeTo(null);
        jListpersonelinGorevleri.setModel(DLM);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonpersonelinGorevleri = new javax.swing.JButton();
        jButtonPersonelinbirimiNedir = new javax.swing.JButton();
        jLabelPersonelBirimiNedir = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListpersonelinGorevleri = new javax.swing.JList();
        jButtonAnaMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonpersonelinGorevleri.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonpersonelinGorevleri.setForeground(new java.awt.Color(51, 51, 255));
        jButtonpersonelinGorevleri.setText("Personelin Gorevleri");
        jButtonpersonelinGorevleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpersonelinGorevleriActionPerformed(evt);
            }
        });

        jButtonPersonelinbirimiNedir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPersonelinbirimiNedir.setForeground(new java.awt.Color(51, 51, 255));
        jButtonPersonelinbirimiNedir.setText("Personelin Birimi Nedir");
        jButtonPersonelinbirimiNedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPersonelinbirimiNedirActionPerformed(evt);
            }
        });

        jListpersonelinGorevleri.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListpersonelinGorevleri);

        jButtonAnaMenu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAnaMenu.setForeground(new java.awt.Color(51, 51, 255));
        jButtonAnaMenu.setText("Çıkış");
        jButtonAnaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnaMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonpersonelinGorevleri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPersonelinbirimiNedir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPersonelBirimiNedir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAnaMenu, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPersonelinbirimiNedir)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(jLabelPersonelBirimiNedir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonpersonelinGorevleri)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButtonAnaMenu)
                .addGap(122, 122, 122))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ArrayList<Gorev> gorevler=new ArrayList<Gorev>();
    private void jButtonpersonelinGorevleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpersonelinGorevleriActionPerformed
        // TODO add your handling code here:
        Personel p=new Personel();
        p.setIsim(new anaEkrani().jTextFieldAdi.getName());
        for (int i = 0; i < p.personelinGorevleri(p).length; i++) {
            gorevler.add(p.personelinGorevleri(p)[i]);
        }
        for (Gorev gorevler1 : gorevler) {
            DLM.addElement(gorevler1.getGorevAdi());
        }
    }//GEN-LAST:event_jButtonpersonelinGorevleriActionPerformed

    private void jButtonPersonelinbirimiNedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPersonelinbirimiNedirActionPerformed
        // TODO add your handling code here:
        Personel p=new Personel();
        jLabelPersonelBirimiNedir.setText(p.PersonelinbirimiNedir(p).getAdi());
    }//GEN-LAST:event_jButtonPersonelinbirimiNedirActionPerformed

    private void jButtonAnaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnaMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new anaEkrani().setVisible(true);
    }//GEN-LAST:event_jButtonAnaMenuActionPerformed

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
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonelEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnaMenu;
    private javax.swing.JButton jButtonPersonelinbirimiNedir;
    private javax.swing.JButton jButtonpersonelinGorevleri;
    private javax.swing.JLabel jLabelPersonelBirimiNedir;
    private javax.swing.JList jListpersonelinGorevleri;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
