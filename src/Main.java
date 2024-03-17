// Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
// ottieni l'anno
// ottieni il mese
// ottieni il giorno
// ottieni il giorno della settimana
// Stampa i risultati sulla console

import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args) {

        OffsetDateTime myDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String getYear = myDate.format(DateTimeFormatter.ofPattern("yyyy"));
        String getMonth = myDate.format(DateTimeFormatter.ofPattern("MM"));
        String getDay = myDate.format(DateTimeFormatter.ofPattern("dd"));
        DayOfWeek getDayName = myDate.getDayOfWeek();

        System.out.println("Year: " + getYear);
        System.out.println("Month: " + getMonth);
        System.out.println("Day: " + getDay);
        System.out.println("Day Name: " + getDayName);
    }
}