import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class Okno {


    JLabel textLabelPrime = new JLabel();
    
    public void okienko() {
        JFrame frame = new JFrame("Timer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel();
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(200, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        textLabel=this.textLabelPrime;
    }


}
