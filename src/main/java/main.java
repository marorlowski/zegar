import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * create Marek Orłowski
 */
public class main {
    public static void main(String[] args) throws InterruptedException, ParseException, IOException {

        /**ustalenie daty bieżącej bez godziny
         *
         */
        SimpleDateFormat dTb = new SimpleDateFormat("yyyy-MM-dd");
        Date data_bierzaca = Calendar.getInstance().getTime();
        String data_bierzaca_string = dTb.format(data_bierzaca);

        /**ustawienie godziny do której pracuję
         *
         */
        String data_cała = data_bierzaca_string + " 14:40:00.0";
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dt.parse(data_cała);

        /**okienko
         *
         */
        JFrame frame = new JFrame("Tajmer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel();
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(200, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

        /**pętla w której obliczany jest czas do końca dnia pracy
         *
         */
        int i = 0;
        while (i == 0) {
            Date data_systemowa = new Date();
            long diff = Math.abs(date.getTime() - data_systemowa.getTime());
            long sekundy = (diff / 1000) % 60;
            long minuty = (diff / (1000 * 60)) % 60;
            long godziny = (diff / (1000 * 60 * 60)) % 24;
            //long dni = (diff/(1000*60*60*24))%7;
            String time = String.format(godziny + " h " + minuty + " m " + sekundy + " s");
            textLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
            textLabel.setText(time);
            TimeUnit.SECONDS.sleep(1); //opóźnienie o 1 sekundę
        }
    }
}

