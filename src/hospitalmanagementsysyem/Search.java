/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagementsysyem;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Search extends javax.swing.JFrame {

    /**
     * Creates new form Select
     */
    public Search() {
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
        search = new javax.swing.JButton();
        did = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        nm = new javax.swing.JLabel();
        ag = new javax.swing.JLabel();
        sl = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        pn = new javax.swing.JLabel();
        st = new javax.swing.JLabel();
        q = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Enter the Doctor Id:");

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(242, 242, 242));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        nm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        ag.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        sl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        g.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        pn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        st.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        q.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Search Doctor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(search))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(g, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(sl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(q, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(st, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(did, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel2)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(did, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(search)
                .addGap(18, 18, 18)
                .addComponent(id)
                .addGap(18, 18, 18)
                .addComponent(nm)
                .addGap(27, 27, 27)
                .addComponent(ag)
                .addGap(18, 18, 18)
                .addComponent(sl)
                .addGap(18, 18, 18)
                .addComponent(g)
                .addGap(18, 18, 18)
                .addComponent(pn)
                .addGap(18, 18, 18)
                .addComponent(st)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(q)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try{
//            Connecting to Database
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hospital";
            String uname = "root";
            String pass = "divya05@yepse";
            Connection con = DriverManager.getConnection(url , uname , pass);
            Statement state = con.createStatement();
            String query = "SELECT * FROM DOCTOR WHERE DOC_ID =" + did.getText() + ";";
            ResultSet rs = state.executeQuery(query);
            
//            System.out.println(query);
            String ans1 = "" , ans2 ="" , ans3 = "" , ans4 = "" , ans5 = "" , ans6 = "" , ans7 = "" , ans8 = "";
            if(rs.next())
            {
                ans1 = "Doctor ID : " + rs.getString("doc_id");
                ans2 = "Doctor Name : " + rs.getString("dname");
                ans3 = "Age : " + rs.getString("dage");
                ans4 = "Salary : " + rs.getString("dsalary");
                ans5 = "Gender : " + rs.getString("dgender");
                ans6 = "Phno : " + rs.getString("dphone_number");
                ans7 = "Speciality : " + rs.getString("speciality");
                ans8 = "Qualification : " + rs.getString("Qualification");
                
                id.setText(ans1);
                nm.setText(ans2);
                ag.setText(ans3);
                sl.setText(ans4);
                g.setText(ans5);
                pn.setText(ans6);
                st.setText(ans7);
                q.setText(ans8);
            }else{
                id.setText(ans1);
                nm.setText(ans2);
                ag.setText(ans3);
                sl.setText(ans4);
                g.setText(ans5);
                pn.setText(ans6);
                st.setText(ans7);
                q.setText(ans8);
                JOptionPane.showMessageDialog(this, "No Record of the Doctor with the ID");
            }
            
            con.close();
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "ERROR IN SQL CONNECTOR");
        }
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ag;
    private javax.swing.JTextField did;
    private javax.swing.JLabel g;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nm;
    private javax.swing.JLabel pn;
    private javax.swing.JLabel q;
    private javax.swing.JButton search;
    private javax.swing.JLabel sl;
    private javax.swing.JLabel st;
    // End of variables declaration//GEN-END:variables
}
