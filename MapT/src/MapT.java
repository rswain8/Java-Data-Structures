import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MapT<K,V> implements MapInterface<K,V> {

    ArrayList<MapEnt<K, V>> map = new ArrayList<>();
    ArrayList<MapEnt>set=new ArrayList<>();
    String v;
    Integer k;

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        MapT<Integer,String>maap=new MapT<>();
        maap.put(1,"bob");
        maap.put(2,"Tedd");
        maap.put(3,"Snake");
        maap.put(1,"Tina");

        maap.printMenu();
        int c=s.nextInt();

        while(c!=10)
        {
            if(c==1)
            {
                maap.clear();
            }
            if(c==2)
            {
                System.out.print("Which key are you looking for ");
                int k=s.nextInt();
                System.out.println(maap.containsKey(k));
            }
            if(c==3)
            {
                System.out.println("Which value are you looking for ");
                String k=s.next();
                System.out.println(maap.containsValue(k));
            }
            if(c==4)
            {
                System.out.print("what key are you using ");
                int key=s.nextInt();
                System.out.println("The value that corresponds to the given key is "+maap.get(key));
            }
            if(c==5)
            {
                System.out.print("Enter a key and a value ");
                int key=s.nextInt();
                String value=s.next();

                String ss=maap.put(key,value);

                if(ss!=null)
                System.out.println(ss+" was the replaced value");
            }
            if(c==6)
            {
                System.out.print("What key do you want to remove ");
                int key=s.nextInt();
                if(maap.containsKey(key))
                    System.out.println(key+" was removed");
                else
                    System.out.println("Key not found");

               maap.remove(key);

            }
            if(c==7)
            {
                System.out.println("The maps size is "+maap.size());
            }
            if(c==8)
            {
                for(MapEnt x: maap.map)
                    System.out.print(x.toString()+" ");

                System.out.print("\n");
            }
            if(c==9)
            {
                System.out.println(maap.isEmpty());
            }
            maap.printMenu();
            c=s.nextInt();

        }













    }
    public void printMenu()
    {
        System.out.println("1. Clear\n2. Contains Key\n3. Contains Value\n4. Get\n5. Put\n6. Remove\n7. Size\n8. Print all entries\n9. Is empty\n10. Exit");
    }

    public void clear() {
        map.clear();
    }

    public boolean containsKey(K key) {
        for (MapEnt x : map) {
            if (x.getKey() == key)
                return true;
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (MapEnt x : map) {
            if (x.getValue().equals(value))
                return true;
        }
        return false;
    }

    public setClass<MapEnt<K, V>> entrySet() {
        //making a set of mapEnt
        setClass<MapEnt<K,V>>set=new setClass<>();
        for(int x=0; x<map.size(); x++)
            set.add(map.get(x));

        return set;
    }

    public V get(K o) {
        for(int x=0; x<map.size(); x++) {

        if(map.get(x).getKey()==o)
            return map.get(x).getValue();
        }
        return null;

    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public setClass<K> keySet() {
        setClass<K>keySet=new setClass<>();
        for(int x=0; x<map.size(); x++)
            keySet.add(map.get(x).getKey());

        return keySet;
    }

    public V put(K key, V value) {
        V retur=null;
			if(map.size()==0)
				map.add(new MapEnt(key,value));

        for(int x=0; x<map.size(); x++)
        {
            if(map.get(x).getKey()==key)
            { retur=map.get(x).getValue();
                System.out.println(map.remove(x)+" was replaced");
                map.add(x,new MapEnt<K,V>(key,value));
                
            break;}
            else
            {map.add(x,new MapEnt<K,V>(key,value));
            
            break;}



        }
        return retur;


    }

    public int size() {
        return map.size();
    }

    public V remove(K key) {
        V xx=null;
        for(int x=0; x<map.size(); x++) {
        if(map.get(x).getKey()==key)
        {xx=map.get(x).getValue();
            map.remove(x);}



        }
        return xx;

    }

    public ArrayList<V> values() {
        ArrayList<V>r=new ArrayList<>();
        for(int x=0; x<map.size(); x++)
            r.add(map.get(x).getValue());

        return r;

    }





}








