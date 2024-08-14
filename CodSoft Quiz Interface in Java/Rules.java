//took the sample rules from internet

package codsoft.quiz.application.mansurah;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(new Color(251,234,235));
        setLayout(null);

        JLabel heading = new JLabel("Welcome, " + name+". Please read the below instructions carefully before attending the quiz.");
        heading.setBounds(150, 20, 700, 60);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
        heading.setForeground(new Color(46,41,78));
        add(heading);

        // Set up the rules JLabel
        JLabel rules = new JLabel();
        rules.setFont(new Font("Arial", Font.PLAIN, 12));
        rules.setForeground(new Color(46,41,78));
        rules.setBackground(new Color(251,234,235));
        rules.setText(
            "<html>" +
            "<div style='color: white;'>" +
                    "<ul>" +
            "<li>The quiz consists of 10 multiple-choice questions related to Java programming.</li><br><br>" +
            "<li>Each question is designed to test your knowledge of various Java concepts including syntax, OOP, exceptions, collections, and more.</li><br><br>" +
            "<li>You will have 1 minute to answer each question.</li><br><br>" +
            "<li>Once the time for a question expires, you will automatically move on to the next question. You cannot return to previous questions.</li><br><br>" +
            "<li>Each correct answer will earn you 1 point.</li><br><br>" +
            "<li>The quiz must be completed in one sitting. If you exit the quiz or your session expires, you may not be able to resume where you left off.</li><br><br>" +
            "<li>Participants are expected to answer the questions on their own without any external assistance.</li><br><br>" +
            "<li>Using books, websites, or any other resources to find answers during the quiz is prohibited.</li><br><br>" +
            "<li>Results will be displayed immediately after the quiz.</li><br><br>" +
            "<li>You will receive your score and a brief explanation of the correct answers for any questions you may have answered incorrectly.</li><br><br>" +
            "<li>In case of technical issues, contact the quiz administrator immediately.</li><br><br>" +
            "<li>The quiz may be rescheduled at the discretion of the administrator in case of widespread technical difficulties.</li><br><br>" +
            "<li>For any queries or assistance, please contact support@codsoft.com.</li><br><br>" +
                    "</ul>" +
            "</div>" +
            "</html>"
        );

        // Set up the scroll pane
        JScrollPane scroll = new JScrollPane(rules);
        scroll.setBounds(150, 90, 1000, 400);  // Centralizing the scroll pane
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  // Ensure scrolling is always enabled
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.getViewport().setBackground(Color.BLACK);
        add(scroll);

        // Set up the buttons
        back = new JButton("Go Back");
        back.setBounds(500, 500, 120, 30);
        back.setBackground(new Color(46,41,78));
        back.setForeground(new Color(251,234,235));
        back.addActionListener(this);
        add(back);

        start = new JButton("Start Quiz");
        start.setBounds(700, 500, 120, 30);
        start.setBackground(new Color(46,41,78));
        start.setForeground(new Color(251,234,235));
        start.addActionListener(this);
        add(start);

        // Frame settings
        setSize(800, 650);
        setLocationRelativeTo(null); // Centrally aligns the frame on the screen
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            // Start quiz logic here
            setVisible(false);
            new Quiz(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
            new UserInfo();
        }
    }

    public static void main(String[] args) {
        new Rules("Sample Name");
    }
}
