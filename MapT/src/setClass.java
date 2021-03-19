import java.util.ArrayList;
import java.util.Iterator;

public class setClass<K> {

    ArrayList<K> data=new ArrayList<>();





    public boolean add(K o)
    {
        data.add(o);
        return true;
    }

    public void clear()
    {
        data.clear();
    }
    public boolean contains(K o)
    {
        if(data.contains(o))
            return true;
        else
            return false;
    }
    public boolean isEmpty()
    {
        if(data.size()==0)
            return true;
        else
            return false;
    }
    public Iterator<K> iterator()
    {
        return data.iterator();
    }
    public boolean remove(K o)
    {
        if(data.remove(o))
            return true;
        else
            return false;
    }
    public int size()
    {
        return data.size();
    }
    public Object[] toArray()
    {
        return data.toArray();
    }

}
