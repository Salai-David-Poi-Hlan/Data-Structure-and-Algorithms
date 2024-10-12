package DSA;

public class MainHash {
    public static void main(String[] args) {
        HashTable hashTable=new HashTable(5);
        String key1="pomme";
        String value1="apple";
        String key2="pain";
        String value2="bread";
        String key3="clavier";
        String value3="keyboard";
        hashTable.put(key1, value1);
        hashTable.put(key2, value2);
        hashTable.put(key3, value3);
        System.out.println();
        hashTable.printHashTable();
        System.out.println("Hash Table's size = "+hashTable.getSize());
        System.out.println();
    }
}
