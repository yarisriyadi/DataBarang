package pertemuan4_labti;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DataBarang extends javax.swing.JFrame {
    private String[] shnxGetItem(String kodeItem) {
        koneksi connect = new koneksi();
        ResultSet data = null;
        String dataKeluar[] = new String[4];

        String query = "SELECT * FROM pertemuan4 WHERE kode = '" + kodeItem + "'";
        try {
            data = connect.getStatement().executeQuery(query);
            if(data.next()) {
                dataKeluar[0] = data.getString("kode");
                dataKeluar[1] = data.getString("nama");
                dataKeluar[2] = data.getString("jumlah");
                dataKeluar[3] = data.getString("harga");
            } else {
                dataKeluar[0] = "Data tidak ditemukan.";
            }
        } catch(SQLException e) {
            System.out.println("Gagal melakukan query: " + e.getMessage());
        }

        return dataKeluar;
    }
    
    public DataBarang() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtjmlhbrg = new javax.swing.JTextField();
        txthrgbrg = new javax.swing.JTextField();
        btnmskn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbrg = new javax.swing.JTable();
        btndel = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnhpsdata = new javax.swing.JButton();
        btncari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setText("Data Barang");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Jumlah Barang");

        jLabel4.setText("Harga Barang");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        btnmskn.setText("Masukkan Data");
        btnmskn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmsknActionPerformed(evt);
            }
        });

        tblbrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Jumlah Barang", "Harga Barang"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblbrg);

        btndel.setText("Clear");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jLabel5.setText("Kode Barang");

        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnhpsdata.setText("Hapus Data");
        btnhpsdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhpsdataActionPerformed(evt);
            }
        });

        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(223, 223, 223))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txthrgbrg)
                            .addComponent(txtjmlhbrg)
                            .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(txtkode))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmskn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btndel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btncari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnhpsdata, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncari))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmskn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtjmlhbrg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthrgbrg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnupdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(btnhpsdata))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void btnmsknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmsknActionPerformed
        koneksi connect = new koneksi();
        
        String kodeBarang = txtkode.getText();
        String namaBarang = txtnama.getText();
        int hargaBarang = Integer.parseInt(txthrgbrg.getText());
        int jumlahBarang = Integer.parseInt(txtjmlhbrg.getText());
        
        String query = "INSERT INTO pertemuan4( kode, nama, jumlah, harga) VALUES ('"+kodeBarang+"','"+namaBarang+"',"+jumlahBarang+","+hargaBarang+")";
        try {
            connect.getStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Insert Berhasil");
        }  catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Insert Gagal");
        }
    }//GEN-LAST:event_btnmsknActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        // TODO add your handling code here:
       txtnama.setText(""); 
       txtjmlhbrg.setText(""); 
       txthrgbrg.setText("");
       txtkode.requestFocus(); 
    }//GEN-LAST:event_btndelActionPerformed

    private void refreshTableData() {
    koneksi connect = new koneksi();
    ResultSet data = null;
    int jmlLine = 0, i = 0;

    String query = "SELECT * FROM pertemuan4";
    try {
        data = connect.getStatement().executeQuery(query);
        while (data.next()) {
            jmlLine++;
        }
    } catch (SQLException e) {
        // Handle error
    }

    String isi[][] = new String[jmlLine][4];
    try {
        data = connect.getStatement().executeQuery(query);
        while (data.next()) {
            isi[i][0] = data.getString("kode");
            isi[i][1] = data.getString("nama");
            isi[i][2] = data.getString("jumlah");
            isi[i][3] = data.getString("harga");
            i++;
        }
    } catch (SQLException e) {
        // Handle error
    }

    String namaKolom[] = {"Kode", "Nama", "Jumlah", "Harga"};
    DefaultTableModel model = new DefaultTableModel(isi, namaKolom) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Membuat sel di tabel tidak dapat diedit
        }
    };
    tblbrg.setModel(model);
}
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:                                         
    koneksi connect = new koneksi();
    int selectedRow = tblbrg.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Pilih baris dalam tabel untuk diperbarui.");
        return;
    }

    String kodeBrgBaru = txtkode.getText().toUpperCase();
    String nmBrg = txtnama.getText();
    String hrgBrgText = txthrgbrg.getText();
    String stkBrgText = txtjmlhbrg.getText();

    // Periksa apakah ada bidang yang kosong
    if (kodeBrgBaru.isEmpty() || nmBrg.isEmpty() || hrgBrgText.isEmpty() || stkBrgText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Semua bidang harus diisi. Silakan isi kembali.");
        return;
    }

    // Periksa apakah harga dan jumlah hanya diisi dengan angka
    if (!isNumeric(hrgBrgText) || !isNumeric(stkBrgText)) {
        JOptionPane.showMessageDialog(null, "Harga dan jumlah harus diisi dengan angka. Silakan isi ulang.");
        return;
    }

    int hrgBrg = Integer.parseInt(hrgBrgText);
    int stkBrg = Integer.parseInt(stkBrgText);

    String kodeBrgLama = tblbrg.getValueAt(selectedRow, 0).toString();

    // Update nilai dalam tabel berdasarkan teks yang diinput
    tblbrg.getModel().setValueAt(kodeBrgBaru, selectedRow, 0);
    tblbrg.getModel().setValueAt(nmBrg, selectedRow, 1);
    tblbrg.getModel().setValueAt(stkBrg, selectedRow, 2);
    tblbrg.getModel().setValueAt(hrgBrg, selectedRow, 3);

    // Update data di database (dalam blok try-catch)
    String query = "UPDATE pertemuan4 SET kode = '" + kodeBrgBaru + "', nama = '" + nmBrg + "', harga = " + hrgBrg + ", jumlah = " + stkBrg + " WHERE kode = '" + kodeBrgLama + "'";
    try {
        int terUpdate = connect.getStatement().executeUpdate(query);
        if (terUpdate > 0) {
            JOptionPane.showMessageDialog(null, "Berhasil melakukan update.");
        } else {
            JOptionPane.showMessageDialog(null, "Gagal mengupdate barang.");
        }
    } catch (SQLException e) {
        System.out.println("Gagal melakukan query: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Gagal mengupdate barang.");
    }

    refreshTableData();

    }//GEN-LAST:event_btnupdateActionPerformed
