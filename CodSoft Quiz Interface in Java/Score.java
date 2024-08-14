
package codsoft.quiz.application.mansurah;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
     JButton back;
    Score(String name, int s) {
        setBounds(250,150,750,550);
     setLayout(null);

         ImageIcon i1 = new ImageIcon(getClass().getResource("scores.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(-50, 0, 1440, 200);
        add(image);
        getContentPane().setBackground(new Color(102,84,94));
        
       JLabel heading = new JLabel(name+", You have completed the Quiz!");
        heading.setBounds(500, 200, 400, 30);
        heading.setFont(new Font("Dialog", Font.BOLD, 18));
       heading.setForeground(new Color(246,224,181)); // Set text color to black
        add(heading);
    
           JLabel score = new JLabel("Your score is: "+s);
        score.setBounds(600, 250, 400, 30);
        score.setFont(new Font("Dialog", Font.BOLD, 18));
       score.setForeground(new Color(246,224,181)); // Set text color to black
        add(score);
        
        JButton submit = new JButton("Retake Quiz");
       submit.setBounds(480,300,200,40);
        submit.setFont(new Font("Arial", Font.BOLD,18));
        submit.setBackground(new Color(236,223,204));
        submit.setForeground(new Color(60,61,55));
        submit.addActionListener(this);
        add(submit);
        
         back = new JButton("Exit");
       back.setBounds(700,300,200,40);
       back.setFont(new Font("Arial", Font.BOLD,18));
        back.setBackground(new Color(236,223,204));
       back.setForeground(new Color(60,61,55));
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
     @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
        }
        else{
            setVisible(false);
        new UserInfo();
        }
        
    }
    public static void main(String[] args){
        new Score("Sample Name",0);
    }
  
}
