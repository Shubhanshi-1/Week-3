package HashmapAndHashFunction.CustomHashMap;

import java.util.LinkedList;

class HashMap<K, V> {
    private static final int SIZE = 16;  // Default hash table size
    private LinkedList<Entry<K, V>>[] buckets;

    public HashMap() {
        buckets = new LinkedList[SIZE];
    }

    // Hash function
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    // Insert or update key-value pair
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update existing key
                return;
            }
        }

        buckets[index].add(new Entry<>(key, value)); // Insert new key
    }

    // Retrieve value by key
    public V get(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) return null;

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null; // Key not found
    }

    // Remove key-value pair
    public void remove(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) return;

        buckets[index].removeIf(entry -> entry.key.equals(key));
    }

    // Entry class (Key-Value Pair)
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Display hashmap contents
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            if (buckets[i] != null) {
                System.out.print("Bucket " + i + ": ");
                for (Entry<K, V> entry : buckets[i]) {
                    System.out.print("[" + entry.key + " -> " + entry.value + "] ");
                }
                System.out.println();
            }
        }
    }


}

