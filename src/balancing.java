
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ovidu
 */
public class balancing extends javax.swing.JFrame {

    /**
     * Creates new form balancing
     */
    public balancing() {
        initComponents();
        showTable();
        
    }
    
    public ArrayList<Balsum> balSum(){
        ArrayList<Balsum> balSum1 = new ArrayList<>();
        Connection conn = MysqlConnect.connectDB();
        //String sql="select * from ss where fno=?";
        try{
            String sql="select * from temp";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Balsum bal;
            while(rs.next()){
                bal = new Balsum(rs.getString("date"), rs.getString("fno"),rs.getString("type"),rs.getInt("qty"), rs.getFloat("uprice"), rs.getFloat("bal"));
                balSum1.add(bal);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return balSum1;
    }
    public void showTable(){
        ArrayList<Balsum> list = balSum();
        DefaultTableModel model = (DefaultTableModel)temp1.getModel();
        Object[] row = new Object[6];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getdate();
            row[1]=list.get(i).getfno();
            row[2]=list.get(i).gettype();
            row[3]=list.get(i).getqty();
            row[4]=list.get(i).getunitprice();
            row[5]=list.get(i).getbalance();
            model.addRow(row);
                    
                    
        }
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
        up = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fno = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        temp1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stationary Items Entry");
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(700, 450));
        setPreferredSize(new java.awt.Dimension(700, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 450));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        up.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Unit Price");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Qty");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("FORM NUMBER / ITEM CODE");

        fno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        qty.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Stationary Items IN/OUT");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setLabel("IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(up)
                            .addComponent(qty)
                            .addComponent(fno))))
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(up)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(23, 23, 23))
        );

        temp1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        temp1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Form Number", "Type", "Qty", "Unit Price", "Balance"
            }
        ));
        jScrollPane1.setViewportView(temp1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(716, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection conn = MysqlConnect.connectDB();
        String sql="select * from ss where fno=?";
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,fno.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String units = rs.getString("units");
                String cost = rs.getString("cost");
                int u1 = Integer.parseInt(units);
                int c1 = Integer.parseInt(cost);
                try{
                    Connection conn1 = MysqlConnect.connectDB();
                    String formno = fno.getText().trim();
                    String q = qty.getText();
                    String u = up.getText();
                    int u2 = Integer.parseInt(q);
                    int c2 = Integer.parseInt(u);
                    int u3 = u1+u2;
                    int c3 = c1+(u2*c2);
                    String u4 = Integer.toString(u3);
                    String c4 = Integer.toString(c3);
                    String c5 = Integer.toString(u2*c2);
                    String sql1 = "update ss set units = ?, cost = ? where fno = ?";
                    PreparedStatement pst1 = conn.prepareStatement(sql1);
                    pst1.setString(3,formno);
                    pst1.setString(1,u4);
                    pst1.setString(2,c4);

                    String sql2 = "insert into stballog (fno, type,qty, bal) values (?,?,?,?)";
                    PreparedStatement pst2 = conn.prepareStatement(sql2);
                    pst2.setString(1,formno);
                    pst2.setString(2,"in");
                    pst2.setString(3,q);
                    pst2.setString(4,c5);

                    String sql3 = "insert into temp (fno, type,qty,uprice, bal) values (?,?,?,?,?)";
                    PreparedStatement pst3 = conn.prepareStatement(sql3);
                    pst3.setString(1,formno);
                    pst3.setString(2,"in");
                    pst3.setString(3,q);
                    pst3.setString(4,u);
                    pst3.setString(5,c5);

                    pst.execute();
                    pst1.execute();
                    pst2.execute();
                    pst3.execute();

                    JOptionPane.showMessageDialog(rootPane, "Stationary item In Successfully");
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(rootPane, "Invaild Entry");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "No Record Found.","Access Denied",JOptionPane.ERROR_MESSAGE);
            }
            DefaultTableModel model = (DefaultTableModel)temp1.getModel();
            model.setRowCount(0);
            showTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection conn = MysqlConnect.connectDB();
        String sql="select * from ss where fno=?";
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,fno.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String units = rs.getString("units");
                String cost = rs.getString("cost");
                int u1 = Integer.parseInt(units);
                int c1 = Integer.parseInt(cost);
                try{
                    Connection conn1 = MysqlConnect.connectDB();
                    String formno = fno.getText().trim();
                    String q = qty.getText();
                    String u = up.getText();
                    int u2 = Integer.parseInt(q);
                    int c2 = Integer.parseInt(u);
                    int u3 = u1-u2;
                    int c3 = c1-(u2*c2);

                    String c5 = Integer.toString(u2*c2);
                    String u4 = Integer.toString(u3);
                    String c4 = Integer.toString(c3);
                    String sql1 = "update ss set units = ?, cost = ? where fno = ?";
                    PreparedStatement pst1 = conn.prepareStatement(sql1);
                    pst1.setString(3,formno);
                    pst1.setString(1,u4);
                    pst1.setString(2,c4);

                    String sql2 = "insert into stballog (fno, type, qty, bal) values (?,?,?,?)";
                    PreparedStatement pst2 = conn.prepareStatement(sql2);
                    pst2.setString(1,formno);
                    pst2.setString(2,"out");
                    pst2.setString(3,q);
                    pst2.setString(4,c5);

                    String sql3 = "insert into temp (fno, type,qty,uprice, bal) values (?,?,?,?,?)";
                    PreparedStatement pst3 = conn.prepareStatement(sql3);
                    pst3.setString(1,formno);
                    pst3.setString(2,"out");
                    pst3.setString(3,q);
                    pst3.setString(4,u);
                    pst3.setString(5,c5);

                    pst.execute();
                    pst1.execute();
                    pst2.execute();
                    pst3.execute();

                    JOptionPane.showMessageDialog(rootPane, "Stationary item In Successfully");
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(rootPane, "Invaild Entry");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "No Record Found.","Access Denied",JOptionPane.ERROR_MESSAGE);
            }
            DefaultTableModel model = (DefaultTableModel)temp1.getModel();
            model.setRowCount(0);
            showTable();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        sbal w = new sbal();
        w.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(balancing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(balancing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(balancing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(balancing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new balancing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField qty;
    private javax.swing.JTable temp1;
    private javax.swing.JTextField up;
    // End of variables declaration//GEN-END:variables
}
