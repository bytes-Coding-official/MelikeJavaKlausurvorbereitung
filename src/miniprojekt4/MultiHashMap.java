package miniprojekt4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Implements a multimap using a hashmap that contains
 * array lists to store its elements.
 *
 * @param <KEY> The key.
 * @param <VALUE> The value.
 * @author Marcus
 */
public class MultiHashMap<KEY, VALUE> implements MultiMap<KEY, VALUE> {


    private final HashMap<KEY, ArrayList<VALUE>> map = new HashMap<>();

    @Override
    public Set<KEY> getKeys() {
        return map.keySet();
    }

    @Override
    public boolean containsKey(KEY key) throws NullPointerException {
        if (key == null) {
            throw new NullPointerException("DER SCHLÜSSEL WAR NICHT EXISTENT!");
        }
        return map.containsKey(key);
    }

    @Override
    public List<VALUE> removeKey(KEY key) throws KeyNotFoundException, NullPointerException {
        if (key == null) {
            throw new NullPointerException("DER SCHLÜSSEL WAR NICHT EXISTENT!");
        }
        if (!containsKey(key)) {
            throw new KeyNotFoundException("DER SCHLÜSSEL WAR NICHT GEFUNDEN!");
        }
        ArrayList<VALUE> liste = map.get(key); // var = ArrayList<V>
        map.remove(key);
        return liste;
    }

    @Override
    public List<VALUE> getValues(KEY key) throws KeyNotFoundException, NullPointerException {
        if (key == null) {
            throw new NullPointerException("DER SCHLÜSSEL WAR NICHT EXISTENT!");
        }
        if (!containsKey(key)) {
            throw new KeyNotFoundException("DER SCHLÜSSEL WAR NICHT GEFUNDEN!");
        }
        ArrayList<VALUE> liste = map.get(key); // var = ArrayList<V>

        return liste;
    }

    @Override
    public boolean removeValue(KEY key, VALUE value) throws KeyNotFoundException, NullPointerException {
        if (key == null) {
            throw new NullPointerException("DER SCHLÜSSEL WAR NICHT EXISTENT!");
        }
        if (!containsKey(key)) {
            throw new KeyNotFoundException("DER SCHLÜSSEL WAR NICHT GEFUNDEN!");
        }


        boolean result = false;
        result = map.get(key).remove(value);
        if (map.get(key).isEmpty())
            map.remove(key);
        return result;
    }

    @Override
    public void addValue(KEY key, VALUE value) throws NullPointerException {
        if (key == null) {
            throw new NullPointerException("DER SCHLÜSSEL WAR NICHT EXISTENT!");
        }

        if (!containsKey(key)) {
            ArrayList<VALUE> liste = new ArrayList<>();
            liste.add(value);
            map.put(key, liste);
        } else {
            map.get(key).add(value);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (KEY key : map.keySet()) {
            builder.append(key).append(" -> ");
            for (VALUE value : map.get(key)) {
                builder.append(value).append(", ");
            }
            //lösche die letzten beiden zeichen
            builder.delete(builder.length() - 2, builder.length());
            builder.append("\r\n");

        }
        return builder.toString();
    }

    /* @Override
    public boolean addValue(K key, V value) throws NullPointerException {
        if (key == null) {
            throw new NullPointerException("DER SCHLÜSSEL WAR NICHT EXISTENT!");
        }

        if (!containsKey(key)) {
            ArrayList<V> liste = new ArrayList<>();
            liste.add(value);
            map.put(key, liste);
            return true;
        } else {
            map.get(key).add(value);
            return true;
        }
    }*/
}
