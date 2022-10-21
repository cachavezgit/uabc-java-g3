package mx.uabc.cursojava.fundamentales;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Localization {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayName());

        Locale localSP = new Locale("es", "MX");
        System.out.println(localSP.getDisplayLanguage());
        System.out.println(localSP.getDisplayCountry());
        System.out.println(localSP.getDisplayName());

        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Calendar calendar = Calendar.getInstance();

        DateFormat dfCorto = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT,locale);
        System.out.println(dfCorto.format(calendar.getTime()));

        DateFormat dfCortoSP = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT,localSP);
        System.out.println(dfCortoSP.format(calendar.getTime()));

        NumberFormat nf_default = NumberFormat.getInstance(locale);
        System.out.println(nf_default.format(123456.345));

        NumberFormat nf_default_sp = NumberFormat.getInstance(localSP);
        System.out.println(nf_default_sp.format(123456.345));

        Locale localSPSP = new Locale("es", "SP");
        NumberFormat nf_default_sp_sp = NumberFormat.getInstance(localSPSP);
        System.out.println(nf_default_sp_sp.format(123456.345));

        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss");
        System.out.println(formatDate.format(calendar.getTime()));

    }
}
