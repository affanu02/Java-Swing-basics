//scroll bar demo Java Swing

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScrollBarDemo extends JFrame implements ActionListener{
    //JFRAME dimensions and text dimensions
    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;
    public static final int LINES = 15;
    public static final int CHAR_PER_LINE = 30;

    private JTextArea memoDisplay;
    private String memo1;
    private String memo2;

    //main method, creates ScrollBarDemo object and sets it visible
    public static void main(String[] args){
        ScrollBarDemo gui = new ScrollBarDemo();
        gui.setVisible(true);
    }

    /**
     * ScrollBarDemo
     * This method creates the ScrollBar JFrame Object
     */
    public ScrollBarDemo(){
        //sets size, names it, and sets Default close operation
        super("Scroll Bar Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //makes the button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout());

        //makes button memo 1 adds to the panel
        JButton memo1Button = new JButton("Save Memo 1");
        memo1Button.addActionListener(this);
        buttonPanel.add(memo1Button);
        //makes button memo 2 adds to panel
        JButton memo2Button = new JButton("Save Memo 2");
        memo2Button.addActionListener(this);
        buttonPanel.add(memo2Button);
        //makes button clear and adds to panel
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);
        //makes button get memo 1
        JButton get1Button = new JButton("Get Memo 1");
        get1Button.addActionListener(this);
        buttonPanel.add(get1Button);
        //makes button get memo 2
        JButton get2Button = new JButton("Get Memo 2");
        get2Button.addActionListener(this);
        buttonPanel.add(get2Button);

        //adds the button panel to the bottom of the JFrame
        add(buttonPanel, BorderLayout.SOUTH);


        //makes the big text panel
        JPanel textPanel = new JPanel();
        textPanel.setBackground(Color.BLUE);

        //this chunck is for scroll bars
        memoDisplay = new JTextArea(LINES, CHAR_PER_LINE);
        memoDisplay.setBackground(Color.WHITE);
        JScrollPane scrolledText = new JScrollPane(memoDisplay);
        scrolledText.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrolledText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        textPanel.add(scrolledText);

        //adds the scroll bar stuff to the bigger text panel now
        add(textPanel, BorderLayout.CENTER);
    }

    //buttons action listeners method
    public void actionPerformed(ActionEvent e){
        String actionCommand = e.getActionCommand();//gets the string from the button chosen

        //saves any text in textfield to memo1 String
        if(actionCommand.equals("Save Memo 1")){
            memo1 = memoDisplay.getText();
        }
        else if(actionCommand.equals("Save Memo 2")){//saves any text in textfield to memo2 String
            memo2 = memoDisplay.getText();
        }
        else if(actionCommand.equals("Clear")){//clears the text field
            memoDisplay.setText("");
        }
        else if(actionCommand.equals("Get Memo 1")){//sets textfield to String memo1
            memoDisplay.setText(memo1);
        }
        else if(actionCommand.equals("Get Memo 2")){//sets textfield to String memo2
            memoDisplay.setText(memo2);
        }
        else{
            memoDisplay.setText("Error in memo interface");
        }
    }
}