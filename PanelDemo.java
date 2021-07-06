//makes panels and allows them to interactive to buttons

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelDemo extends JFrame implements ActionListener{
    //width and height of frame
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    //panels
    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel bluePanel;
    private JPanel blackPanel;

    //main method, creates ScrollBarDemo object and sets it visible
    public static void main(String[] args){
        PanelDemo gui = new PanelDemo();
        gui.setVisible(true);
    }

    /**
     * PanelDemo
     * creates the JFrame window and panels
     */
    public PanelDemo(){
        super("Panel Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //bigger panel initialized to have one row and three columns
        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new GridLayout(1, 4));

        //three smaller panels added tp the biggerpanel
        redPanel = new JPanel();
        redPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(redPanel);
        whitePanel = new JPanel();
        whitePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(whitePanel);
        bluePanel = new JPanel();
        bluePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(bluePanel);
        blackPanel = new JPanel();
        blackPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(blackPanel);

        //add the bigger panel to the JFrame
        add(biggerPanel, BorderLayout.CENTER);


        //new panel to hold buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout());

        //makes all buttons adding to the button panel
        JButton redButton = new JButton("Red");
        redButton.setBackground(Color.RED);
        redButton.addActionListener(this);
        buttonPanel.add(redButton);
        JButton whiteButton = new JButton("White");
        whiteButton.setBackground(Color.WHITE);
        whiteButton.addActionListener(this);
        buttonPanel.add(whiteButton);
        JButton blueButton = new JButton("Blue");
        blueButton.setBackground(Color.BLUE);
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);
        JButton blackButton = new JButton("Black");
        blackButton.setBackground(Color.BLACK);
        blackButton.addActionListener(this);
        buttonPanel.add(blackButton);

        //adds the bigger button panel to JFrame at the bottom
        add(buttonPanel, BorderLayout.SOUTH);
    }

    /**
     * actionPerformed
     * Responds the buttons for actionEvents
     */
    public void actionPerformed(ActionEvent e){
        String buttonString = e.getActionCommand();
        
        if(buttonString.equals("Red")){
            redPanel.setBackground(Color.RED);
        }
        else if(buttonString.equals("White")){
            whitePanel.setBackground(Color.WHITE);
        }
        else if(buttonString.equals("Blue")){
            bluePanel.setBackground(Color.BLUE);
        }
        else if(buttonString.equals("Black")){
            blackPanel.setBackground(Color.BLACK);
        }
        else{
            System.out.println("Unexpectated error.");
        }   
    }
}