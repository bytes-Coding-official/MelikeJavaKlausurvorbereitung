package miniprojekt4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Implements a multimap using a hashmap that contains
 * array lists to store its elements.
 *
 * @param <K> The key.
 * @param <V> The value.
 * @author Marcus
 */
public class MultiHashMap<K, V> implements MultiMap<K, V> {


    private final HashMap<K, ArrayList<V>> map = new HashMap<>();

    @Override
    public Set<K> getKeys() {
        return map.keySet();
    }

    @Override
    public boolean containsKey(K key) throws NullPointerException {
        if (key == null) {
            throw new NullPointerException("DER SCHLÜSSEL WAR NICHT EXISTENT!");
        }
        return map.containsKey(key);
    }

    @Override
    public List<V> removeKey(K key) throws KeyNotFoundException, NullPointerException {
        if (key == null) {
            throw new NullPointerException("DER SCHLÜSSEL WAR NICHT EXISTENT!");
        }
        if (!containsKey(key)) {
            throw new KeyNotFoundException("DER SCHLÜSSEL WAR NICHT GEFUNDEN!");
        }
        ArrayList<V> liste = map.get(key); // var = ArrayList<V>
        map.remove(key);
        return liste;
    }

    @Override
    public List<V> getValues(K key) throws KeyNotFoundException, NullPointerException {
        if (key == null) {
            throw new NullPointerException("DER SCHLÜSSEL WAR NICHT EXISTENT!");
        }
        if (!containsKey(key)) {
            throw new KeyNotFoundException("DER SCHLÜSSEL WAR NICHT GEFUNDEN!");
        }
        ArrayList<V> liste = map.get(key); // var = ArrayList<V>

        return liste;
    }

    @Override
    public boolean removeValue(K key, V value) throws KeyNotFoundException, NullPointerException {
        if (key == null) {
            throw new NullPointerException("DER SCHLÜSSEL WAR NICHT EXISTENT!");
        }
        if (!containsKey(key)) {
            throw new KeyNotFoundException("DER SCHLÜSSEL WAR NICHT GEFUNDEN!");
        }
        boolean result = map.get(key).remove(value);
        if (map.get(key).isEmpty())
            map.remove(key);
        return result;
    }

    @Override
    public void addValue(K key, V value) throws NullPointerException {
        if (key == null) {
            throw new NullPointerException("DER SCHLÜSSEL WAR NICHT EXISTENT!");
        }

        if (!containsKey(key)) {
            ArrayList<V> liste = new ArrayList<>();
            liste.add(value);
            map.put(key, liste);
        } else {
            map.get(key).add(value);
        }
    }
}
