//displays two simple windows, one pink and yellow, two ways of doing this show below

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class ColorSwingWindow extends JFrame{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;

    public ColorSwingWindow(Color theColor){
        super("No Charge for Color");
        setSize(WIDTH, HEIGHT);
        setTitle("Color Window Class");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(theColor);

        JLabel aLabel = new JLabel("Close-window button works.");
        add(aLabel);
    }

    public ColorSwingWindow(){
        this(Color.PINK);
    }

    //this would be in another class as the main object, calling to above method
    public static void main(String[] args){
        ColorSwingWindow w1 = new ColorSwingWindow();
        w1.setVisible(true);

        ColorSwingWindow w2 = new ColorSwingWindow(Color.YELLOW);
        w2.setVisible(true);
    }
}