private boolean isNumeric(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
               koneksi connect = new koneksi();
        ResultSet data = null;
        int jmlLine = 0, i = 0;

        String query = "SELECT * FROM pertemuan4";
        try {
            data = connect.getStatement().executeQuery(query);
            while(data.next()) jmlLine++;
        } catch (SQLException e) {}

        String isi[][] = new String[jmlLine][4];
        try {
            data = connect.getStatement().executeQuery(query);
            while(data.next()) {
                isi[i][0] = data.getString("kode");
                isi[i][1] = data.getString("nama");
                isi[i][2] = data.getString("jumlah");
                isi[i][3] = data.getString("harga");
                i++;
            }
        } catch(SQLException e) {}

        String namaKolom[] ={"Kode", "Nama", "Jumlah", "Harga"};
        DefaultTableModel model = new DefaultTableModel(isi, namaKolom){};
        tblbrg.setModel(model);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnhpsdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhpsdataActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblbrg.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Pilih baris dalam tabel untuk menghapus data.");
        return;
    }

    int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
    
    if (dialogResult == JOptionPane.YES_OPTION) {
        String kodeBrgLama = tblbrg.getValueAt(selectedRow, 0).toString(); // Ambil kode barang yang akan dihapus
        koneksi connect = new koneksi();

        // Hapus data dari database
        String query = "DELETE FROM pertemuan4 WHERE kode = '" + kodeBrgLama + "'";
        try {
            int terHapus = connect.getStatement().executeUpdate(query);
            if (terHapus > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menghapus data.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal melakukan query: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Gagal menghapus data.");
        }

        refreshTableData();
    }
    }//GEN-LAST:event_btnhpsdataActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
            koneksi connect = new koneksi();
    ResultSet data = null;

    // Mendapatkan kode dari input pengguna
    String kodeCari = txtkode.getText();

    // Query untuk mencari data berdasarkan kode
    String query = "SELECT * FROM pertemuan4 WHERE kode = '" + kodeCari + "'";
    try {
        data = connect.getStatement().executeQuery(query);

        // Inisialisasi variabel untuk menyimpan data dari tabel
        StringBuilder namaBarang = new StringBuilder();
        StringBuilder hargaBarang = new StringBuilder();
        StringBuilder jumlahBarang = new StringBuilder();

        boolean dataDitemukan = false;

        while (data.next()) {
            // Ambil data dari setiap baris dan tambahkan ke StringBuilder
            namaBarang.append(data.getString("nama")).append("\n");
            hargaBarang.append(data.getString("harga")).append("\n");
            jumlahBarang.append(data.getString("jumlah")).append("\n");

            // Setel flag bahwa data ditemukan
            dataDitemukan = true;
        }

        // Tampilkan data di teks area jika data ditemukan
        if (dataDitemukan) {
            txtnama.setText(namaBarang.toString());
            txthrgbrg.setText(hargaBarang.toString());
            txtjmlhbrg.setText(jumlahBarang.toString());
        } else {
            // Jika data tidak ditemukan, berikan notifikasi
            JOptionPane.showMessageDialog(null, "Data dengan kode '" + kodeCari + "' tidak ditemukan.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal mengambil data dari database.");
    }
    }//GEN-LAST:event_btncariActionPerformed

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
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnhpsdata;
    private javax.swing.JButton btnmskn;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblbrg;
    private javax.swing.JTextField txthrgbrg;
    private javax.swing.JTextField txtjmlhbrg;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}