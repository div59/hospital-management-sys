//import hospitalmanagementsysyem.Hospital;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DIVYANI
 */
public class ShowTablePage {
    ShowTablePage()
    {
        new FinalGUI();
    }
    

    void show() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

class FinalGUI implements ActionListener
{
    DefaultTableModel model;
    JLabel title;
    Font f1 = new Font("Dialog" , Font.BOLD , 18);
    FinalGUI()
    {
        JFrame jf = new JFrame("DOCTORS TABLE") ;
        jf.setSize(600 , 600);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.setVisible(true);
        jf.setLayout(null);
        
        title = new JLabel("DOCTORS TABLE");
        title.setForeground(Color.black);
        title.setFont(f1);
        title.setBounds(200, 25, 200, 25);
        jf.add(title);
        
        String col[]={"Doc_Id", "Dname" ,"Dage" , "Dsalary" , "Dgender" , "DPHONE_NUMBER" , "Speciality" , "Qualification"};
        model=new DefaultTableModel(null , col);
        JTable table=new JTable(model);
        table.getTableHeader().setBackground(Color.gray);
        JScrollPane pane=new JScrollPane(table);
        JPanel panel=new JPanel();
        panel.add(pane);
        panel.setBounds(0 , 50 , 600,600);
        jf.add(panel);
        
        //Conncet to Database
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hospital";
            String uname = "root";
            String pass = "divya05@yepse";
            Connection con;
            con = DriverManager.getConnection(url , uname , pass);
            
            //Create a Statement
            Statement st = con.createStatement();
            String query = "SELECT * FROM DOCTOR;";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                Vector row = new Vector();
                String s1,s2,s3,s4,s5,s6,s7,s8;
                row.add(rs.getString("Doc_Id"));
                row.add(rs.getString("Dname"));
                row.add(rs.getString("Dage"));
                row.add(rs.getString("Dsalary"));
                row.add(rs.getString("Dgender"));
                row.add(rs.getString("DPHONE_NUMBER"));
                row.add(rs.getString("Speciality"));
                row.add(rs.getString("Qualification"));
                model.addRow(row);
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
   }
	@Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String args[]) {

}

}




        
