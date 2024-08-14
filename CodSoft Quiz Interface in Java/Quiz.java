//took the sample questions from internet

package codsoft.quiz.application.mansurah;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Quiz extends JFrame implements ActionListener {
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String userAns[][] = new String[10][1];
JLabel qno, question,hintIcon;
JRadioButton opt1,opt2,opt3,opt4;
JButton next,Lifeline,submit,markReview,reportQuestion,prev;
public static int timer=10;
public static int ans_given = 0;
public static int count=0;
ButtonGroup group;
public static int score=0;
String name;
    Quiz(String name) {
         setSize(800, 650);
        setLocationRelativeTo(null);
        this.name=name;
//        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE); // Set the full background to white
        setLayout(null); // Use null layout for manual positioning

        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
        ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/quiz2.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(-10, 0, 1440, 200);
        add(image);

        qno = new JLabel("1");
        qno.setBounds(100, 250, 50, 30);
        qno.setFont(new Font("Arial", Font.PLAIN, 18));
        qno.setForeground(Color.BLACK); // Set text color to black
        add(qno);

        question = new JLabel(questions[0][0]);
        question.setBounds(150, 250, 1200, 30); // Adjusted position to align with qno
        question.setFont(new Font("Arial", Font.PLAIN, 18));
        question.setForeground(Color.BLACK); // Set text color to black
        add(question);

         opt1 = new JRadioButton(questions[0][1]);
        opt1.setBounds(170, 300, 1200, 30); // Adjusted position
        opt1.setBackground(Color.WHITE); // Set button background to white
        opt1.setForeground(Color.BLACK); // Set button text to black
        opt1.setFont(new Font("Dialog", Font.PLAIN, 14));
        add(opt1);

        opt2 = new JRadioButton(questions[0][2]);
        opt2.setBounds(170, 340, 1200, 30); // Adjusted position
        opt2.setBackground(Color.WHITE); // Set button background to white
        opt2.setForeground(Color.BLACK); // Set button text to black
        opt2.setFont(new Font("Dialog", Font.PLAIN, 14));
        add(opt2);

        opt3 = new JRadioButton(questions[0][3]);
        opt3.setBounds(170, 380, 1200, 30); // Adjusted position
        opt3.setBackground(Color.WHITE); // Set button background to white
        opt3.setForeground(Color.BLACK); // Set button text to black
        opt3.setFont(new Font("Dialog", Font.PLAIN, 14));
        add(opt3);

        opt4 = new JRadioButton(questions[0][4]);
        opt4.setBounds(170, 420, 1200, 30); // Adjusted position
        opt4.setBackground(Color.WHITE); // Set button background to white
        opt4.setForeground(Color.BLACK); // Set button text to black
        opt4.setFont(new Font("Dialog", Font.PLAIN, 14));
        add(opt4);

        group = new ButtonGroup();
        group.add(opt1);
        group.add(opt2);
        group.add(opt3);
        group.add(opt4);

          next = new JButton("Next");
        next.setBounds(620,480,150,40);
        next.setFont(new Font("Tahoma", Font.BOLD,16));
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);
        
         reportQuestion = new JButton("Report Question");
        reportQuestion.setBounds(1000, 250, 180, 40);
        reportQuestion.setFont(new Font("Tahoma", Font.BOLD, 14));
        reportQuestion.setBackground(new Color(255, 140, 0));
        reportQuestion.setForeground(Color.white);
        reportQuestion.addActionListener(this);
        add(reportQuestion);
        
          markReview = new JButton("Mark for Review");
        markReview.setBounds(810, 250, 180, 40);
        markReview.setFont(new Font("Tahoma", Font.BOLD, 14));
        markReview.setBackground(new Color(60, 179, 113));
        markReview.setForeground(Color.white);
        markReview.addActionListener(this);
        add(markReview);
        
       Lifeline = new JButton("50-50");
        Lifeline.setBounds(800,480,150,40);
        Lifeline.setFont(new Font("Tahoma", Font.BOLD,16));
        Lifeline.setBackground(new Color(123,104,238));
        Lifeline.setForeground(Color.white);
        Lifeline.addActionListener(this);
        add(Lifeline);
           
       submit = new JButton("Submit");
       submit.setBounds(980,480,150,40);
        submit.setFont(new Font("Tahoma", Font.BOLD,16));
        submit.setBackground(new Color(255,69,0));
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        submit.setEnabled(false); //to disable it
        add(submit);
        
        prev = new JButton("Previous");
        prev.setBounds(440,480,150,40);
        prev.setFont(new Font("Tahoma", Font.BOLD,16));
        prev.setBackground(new Color(47,0,0));
        prev.setForeground(Color.white);
        prev.addActionListener(this);
        prev.setEnabled(false); //to disable it
        add(prev);
        
        ImageIcon hint = new ImageIcon(ClassLoader.getSystemResource("icons/hint.png"));
        hintIcon = new JLabel(hint);
        hintIcon.setBounds(740, 400, 40, 40);
        add(hintIcon);
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint(); // go to next question by incfeasing count
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            if(count == 8){
             next.setEnabled(false);
             submit.setEnabled(true);
         }
         
             ans_given=1;//user has given answer
         if(group.getSelection() == null){
               userAns[count][0] = ""; 
            }
            else{
                userAns[count][0] = group.getSelection().getActionCommand();
                
            }
         
          prev.setEnabled(true);
          
         if(count == 8){
             next.setEnabled(false);
             submit.setEnabled(true);
         }
         
            count++;
            start(count);//
           
        }
        else if(ae.getSource() == Lifeline){
            
            if(count==2 || count ==4 || count==6 || count==8 || count==9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else{
                 opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            Lifeline.setEnabled(false);
        }
        else if (ae.getSource() == prev) {
    repaint();
    count--;

    if (count == 0) {
        prev.setEnabled(false);
    }

    // Restore the previously selected option
    String selectedAnswer = userAns[count][0];
    if (selectedAnswer.equals("option1")) {
        opt1.setSelected(true);
    } else if (selectedAnswer.equals("option2")) {
        opt2.setSelected(true);
    } else if (selectedAnswer.equals("option3")) {
        opt3.setSelected(true);
    } else if (selectedAnswer.equals("option4")) {
        opt4.setSelected(true);
    } else {
        group.clearSelection();
    }

    start(count);

    next.setEnabled(true);
    submit.setEnabled(false);
}


        else{ //submit button
            ans_given=1;
            if(group.getSelection() == null){
               userAns[count][0] = ""; 
            }
            else{
                userAns[count][0] = group.getSelection().getActionCommand();
                
            }
                for(int i=0;i<userAns.length;i++){
                    if(userAns[i][0].equals(answers[i][1])){
                        score += 10;
                    } 
                }
                setVisible(false);
                new Score(name, score);
        }
    }
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Remaining: "+timer +" s";
        g.setColor(Color.GREEN);
g.setFont(new Font("Tahoma", Font.BOLD,16));

        if(timer>0){
            g.drawString(time, 1020,270);
        }
        else{
            g.setColor(Color.red);
            g.drawString("Time over!",1020,270);
        }
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        if(ans_given==1){
            ans_given=0;
            timer = 10;
        }
        else if(timer < 0){
            
            timer=10;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(false);
            }
            if(count==9){ // if the user
                if(group.getSelection() == null){
               userAns[count][0] = ""; 
            }
            else{
                userAns[count][0] = group.getSelection().getActionCommand();
                
            }
                for(int i=0;i<userAns.length;i++){
                    if(userAns[i][0].equals(answers[i][1])){
                        score += 10;
                    } 
                }
                setVisible(false);
                //score 
                new Score(name,score);
            }
            else {
            if(group.getSelection() == null){
               userAns[count][0] = ""; 
            }
            else{
                userAns[count][0] = group.getSelection().getActionCommand();
                
            }
            count++;
            start(count);
        }
    }
    }
public void start(int count){
    qno.setText(""+(count+1)+". ");
    question.setText(questions[count][0]);
    
    opt1.setText(questions[count][1]);
    opt1.setActionCommand(questions[count][1]);
    
    opt2.setText(questions[count][2]);
     opt2.setActionCommand(questions[count][2]);
     
    opt3.setText(questions[count][3]);
     opt3.setActionCommand(questions[count][3]);
     
    opt4.setText(questions[count][4]);
     opt4.setActionCommand(questions[count][4]);
    

    

    group.clearSelection();

}
    public static void main(String[] args) {
        new Quiz("user");
    }
}
