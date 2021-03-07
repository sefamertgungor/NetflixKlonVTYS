
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sefa Mert
 */
public class Ana_Ekran extends javax.swing.JFrame {
    
    public long startTime;
    public long endTime;
    private int kullanici_id;
    public String puan_degeri;
    
    DefaultTableModel model;
    DefaultTableModel model2;
    Baglanti_kurma baglanti = new Baglanti_kurma();
    
    private String mail;

    /**
     * Creates new form Ana_Ekran
     */
    public Ana_Ekran(String mail) {
        initComponents();
        kullanici_id = baglanti.kullaniciIdBul(mail);
        String kullanici_isim = baglanti.kullanici_isim_dondur(kullanici_id);
        kullaniciismi_basma.setText(kullanici_isim);
        model = (DefaultTableModel) tablo.getModel();
        model2 = (DefaultTableModel) Bolum_sayisi.getModel();
        System.out.println(mail);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tur_ara = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        exit = new javax.swing.JButton();
        izle_butonu = new javax.swing.JButton();
        mesaj_kutusu = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Bolum_sayisi = new javax.swing.JTable();
        film_sec = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        kullaniciismi_basma = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Ara = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-minimize-window-48.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1020, 20, 34, 34);

        jLabel1.setBackground(new java.awt.Color(255, 13, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/netflix_asil1.jpg"))); // NOI18N
        jLabel1.setText("NETFLIX");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(580, 60, 420, 120);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-48.png"))); // NOI18N
        jLabel5.setText("jLabel2");
        jLabel5.setToolTipText("");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(0, 0, 48, 48);

        tur_ara.setBackground(new java.awt.Color(102, 102, 102));
        tur_ara.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(tur_ara);
        tur_ara.setBounds(50, 0, 280, 50);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(40, 110, 330, 48);

        tablo.setBackground(new java.awt.Color(0, 0, 0));
        tablo.setForeground(new java.awt.Color(255, 255, 255));
        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PROGRAM ISMI", "TIP", "BOLUM SAYISI", "UZUNLUG", "PUAN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablo.setGridColor(new java.awt.Color(153, 153, 153));
        tablo.setSelectionBackground(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(tablo);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 300, 830, 220);

        exit.setBackground(new java.awt.Color(255, 13, 0));
        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-window-48.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(1060, 20, 34, 34);

        izle_butonu.setBackground(new java.awt.Color(229, 9, 20));
        izle_butonu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        izle_butonu.setText("IZLE");
        izle_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izle_butonuActionPerformed(evt);
            }
        });
        jPanel1.add(izle_butonu);
        izle_butonu.setBounds(740, 190, 170, 64);

        mesaj_kutusu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        mesaj_kutusu.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(mesaj_kutusu);
        mesaj_kutusu.setBounds(700, 230, 320, 40);

        Bolum_sayisi.setBackground(new java.awt.Color(0, 0, 0));
        Bolum_sayisi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Bolum_sayisi.setForeground(new java.awt.Color(255, 255, 255));
        Bolum_sayisi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOLUM"
            }
        ));
        Bolum_sayisi.setSelectionBackground(new java.awt.Color(255, 0, 0));
        jScrollPane2.setViewportView(Bolum_sayisi);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(200, 520, 440, 140);

        film_sec.setBackground(new java.awt.Color(229, 9, 20));
        film_sec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        film_sec.setText("BOLUM SECMEK ICIN TIKLA");
        film_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                film_secActionPerformed(evt);
            }
        });
        jPanel1.add(film_sec);
        film_sec.setBounds(860, 380, 260, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/computer.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(670, 190, 64, 64);

        kullaniciismi_basma.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        kullaniciismi_basma.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(kullaniciismi_basma);
        kullaniciismi_basma.setBounds(180, 20, 240, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kullanici Adi :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 20, 120, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 20, 40, 40);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Lutfen film ve ardindan bolum seciniz...");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 210, 550, 30);

        Ara.setBackground(new java.awt.Color(255, 0, 0));
        Ara.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ara.setForeground(new java.awt.Color(255, 255, 255));
        Ara.setText("ARA");
        Ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AraActionPerformed(evt);
            }
        });
        jPanel1.add(Ara);
        Ara.setBounds(410, 110, 110, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1130, 730);

        setSize(new java.awt.Dimension(1127, 726));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void izle_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izle_butonuActionPerformed
        
        
        
        int tablosatir=tablo.getSelectedRow();
        int tablosatir2 = Bolum_sayisi.getSelectedRow();
        int bolum = tablosatir2+1;
        if(tablosatir<0 || tablosatir2<0){
            System.out.println("Lutfen iki secimi de yapniz!!!");
            JOptionPane.showMessageDialog(this, "Lutfen film ve bolum seciminizi yapiniz!!!");
        }
        else{
            Date simdikiZaman = new Date();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
            String programid = String.valueOf(tablo.getValueAt(tablosatir,0));
            int program_id = Integer.parseInt(programid);
            double sure;
            
            boolean kontrol = baglanti.program_id_kullanici_id_kontrol(kullanici_id, program_id, bolum);
            if(kontrol){
                sure = baglanti.izleme_suresi_bul(kullanici_id, program_id, bolum);
            }else{
                sure = 0;
            }
            
            model2.setRowCount(0);
            new izleme(kullanici_id,program_id,df.format(simdikiZaman),bolum,sure).setVisible(true);
        }
        
        
        
        
        
    }//GEN-LAST:event_izle_butonuActionPerformed

    private void film_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_film_secActionPerformed
        int tablosatir=tablo.getSelectedRow();
        if(tablosatir<0){
            JOptionPane.showMessageDialog(this, "Lutfen tablodan film seciniz !!!");
        }else{
            int bolum_sayisi = (int) tablo.getValueAt(tablosatir, 3);
            int program_id = (int) tablo.getValueAt(tablosatir, 0);
        
            if(bolum_sayisi != 1){
                model2.setRowCount(0);
                for(int i=0;i<5;i++){
                    Object[] eklenecek = {i+1};
                    model2.addRow(eklenecek);
                }
            }
            else{
                model2.setRowCount(0);
                Object[] eklenecek = {1};
                model2.addRow(eklenecek);
            }
        }
        
        
    }//GEN-LAST:event_film_secActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AraActionPerformed
        model.setRowCount(0);
        model2.setRowCount(0);
        ArrayList<program_tutma> turu = new ArrayList<program_tutma>();
        String aranan = tur_ara.getText();
        turu = baglanti.programAdiBul(aranan);
        
        if(turu != null){
            for(program_tutma p : turu){
                Object[] eklenecek = {p.getId(), p.getProgram_ismi(), p.getProgram_tipi(), p.getProgram_bolum(), p.getProgram_uzunlugu(), p.getProgram_puan()};
                model.addRow(eklenecek);
            }
        }
    }//GEN-LAST:event_AraActionPerformed

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
            java.util.logging.Logger.getLogger(Ana_Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ana_Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ana_Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ana_Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Ana_Ekran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ara;
    private javax.swing.JTable Bolum_sayisi;
    private javax.swing.JButton exit;
    private javax.swing.JButton film_sec;
    private javax.swing.JButton izle_butonu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel kullaniciismi_basma;
    private javax.swing.JLabel mesaj_kutusu;
    private javax.swing.JTable tablo;
    private javax.swing.JTextField tur_ara;
    // End of variables declaration//GEN-END:variables
}
