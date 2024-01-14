package miniprojekt4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * A utility class that reads and writes multi maps containing strings
 * to a file in the following format: key = value\newline
 *
 * @author Marcus
 */
public class StringMapIO implements MultiMapIO<String, String> {


    @Override
    public void write(BufferedWriter writer, MultiMap<String, String> map) throws IOException {
        for (String key : map.getKeys()) { //gehe jeden key durch 
            StringBuilder builder = new StringBuilder(); //erstelle einen neuen Stringbuilder für jeden key sodass wir einfacher einen gesamtString erstellen können
            builder.append(key).append(" = "); //füge den key an den Stringbuilder an in form von 'key = '
            try {
                for (String value : map.getValues(key)) {
                    builder.append(value).append(", "); //füge jeden value an den Stringbuilder an in form von 'value, '
                }
            } catch (KeyNotFoundException exception) {
                throw new IOException("Multimap Error", exception);
            }

            // 'key = value, value, value, value, \r\n'
            builder.delete(builder.length() - 2, builder.length()); //wir löschend das letzte ", " da wir sonst einen Fehler bekommen bzw. das zu viel wäre
            //lösche von - bis alle zeichen (hier die letzen 2) 
            //nachdem man nun alle elemente eingefügt hat und alles fertig geschrieben ist und alle elemente teil vom String sind, also wir fertig sind löschen wir die letzten 2 zeichen
            //append a new line depending on the operating system
            builder.append(System.lineSeparator()); //füge eine neue Zeile hinzu je nach Betriebssystem für windows wäre das "\r\n" für linux "\n"
            writer.write(builder.toString()); //schreibe den String in die Datei
            //builder.toString() gibt den String zurück bzw. -> baut uns aus dem baukasten einen fertigen string
        }
        writer.flush(); //leere den writer damit wir sicher sind das alles geschrieben wurde
    }

    @Override
    public MultiMap<String, String> read(BufferedReader reader) throws IOException {

        //erstelle eine neue MultiMap
        MultiMap<String, String> map = new MultiHashMap<>();
        //lese die erste Zeile
        while (reader.ready()) { //solange der reader noch nicht fertig ist soll weiter gelesen werden
            String line = reader.readLine(); //lese die nächste Zeile
            if (line == null || line.isEmpty()) { //wenn die Zeile null ist
                break; //breche ab
            }
            //splitte die Zeile an dem '='
            String[] parts = line.split("="); //splitte die Zeile an dem '=' in 2 teile 'key   und  value'
            //wenn die Zeile nicht 2 teilig ist
            if (parts.length != 2) {
                throw new IOException("Invalid line: " + line);
            }
            //trimme die beiden teile
            String key = parts[0].trim();
            String value = parts[1].trim();
            //splitte den value an dem ','
            String[] values = value.split(",");
            //füge den key und die values der map hinzu
            for (String element : values) {
                map.addValue(key, element.trim());
            }
        }
        return map;
    }
}
