
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Kayit_Ekrani extends javax.swing.JFrame {
    
    Baglanti_kurma baglanti = new Baglanti_kurma();

    /**
     * Creates new form Kayit_Ekrani
     */
    public Kayit_Ekrani() {
        initComponents();
        setSize(770, 600);
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
        sevilentüruc = new javax.swing.JComboBox<>();
        sevilentüriki = new javax.swing.JComboBox<>();
        sevilentürbir = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dogumTarihi = new javax.swing.JTextField();
        yeniKullaniciAdi = new javax.swing.JTextField();
        mesajkutusu = new javax.swing.JLabel();
        kaydet = new javax.swing.JButton();
        yeniKullaniciParola = new javax.swing.JPasswordField();
        yenimail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        alt = new javax.swing.JButton();
        cikis = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        sevilentüruc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Aksiyon ve Macera", "Bilim Kurgu ve Fantastik Yapimlar", "Romantik", "Drama", "Cocuk ve Aile", "Belgesel", "Komedi", "Aksiyon", "Korku", "Bilim ve Doga", "Gerilim", "Anime", "Reality Program", "Bilim Kurgu" }));
        jPanel1.add(sevilentüruc);
        sevilentüruc.setBounds(530, 360, 180, 30);

        sevilentüriki.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Aksiyon ve Macera", "Bilim Kurgu ve Fantastik Yapimlar", "Romantik", "Drama", "Cocuk ve Aile", "Belgesel", "Komedi", "Aksiyon", "Korku", "Bilim ve Doga", "Gerilim", "Anime", "Reality Program", "Bilim Kurgu" }));
        sevilentüriki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevilentürikiActionPerformed(evt);
            }
        });
        jPanel1.add(sevilentüriki);
        sevilentüriki.setBounds(530, 310, 180, 30);

        sevilentürbir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Aksiyon ve Macera", "Bilim Kurgu ve Fantastik Yapimlar", "Romantik", "Drama", "Cocuk ve Aile", "Belgesel", "Komedi", "Aksiyon", "Korku", "Bilim ve Doga", "Gerilim", "Anime", "Reality Program", "Bilim Kurgu" }));
        jPanel1.add(sevilentürbir);
        sevilentürbir.setBounds(530, 260, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Begenilen Türler :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(530, 220, 170, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("KULLANICI ADI :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 320, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DOGUM TARIHI :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 370, 130, 30);

        dogumTarihi.setBackground(new java.awt.Color(204, 204, 204));
        dogumTarihi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dogumTarihi.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(dogumTarihi);
        dogumTarihi.setBounds(270, 370, 220, 30);

        yeniKullaniciAdi.setBackground(new java.awt.Color(204, 204, 204));
        yeniKullaniciAdi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yeniKullaniciAdi.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(yeniKullaniciAdi);
        yeniKullaniciAdi.setBounds(270, 320, 220, 30);

        mesajkutusu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mesajkutusu.setForeground(new java.awt.Color(255, 0, 0));
        mesajkutusu.setText("!!! Dogum tarihi ornek giris : 1999-07-07");
        jPanel1.add(mesajkutusu);
        mesajkutusu.setBounds(210, 420, 400, 32);

        kaydet.setBackground(new java.awt.Color(229, 9, 20));
        kaydet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kaydet.setText("BİLGİLERİ KAYDET");
        kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetActionPerformed(evt);
            }
        });
        jPanel1.add(kaydet);
        kaydet.setBounds(320, 480, 220, 64);

        yeniKullaniciParola.setBackground(new java.awt.Color(204, 204, 204));
        yeniKullaniciParola.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yeniKullaniciParola.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(yeniKullaniciParola);
        yeniKullaniciParola.setBounds(270, 270, 220, 30);

        yenimail.setBackground(new java.awt.Color(204, 204, 204));
        yenimail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yenimail.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(yenimail);
        yenimail.setBounds(270, 220, 220, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("YENİ SİFRE :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 270, 120, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("YENİ E-POSTA :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 220, 150, 30);

        jPanel3.setBackground(new java.awt.Color(229, 9, 20));
        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 90, 600);

        jPanel2.setBackground(new java.awt.Color(229, 9, 20));
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("REGISTER");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(190, 30, 200, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(120, 20, 64, 64);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 50, 790, 100);

        alt.setBackground(new java.awt.Color(204, 204, 0));
        alt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        alt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-minimize-window-48.png"))); // NOI18N
        alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altActionPerformed(evt);
            }
        });
        jPanel1.add(alt);
        alt.setBounds(660, 10, 34, 34);

        cikis.setBackground(new java.awt.Color(204, 204, 0));
        cikis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-window-48.png"))); // NOI18N
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });
        jPanel1.add(cikis);
        cikis.setBounds(710, 10, 34, 34);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-close-64.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(250, 480, 64, 64);

        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(200, 430, 430, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 600);

        setSize(new java.awt.Dimension(853, 606));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetActionPerformed
        String yenimail = this.yenimail.getText();
        String yeniKullaniciParola = new String(this.yeniKullaniciParola.getPassword());
        String yeniKullaniciAdi = this.yeniKullaniciAdi.getText();
        String dogumTarihi = this.dogumTarihi.getText();
        String birincitur =  (String) sevilentürbir.getSelectedItem();
        String ikincitur = (String) sevilentüriki.getSelectedItem();
        String ucuncutur = (String) sevilentüruc.getSelectedItem();
        
        if(yenimail.equalsIgnoreCase("") || yeniKullaniciParola.equalsIgnoreCase("") || yeniKullaniciAdi.equalsIgnoreCase("") || dogumTarihi.equalsIgnoreCase("") || birincitur.equalsIgnoreCase("...") || ikincitur.equalsIgnoreCase("...") || ucuncutur.equalsIgnoreCase("...")){
            JOptionPane.showMessageDialog(this, "Lutfen butun bilgileri eksiksiz giriniz!!!");
        }else{
            System.out.println(yenimail + "\n" + yeniKullaniciParola + "\n" + yeniKullaniciAdi + "\n" + dogumTarihi);
        
            boolean kontrol = baglanti.kontrol(yenimail, yeniKullaniciParola);
            /*if(kontrol){
                System.out.println("sefa mert");
            }
            else{
                System.out.println("sefa mertrt");
            }*/
        
        
            if(kontrol){
                mesajkutusu.setText("Bu kullanici adi veya sifre zaten mevcut");
            }else{
                baglanti.kullaniciEkle(yeniKullaniciAdi ,yeniKullaniciParola ,yenimail ,dogumTarihi);
            
            
            
                /*String kullaniciId =Integer.toString(baglanti.kullaniciIdBul(yenimail)) ;*/
            
            
                mesajkutusu.setText("Yeni kullanici basarili bir sekilde kayit edildi");
            
                setVisible(false);
                new sevilen_tur_sergile(birincitur, ikincitur, ucuncutur).setVisible(true);
                //baglanti.sevilenTurEkle(birincitur ,ikincitur ,ucuncutur ,kullaniciId);
            
           
                //setVisible(false);
            }
        }
            
        
        
        
    }//GEN-LAST:event_kaydetActionPerformed

    private void sevilentürikiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevilentürikiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sevilentürikiActionPerformed

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cikisActionPerformed

    private void altActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_altActionPerformed

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
            java.util.logging.Logger.getLogger(Kayit_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kayit_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kayit_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kayit_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kayit_Ekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alt;
    private javax.swing.JButton cikis;
    private javax.swing.JTextField dogumTarihi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton kaydet;
    private javax.swing.JLabel mesajkutusu;
    private javax.swing.JComboBox<String> sevilentürbir;
    private javax.swing.JComboBox<String> sevilentüriki;
    private javax.swing.JComboBox<String> sevilentüruc;
    private javax.swing.JTextField yeniKullaniciAdi;
    private javax.swing.JPasswordField yeniKullaniciParola;
    private javax.swing.JTextField yenimail;
    // End of variables declaration//GEN-END:variables
}
