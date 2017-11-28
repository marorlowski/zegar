import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

/**
 * create
 */
public class main {
    public static void main(String[] args) throws InterruptedException, ParseException {


        /**okienko
         *
         */
//        JFrame frame = new JFrame("Timer");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JLabel textLabel = new JLabel();
//        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        textLabel.setPreferredSize(new Dimension(200, 100));
//        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
//        frame.setLocationRelativeTo(null);
//        frame.pack();
//        frame.setVisible(true);


        Okno ok = new Okno();
        ok.okienko();
        /**pętla w której obliczany jest czas do końca dnia pracy
         *
         */
        int i = 0;
        while (i == 0) {
//            textLabel.setText(Time.roznica());


            TimeUnit.SECONDS.sleep(1); //opóźnienie o 1 sekundę
            ok.textLabelPrime.setText(Time.roznica());
        }
    }
}

