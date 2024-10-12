package DSA;

public class HashTable {
    private int size=0;
    private String[] french;
    private String[] english;

    public HashTable(int capacity){
        french=new String[capacity];
        english=new String[capacity];

    }

    public void put(String key,String value){
        if(size==french.length){
            System.out.println("Hash table is full");
            return;
        }
        int index=hashFunction(key);
        french[index]=key;
        english[index]=value;
        size++;
    }

    public int getSize(){
        return size;
    }

    public int hashFunction(String key){
        int hash=(key.hashCode()&0x7FFFFFFF)%english.length;
        return hash;
    }

    public void printHashTable(){
        System.out.println("--- Hash Table ---");
        for(int i=0;i<french.length;i++){
            System.out.println(i+" "+french[i]+" "+english[i]);
        }
    }

}
