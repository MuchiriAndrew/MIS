

import java.sql.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;  

public class dividends_form extends javax.swing.JFrame {

    /**
     * Creates new form dividends_form
     */
    public dividends_form() {
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
        grpid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        memname = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        transtype = new javax.swing.JTextField();
        memid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        orgincome = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sharecontr = new javax.swing.JLabel();
        shareproportion = new javax.swing.JLabel();
        amt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COMPUTE SHAREHOLDERS' DIVIDENDS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        grpid.setBackground(new java.awt.Color(0, 204, 204));
        grpid.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(grpid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 100, 22));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Member ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 94, -1));

        memname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(memname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 100, 22));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Member Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        transtype.setForeground(new java.awt.Color(0, 0, 0));
        transtype.setText("DIV");
        getContentPane().add(transtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 100, -1));

        memid.setForeground(new java.awt.Color(0, 0, 0));
        memid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                memidFocusLost(evt);
            }
        });
        memid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memidActionPerformed(evt);
            }
        });
        getContentPane().add(memid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 100, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Group ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Transaction Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        orgincome.setForeground(new java.awt.Color(255, 255, 255));
        orgincome.setText("Compute Member's Dividend Amount");
        orgincome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                orgincomeFocusLost(evt);
            }
        });
        getContentPane().add(orgincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 250, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dividend Amount payable");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("FINISH");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Member Share Contribution");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Share Contribution Proportion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        sharecontr.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(sharecontr, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 100, 16));

        shareproportion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(shareproportion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 202, 16));

        amt.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 202, 16));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdbcimage.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_memidFocusLost
        // TODO add your handling code here:
        
        //DISPLAY MEMBER NAME!!!!!!!!!!!!!!!
        try
        {
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mwanzo","Muchiri","Muchiri1234!");

            String name="select*from mem_reg where mem_id = ?";
            PreparedStatement pstmt1= conn.prepareStatement(name);
            pstmt1.setInt(1,Integer.parseInt(memid.getText()));

            ResultSet resultset = pstmt1.executeQuery();

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
                    if(resultset.wasNull())
                    {
                        grpid.setText("");
                    }
                    else{
                    grpid.setText(Integer.toString(x));
                    }
                }
                while(resultset.next());
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        //COMPUTE SHARE CONTRIBUTION!!!!!!!!!!!
        try
        {
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mwanzo","Muchiri","Muchiri1234!");

            String shares="select*from trans_main where mem_id =? and trans_type=?";
            PreparedStatement pstmt2= conn.prepareStatement(shares);
            pstmt2.setInt(1,Integer.parseInt(memid.getText()));
            pstmt2.setString(2,"MCTRB");
            
            ResultSet resultset = pstmt2.executeQuery();

            if(resultset.next()==false)
            {
                int a=0;
                String f=Integer.toString(a);
                sharecontr.setText(f);
            }
            else
            {
                int z=0;
                do
                {
                    int x=resultset.getInt("trans_amount");
                    z=z+x;   
                }
                while(resultset.next());
                sharecontr.setText(Integer.toString(z));

            }
        }
            catch(Exception e)
        {
            e.printStackTrace();
        }

   
    }//GEN-LAST:event_memidFocusLost

    private void memidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memidActionPerformed

    private void orgincomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_orgincomeFocusLost
        // TODO add your handling code here:
        
        if(orgincome.isSelected()){
  //COMPUTE TOTAL MONTHLY CONTIBUTIONS
        try
        {
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mwanzo","Muchiri","Muchiri1234!");

            
            String total="select*from trans_main where trans_type=?";
            PreparedStatement pstmt3= conn.prepareStatement(total);
           
            pstmt3.setString(1,"MCTRB");
            
            ResultSet resultset2 = pstmt3.executeQuery();

            
                double t=0;
                 while(resultset2.next())
                {
                    int x=resultset2.getInt("trans_amount");
                    t=t+x;
                }
                
                
                
                double j=Double.parseDouble(sharecontr.getText());
                

                double proportion= j/t;
                shareproportion.setText(Double.toString(proportion));
        }
        
         catch(Exception e)
        {
            e.printStackTrace();
        }
                
                
            
        try{
//ORGANIZATIONS INCOME PAYABLE AS DIVIDENDS
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mwanzo","Muchiri","Muchiri1234!");

           String income= "select*from trans_main where trans_type =? or trans_type=?";
                 PreparedStatement pstmt4= conn.prepareStatement(income);
                 
                 pstmt4.setString(1,"INT");
                 pstmt4.setString(2,"PEN");
                 ResultSet resultset3 = pstmt4.executeQuery();
                 
                 
                  double z = 0;
                  while(resultset3.next())   
        {
                
                int x=resultset3.getInt("trans_amount");
                z=z+x;
                
        }
                  double amttodiv=0.6*z;
                  double div=(Double.parseDouble(shareproportion.getText())*amttodiv);
                  amt.setText(Double.toString(div));

            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_orgincomeFocusLost

  
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
            java.util.logging.Logger.getLogger(dividends_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dividends_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dividends_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dividends_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dividends_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amt;
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
    private javax.swing.JRadioButton orgincome;
    private javax.swing.JLabel sharecontr;
    private javax.swing.JLabel shareproportion;
    private javax.swing.JTextField transtype;
    // End of variables declaration//GEN-END:variables
}
