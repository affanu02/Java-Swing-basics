//utilizes Panels and Menu to create a responsive panel switching menu demo
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MultiPanelDemo extends JFrame{
    //JFrame width and height
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    //panels
    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel bluePanel;

    //these private classes respond to the menu actionEvents
    private class RedListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            whitePanel.setVisible(false);
            redPanel.setVisible(true);
            bluePanel.setVisible(false);
        }
    }//end of redListener inner class

    private class WhiteListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            whitePanel.setVisible(true);
            redPanel.setVisible(false);
            bluePanel.setVisible(false);
        }
    }//end of whiteListener inner class

    private class BlueListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            whitePanel.setVisible(false);
            redPanel.setVisible(false);
            bluePanel.setVisible(true);
        }
    }//end of redListener inner class

    /**
     * Main method creates gui object and sets them visible
     */
    public static void main(String[] args){
        MultiPanelDemo gui = new MultiPanelDemo();
        gui.setVisible(true);
    }

    /**
     * MultiPanelDemo
     * creates all the panels and sets the menu option to react to change the window Jframe
     */
    public MultiPanelDemo(){
        super("Multi-Panel demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        //makes the panels
        redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setVisible(false);
        add(redPanel);
        whitePanel = new JPanel();
        whitePanel.setBackground(Color.WHITE);
        whitePanel.setVisible(false);
        add(whitePanel);
        bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setVisible(false);
        add(bluePanel);

        //makes menu
        JMenu colorMenu = new JMenu("Add Colors");
        //adds all 3 menu items
        JMenuItem redChoice = new JMenuItem("Red");
        redChoice.addActionListener(new RedListener());
        colorMenu.add(redChoice);
        JMenuItem whiteChoice = new JMenuItem("White");
        whiteChoice.addActionListener(new WhiteListener());
        colorMenu.add(whiteChoice);
        JMenuItem blueChoice = new JMenuItem("Blue");
        blueChoice.addActionListener(new BlueListener());
        colorMenu.add(blueChoice);
        //makes the menu bar
        JMenuBar bar = new JMenuBar();
        bar.add(colorMenu);
        setJMenuBar(bar);
    }
}