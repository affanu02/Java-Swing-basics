/**
 * program to use three layout managers, border, flow and gridLayout
 * note: borderLayout and flowlayout are commented out.
*/
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class LayoutWindows extends JFrame{
    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;

    /*BORDER LAYOUT 
    public LayoutWindows(){
        super("BorderLayout Demo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel label1 = new JLabel("first label north");
        add(label1, BorderLayout.NORTH);

        JLabel label2 = new JLabel("second label south");
        add(label2, BorderLayout.SOUTH);

        JLabel label3 = new JLabel("third label west");
        add(label3, BorderLayout.WEST);
    }
    public static void main(String[]args){
        LayoutWindows gui = new LayoutWindows();
        gui.setVisible(true);
    }*/

    /*FLOWLAYOUT  
    public LayoutWindows(){
        super("FLowLayout Demo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        JLabel label1 = new JLabel("first");
        add(label1);

        JLabel label2 = new JLabel("second");
        add(label2);

        JLabel label3 = new JLabel("third");
        add(label3);
    }
    public static void main(String[]args){
        LayoutWindows gui = new LayoutWindows();
        gui.setVisible(true);
    }*/

    public static void main(String[]args){
        LayoutWindows gui = new LayoutWindows(2, 3);//rows, columns
        gui.setVisible(true);
    }

    /*GRID LAYOUT */
    public LayoutWindows(int rows, int columns){
        super();
        setSize(WIDTH, HEIGHT);
        setTitle("GridLayout demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(rows, columns));

        JLabel label1 = new JLabel("first");
        add(label1);
        JLabel label2 = new JLabel("second");
        add(label2);
        JLabel label3 = new JLabel("third");
        add(label3);
        JLabel label4 = new JLabel("forth");
        add(label4);
        JLabel label5 = new JLabel("fifth");
        add(label5);
        JLabel label6 = new JLabel("sixth");
        add(label6);
    }


}
