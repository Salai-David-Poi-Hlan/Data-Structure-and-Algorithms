package DSA;

public class HashTable2 {
    private int size=0;
    private String[] french;
    private String [] english;
    
    public HashTable2(int capacity){
        french=new String[capacity];
        english=new String [capacity];
    }
    public void put(String key,String value){
        if(size==french.length){
            System.out.println("Hash Table is full");
            return;
        }
        int index=hashFunction(key);
        if(french[index]!=null){
             System.out.println("Putting "+value+" has a collision");
        }
        while (french[index]!=null) {
            index++;
            if(index==french.length){
                break;
            }  
        }
        if(index!=french.length){
            french[index]=key;
            english[index]=value;
            size++;
            System.out.println("Putting "+value+" is successful");
        }else{
            System.out.println("Putting "+value+" is failed");
        }
    }

    public String get(String key){
        String apk=null;
        for (int i=0;i<french.length;i++){
            if(french[i]==key){
                apk=english[i];
            }
        }
        return apk;
    }

    public int getSize(){
        return size;
    }
    public int hashFunction(String key){
        int hash=(key.hashCode()&0x7FFFFFFF)%english.length;
        return hash;
    }

    public void printHashTable(){
        System.out.println("--- Hash Table---");
        for(int i=0;i<french.length;i++){
            System.out.println(i+" "+french[i]+" "+english[i]);
        }
    }
}
