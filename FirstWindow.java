//basic way to create a JFrame
import javax.swing.JFrame;
import javax.swing.JButton;

public class FirstWindow extends JFrame{
    //JFrame width and height
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;

    /**
     * FirstWindow
     * Basic items to create the JFrame
     */
    public FirstWindow(){
        super();
        setSize(WIDTH, HEIGHT);
        setTitle("First Normal Window Class");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        //a button to end the JFrame
        JButton endButton = new JButton("Click to end program");
        endButton.addActionListener(new EndingListener());
        add(endButton);
    }

    //this would be in another class as the main object, calling to above method
    public static void main(String[] args){
        FirstWindow w = new FirstWindow();
        w.setVisible(true);
    }
}