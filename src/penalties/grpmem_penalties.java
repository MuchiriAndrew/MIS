package penalties;

import java.sql.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;  

public class grpmem_penalties extends javax.swing.JFrame {

   
    public grpmem_penalties() {
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

        jLabel4 = new javax.swing.JLabel();
        memid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        timeamt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        amt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        memname = new javax.swing.JLabel();
        transtype = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        grpid = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Penalty Amount:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 266, -1, -1));

        memid.setForeground(new java.awt.Color(0, 0, 0));
        memid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                memidFocusLost(evt);
            }
        });
        getContentPane().add(memid, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 112, 150, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 303, -1, -1));

        date.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 300, 150, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GROUP MEMBER PENALTIES FOR DEFAULTED PAYMENTS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Months defaulted");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 226, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 115, -1, -1));

        timeamt.setForeground(new java.awt.Color(0, 0, 0));
        timeamt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                timeamtFocusLost(evt);
            }
        });
        getContentPane().add(timeamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 226, 150, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Transaction Type");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 75, -1, -1));

        amt.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 266, 150, 16));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Member Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 152, -1, -1));

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("FINISH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 353, -1, -1));

        memname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(memname, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 152, 150, 22));

        transtype.setForeground(new java.awt.Color(0, 0, 0));
        transtype.setText("PEN");
        getContentPane().add(transtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 72, 150, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Group ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 192, 79, -1));

        grpid.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(grpid, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 192, 150, 16));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdbcimage.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_memidFocusLost
        // TODO add your handling code here:

        try
        {
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mwanzo","Muchiri","Muchiri1234!");

            String name="select*from mem_reg where mem_id = ?";
            PreparedStatement pstmt3= conn.prepareStatement(name);
            pstmt3.setInt(1,Integer.parseInt(memid.getText()));

            ResultSet resultset = pstmt3.executeQuery();

            if(resultset.next()==false)
            {
                JOptionPane.showMessageDialog(null,"Member does not exist");
            }
            else
            {
                do
                {
                    memname.setText(resultset.getString("mem_name"));
                    int x= resultset.getInt("grp_id");
                    grpid.setText(Integer.toString(x));
                }
                while(resultset.next());
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_memidFocusLost

    private void timeamtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timeamtFocusLost
        // TODO add your handling code here:

        int x=Integer.parseInt(timeamt.getText());
        double penalty=0.1*1000*x;
        amt.setText(Double.toString(penalty));
    }//GEN-LAST:event_timeamtFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try
        {
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mwanzo","Muchiri","Muchiri1234!");

            String insert="INSERT INTO trans_main(trans_type,trans_date,mem_id,grp_id,trans_amount)VALUES(?,?,?,?,?)";

            PreparedStatement pstmt= conn.prepareStatement(insert);

            pstmt.setString(1,transtype.getText());

            SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date udt=sdf1.parse(date.getText());
            long ms=udt.getTime();
            java.sql.Date sqdt=new java.sql.Date(ms);
            pstmt.setDate(2,sqdt);

            pstmt.setInt(3,Integer.parseInt(memid.getText()));
            pstmt.setInt(4,Integer.parseInt(grpid.getText()));
            pstmt.setDouble(5,Double.parseDouble(amt.getText()));

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Insert Successful");

        }

        catch(Exception e)
        {
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(grpmem_penalties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grpmem_penalties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grpmem_penalties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grpmem_penalties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grpmem_penalties().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amt;
    private javax.swing.JTextField date;
    private javax.swing.JLabel grpid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField memid;
    private javax.swing.JLabel memname;
    private javax.swing.JTextField timeamt;
    private javax.swing.JTextField transtype;
    // End of variables declaration//GEN-END:variables
}
