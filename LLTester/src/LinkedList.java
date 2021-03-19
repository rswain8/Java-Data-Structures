public class LinkedList<E>
{
    LLNode<E> first;
    LLNode<E> last;
    public static int size=0;
    public LinkedList(LLNode<E> first)
    {
        this.first=first;
        last=first;
    }
    public LLNode removeFirstNode()
    {LLNode retur=first;
      first=first.getNext();
        return retur;     }
    public LLNode removeLastNode()
    {LLNode retur=last;
        last=last.getNext();
        return retur;     }
    public void addFirst(E data)
    {
        if(empty())
        { first.setData(data);
        last.setData(data);}
        LLNode newF=new LLNode(data);
        newF.setNext(first);
        first=newF;
    }
    public E get(int x)
    {
        LLNode<E> current=first;
        int index=0;
        while(true)
        {
            if(index==x)
                return current.getData();
            if(current.getNext()!=null)
            current=current.getNext();
            x++;
        }

    }
    public void addLast(E data)
    {
        if(empty())
        { first.setData(data);
            last.setData(data);}
        else {
            LLNode newL = new LLNode(data);
            last.setNext(newL);

            last = newL;
        }

    }
    public void clear()
    {
        first=null;
        last=null;
    }
    public int size()
    {
        size=0;
        LLNode current=first;
        while(true)
        {
            if(current!=null) {
                size++;
                current = current.getNext();
            }

            else
                break;

        }
        return size;
    }
    public String toString(){
        String retur="";
        LLNode current=first;
        while(current!=null) {
            retur +=" "+ current.toString();
            current = current.getNext();
        }
        return retur;

    }

    public boolean empty()
    {
        return first==null;
    }
    public E gett(int x)
    {
        int index=1;
        E retur=null;
        LLNode<E> current=first;
        while(true)
        {
            if(current!=null && index==x)
                retur=current.getData();
            else if(current!=null)
                current=current.getNext();
            else
                break;

        }
        return retur;
    }
    public E remove(int x)
    {
        E remove=null;
        LLNode<E> current=first;
        LLNode<E> before=null;
        int index=0;
        try{
        if(x==0)
        {LLNode<E> beforee=first;
            first=first.getNext();
         return beforee.getData();
            /*remove = current.getData();
                before=current.getNext();
                current=current.getNext().getNext();

            while(true) {

                before.setNext(current.getNext());
                current.setData(current.getNext().getData());
                if(current.equals(last))
                {
                    before.setNext(current.getNext());
                    current.setData(current.getNext().getData());
                    break;
                }
                before=current;
                current=current.getNext();
            }
            return remove;*/
        }

            while (true) {
                if (index == x && current!=null) {
                    remove = current.getData();
                    before.setNext(current.getNext());
                    current.setData(current.getNext().getData());
                    current.setNext(current.getNext().getNext());
                    while (true) {

                        current.setData(current.getNext().getData());
                        current = current.getNext();
                        if (current.getNext()!=null)
                            break;


                    }
                    break;

                }


                before = current;
                current = current.getNext();
                index++;
            }

            if(x==size()-1)
            {

                while(true)
                {
                    if(current.equals(last))
                        current.setNext(new LLNode(null));



                        current=current.getNext();
                }
            }
        }
        catch(Exception e)
        {}

        return remove;
    }
    public void set(int index, E item)
    {
        int x=0;
        LLNode current=first;
        while(x<=index)
        {
            if(x==index)
                current.setData(item);

           x++;
           current=current.getNext();
        }

    }
    public void add(int x, E ob)
    {
        int index=0;
        boolean xx=true;
        LLNode current=first;
        LLNode add=new LLNode(ob);
        if(x==0) {
            addFirst(ob);
            xx = false;
        }
        else if(x==size()-1){
            addLast(ob);
            xx=false;
        }
        else if(x==size()){

        }
        while(xx)
        {
            if(index==x-1) {
                add.setNext(current.getNext());
                current.setNext(add);
                break;

            }




            if(current!=last)
            current=current.getNext();

            x++;
        }
    }







    public E getFirst() {
        return first.getData();
    }

    public void setFirst(E first) {
        setFirstNode(new LLNode<E>(first));

    }

    public E getLast() {
        return last.getData();
    }

    public void setLast(E last) {
        setLastNode(new LLNode<E>(last));
    }



    public LLNode<E> getFirstNode() {
        return first;
    }

    public void setFirstNode(LLNode<E> first) {
        this.first = first;
    }

    public LLNode<E> getLastNode() {
        return last;
    }

    public void setLastNode(LLNode<E> last) {
        this.last = last;
    }
}