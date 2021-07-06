//uses combo boxs to choose from a selection of choices

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxDemo extends JFrame implements ActionListener{
    //JFrame width and height
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    //JLabel message
    JLabel message;

    /**
     * main
     * creates the object JFrame and sets it to visible
     */
    public static void main(String[] args){
        ComboBoxDemo gui = new ComboBoxDemo();
        gui.setVisible(true);
    }

    /**
     * ComboBoxDemo
     * creates the ComboBox object, adds to JFrame.
     */
    public ComboBoxDemo(){
        super("Combo Box Demo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        String[] petStrings = {"Bird", "Cat", "Dog", "Rabbit", "Pig"};
        JComboBox petList = new JComboBox(petStrings);//combo box stuff
        petList.setSelectedIndex(4);
        petList.addActionListener(this);

        message = new JLabel("I chose " + petStrings[4] + ".");
        message.setFont(message.getFont().deriveFont(Font.ITALIC));//sets font type to italic
        message.setHorizontalAlignment(JLabel.CENTER);

        add(petList, BorderLayout.NORTH);
        add(message, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e){
        JComboBox cb = (JComboBox)e.getSource();
        String petName = (String)cb.getSelectedItem();
        message.setText("I chose " + petName + ".");
    }
}