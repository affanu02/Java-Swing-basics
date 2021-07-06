//inner listeners demo
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InnerListenersDemo extends JFrame{
    //JFrame width and height
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    //panels
    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel bluePanel;

    private class redListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            redPanel.setBackground(Color.RED);
        }
    }//end of RedListener inner class

    private class whiteListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            whitePanel.setBackground(Color.WHITE);
        }
    }//end of whiteListener inner class

    private class blueListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            bluePanel.setBackground(Color.BLUE);
        }
    }//end of blueListener inner class


    public static void main(String[] args){
        InnerListenersDemo gui = new InnerListenersDemo();
        gui.setVisible(true);
    }

    /**
     * InnerListnersDemo
     * Shows how menu items can be connected with listeners to react to actionEvents.
     * This can be used for other reactors as well such as buttons.
     */
    public InnerListenersDemo(){
        super("Menu Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 3));

        //makes the different panels
        redPanel = new JPanel();
        redPanel.setBackground(Color.LIGHT_GRAY);
        add(redPanel);
        whitePanel = new JPanel();
        whitePanel.setBackground(Color.LIGHT_GRAY);
        add(whitePanel);
        bluePanel = new JPanel();
        bluePanel.setBackground(Color.LIGHT_GRAY);
        add(bluePanel);

        //creates the menu
        JMenu colorMenu = new JMenu("Add Colors");
        JMenuItem redChoice = new JMenuItem("Red");
        redChoice.addActionListener(new redListener());
        colorMenu.add(redChoice);
        JMenuItem whiteChoice = new JMenuItem("White");
        whiteChoice.addActionListener(new whiteListener());
        colorMenu.add(whiteChoice);
        JMenuItem blueChoice = new JMenuItem("Blue");
        blueChoice.addActionListener(new blueListener());
        colorMenu.add(blueChoice);

        //sets JMenu bar
        JMenuBar bar = new JMenuBar();
        bar.add(colorMenu);
        setJMenuBar(bar);

    }
}