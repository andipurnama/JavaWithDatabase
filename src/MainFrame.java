/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Main;



import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Andi Purnama 
 */
public class MainFrame extends javax.swing.JFrame {
    


    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNIM = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        tfKelas = new javax.swing.JTextField();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        tfAlamat = new javax.swing.JTextField();
        tfNilai = new javax.swing.JTextField();
        rbLulus = new javax.swing.JRadioButton();
        rbTidaklulus = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form Pengisian Nilai Mahasiswa");

        jLabel2.setText("NIM");

        jLabel3.setText("Nama");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Kelas");

        jLabel6.setText("Alamat");

        jLabel7.setText("Nilai");

        buttonGroup1.add(rbLaki);
        rbLaki.setText("Laki Laki");

        buttonGroup1.add(rbPerempuan);
        rbPerempuan.setText("Perempuan");

        jLabel8.setText("Keterangan");

        buttonGroup2.add(rbLulus);
        rbLulus.setText("LULUS");
        rbLulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLulusActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbTidaklulus);
        rbTidaklulus.setText("TIDAK LULUS");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNama)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(rbLaki)
                        .addGap(41, 41, 41)
                        .addComponent(rbPerempuan))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbLulus)
                                .addGap(52, 52, 52)
                                .addComponent(rbTidaklulus))
                            .addComponent(tfNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rbLaki)
                            .addComponent(rbPerempuan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addComponent(tfNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rbLulus)
                    .addComponent(rbTidaklulus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbLulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLulusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLulusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int nim = Integer.valueOf(tfNIM.getText());
        String nama = tfNama.getText();
        String kelamin ;
        if ( rbLaki.isSelected()){
            kelamin = "Laki - Laki";
        }
        else {
            kelamin  = "Perempuan";
        }
        String kelas = tfKelas.getText();
        String alamat = tfAlamat.getText();
        float nilai = Float.valueOf(tfNilai.getText());
        String keterangan ;
        if ( rbLulus.isSelected()){
            keterangan = "LULUS";
        }
        else{
            keterangan = "TIDAK LULUS";
        }
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String username = "root";
            String password = "admin";
            Connection koneksi = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/mahasiswa", username, password);
            
            System.out.println("Koneksi Berhasil");
            
            Statement statement = (Statement) koneksi.createStatement();
            statement.executeUpdate ("INSERT INTO nilai_mahasiswa"
                + "(NIM, Nama, Jenis_Kelamin, Kelas, Alamat, Nilai, Keterangan )"
                + "VALUES ('"+nim+"', '"+nama+"', '"+kelamin+"', '"+kelas+"',"
                + " '"+alamat+"', '"+nilai+"', '"+keterangan+"' );"
            );
            
            System.out.println("Statement Success");
            JOptionPane.showMessageDialog(this, "Submit Berhasil");
        }    
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException x){
            System.out.print(x);
        }

       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbLulus;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JRadioButton rbTidaklulus;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfKelas;
    private javax.swing.JTextField tfNIM;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNilai;
    // End of variables declaration//GEN-END:variables
/*public void Koneksi(){
        int nim = Integer.valueOf(tfNIM.getText());
        String nama = tfNama.getText();
        String kelamin = null;
        if ( rbLaki.isSelected()){
            kelamin = "Laki - Laki";
        }
        if ( rbPerempuan.isSelected()) {
            kelamin  = "Perempuan";
        }
        String kelas = tfKelas.getText();
        String alamat = tfAlamat.getText();
        String nilai = tfNilai.getText();
        String keterangan = null;
        if ( rbLulus.isSelected()){
            keterangan = "LULUS";
        }
        if ( rbTidaklulus.isSelected()) {
            keterangan = "TIDAK LULUS";
        }
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            final String username = "root";
            final String password = "admin";
            final Connection koneksi = DriverManager.getConnection(
                    "jbdc:mysql://localhost/mahasiswa", username, password);
            System.out.println("Koneksi Berhasil");
            JOptionPane.showMessageDialog(this, "Submit Berhasil");
            
            Statement statement = koneksi.createStatement();
            statement.executeUpdate ("INSERT INTO nilai_mahasiswa"
                + "(NIM, Nama, Jenis Kelamin, Kelas, Alamat, Nilai, Keterangan )"
                + "(VALUES ('"+nim+"', '"+nama+"', '"+kelamin+"', '"+kelas+"',"
                    + " '"+alamat+"', '"+nilai+"', '"+keterangan+"' );"
            );
            
        }    
        
        catch (final SQLException ex) {
        } catch (final InstantiationException ex) {
            System.out.print(ex);
        } catch (final IllegalAccessException ex) {
            System.out.print(ex);
        } catch (final ClassNotFoundException ex) {
            System.out.print(ex);
        }
}*/
}

