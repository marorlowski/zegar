import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Time {
    /**
     * Metoda dająca wynik z różnic godzin
     *
     * @return
     * @throws ParseException
     */
    public static String roznica() throws ParseException {
        /**ustalenie daty bieżącej bez godziny
         *
         */
        SimpleDateFormat dTb = new SimpleDateFormat("yyyy-MM-dd");
        Date data_bierzaca = Calendar.getInstance().getTime();
        String data_bierzaca_string = dTb.format(data_bierzaca);

        /**ustawienie godziny do której pracuję
         *
         */
        String data_cala = data_bierzaca_string + " 14:40:00.0";
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dt.parse(data_cala);
        Date data_systemowa = new Date();
        long diff = Math.abs(date.getTime() - data_systemowa.getTime());
        long sekundy = (diff / 1000) % 60;
        long minuty = (diff / (1000 * 60)) % 60;
        long godziny = (diff / (1000 * 60 * 60)) % 24;
        //long dni = (diff/(1000*60*60*24))%7;
        String time = String.format(godziny + " h " + minuty + " m " + sekundy + " s");

        return time;

    }
}
