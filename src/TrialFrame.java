import javax.swing.*;
import java.awt.*;

public class TrialFrame extends JFrame {
    TrialFrame(){

        this.setTitle("THIS IS A GUI FOR TRIAL GAME"); // title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // actually closes the window
        this.setSize(600, 400); // size of GUI
        this.setVisible(true); // make it so you can see gui
        this.setResizable(false); // not resizable anymore

        //ImageIcon icon = new ImageIcon(); create image icon
        // frame.setIconImage(icon.getImage);

        this.getContentPane().setBackground(new Color(0, 0, 0));


        JLabel l = new JLabel();
        l.setText("New Gui who dis?");
        l.setForeground(new Color(0));
        //l.setFont();
    }
}
