
package codsoft.quiz.application.mansurah;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UserInfo extends JFrame implements ActionListener{
    JButton rules,back; //declare them globally
    JTextField tfname;
    UserInfo(){

    setLayout(null);
        
    setVisible(true); //the screen is initially hidden
    setSize(1000,600);
    setLocation(180,57);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("CodSoft Quiz Application");
         
    // Adding a background image as the content pane
    setContentPane(new JLabel(new ImageIcon(ClassLoader.getSystemResource("icons/home-image.png"))));
    //Creating a panel with semi-transparent background for shadow effect
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0, 150)); // Black with transparency
        panel.setBounds(40, 0, 1200, 800);
        panel.setLayout(null);
   
        JLabel heading = new JLabel("Lets do Java!");
        heading.setBounds(500,100,300,45);
        heading.setFont(new Font("Arial", Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
          
        panel.add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(560,150,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        panel.add(name);
        
        tfname = new JTextField();
        tfname.setBounds(500,200,280,25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD,20));
        
        panel.add(tfname);
        
        rules = new JButton("Start Quiz");
        rules.setBounds(500,250,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        panel.add(rules);
        
        back = new JButton("Exit");
        back.setBounds(650,250,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);
        
        add(panel);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
    }
     public static void main(String[] args){
         UserInfo ui = new UserInfo(); //make userinfo object 
     }
}
