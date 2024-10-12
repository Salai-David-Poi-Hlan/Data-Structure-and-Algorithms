package DSA;

public class MainHashTable2 {
    public static void main(String[] args) {
        HashTable2 hashTable2=new HashTable2(5);
        String key1="pomme";
        String value1="apple";
        String key2="pain";
        String value2="bread";
        String key3="clavier";
        String value3="keyboard";
        String key4="ordinateur";
        String value4="computer";
        String key5="lait";
        String value5="milk";
        hashTable2.put(key1, value1);
        hashTable2.put(key2, value2);
        hashTable2.put(key3, value3);
        hashTable2.put(key4, value4);
        hashTable2.put(key5, value5);
        hashTable2.printHashTable();
      
        System.out.println("Table size = "+hashTable2.getSize());
        System.out.println();
        System.out.println("--- Searching ---");
        System.out.println(key1+" = "+hashTable2.get(key1));
        System.out.println(key2+" = "+hashTable2.get(key2));
        System.out.println(key3+" = "+hashTable2.get(key3));
        System.out.println(key4+" = "+hashTable2.get(key4));
        System.out.println(key5+" = "+hashTable2.get(key5));

    }
}
