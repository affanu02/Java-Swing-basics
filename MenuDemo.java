//meno demo demo
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuDemo extends JFrame implements ActionListener{
    //jframe width and height
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    //panels
    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel bluePanel;

    /**
     * main method, creates JFrame object and sets it to visible
     */
    public static void main(String[] args){
        MenuDemo gui = new MenuDemo();
        gui.setVisible(true);
    }

    /**
     * MenuDemo
     * creates the menu and makes panels react to the menu options
     */
    public  MenuDemo(){
        super("Menu Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 3));

        //different panels
        redPanel = new JPanel();
        redPanel.setBackground(Color.LIGHT_GRAY);
        add(redPanel);
        whitePanel = new JPanel();
        whitePanel.setBackground(Color.LIGHT_GRAY);
        add(whitePanel);
        bluePanel = new JPanel();
        bluePanel.setBackground(Color.LIGHT_GRAY);
        add(bluePanel);

        //IMPORTANT MENU STUFF
        JMenu colorMenu = new JMenu("Add Colors");
        //menu items added to the menu
        JMenuItem redChoice = new JMenuItem("Red");
        redChoice.addActionListener(this);
        colorMenu.add(redChoice);
        JMenuItem whitChoice = new JMenuItem("White");
        whitChoice.addActionListener(this);
        colorMenu.add(whitChoice);
        JMenuItem blueChoice = new JMenuItem("Blue");
        blueChoice.addActionListener(this);
        colorMenu.add(blueChoice);

        //this make the menu bar at the top of the JFrame
        JMenuBar bar = new JMenuBar();
        bar.add(colorMenu);
        setJMenuBar(bar);
    }

    public void actionPerformed(ActionEvent e){
        String buttonString = e.getActionCommand();//takes the button input and puts into string

        if(buttonString.equals("Red")){
            redPanel.setBackground(Color.RED);
        }
        else if(buttonString.equals("White")){
            whitePanel.setBackground(Color.WHITE);
        }
        else if(buttonString.equals("Blue")){
            bluePanel.setBackground(Color.BLUE);
        }
        else{
            System.out.println("Unexpected error");
        }
    }
}