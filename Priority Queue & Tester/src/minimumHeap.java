import java.util.ArrayList;

public class minimumHeap<E extends Comparable>implements HeapInterface<E>{

    ArrayList<E> heap;

    public minimumHeap(){
        heap=new ArrayList<>();
    }
    public boolean add(E item){
        heap.add(item);
        filterUp(item,heap.size()-1);
        return true;
    }

    public boolean insert(E item){
        return add(item);
    }

    public E remove(){
        E retur=heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.set(heap.size()-1,retur);
        heap.remove(heap.size()-1);
        filterDown(heap.get(0),0);
        for(int x=0; x<heap.size(); x++)
            filterUp(heap.get(x),x);
        return retur;
    }

    public boolean empty()
    {return heap.isEmpty();}

    public int size(){return  heap.size();}

    public E get(int x){return heap.get(x);}

    public void clear(){heap.clear();}

    public E set(int x, E item){


        E retur=heap.get(x);
        heap.set(x,item);

        //if(heap.get(x).compareTo(heap.get((x-1)/2))<0)
            filterUp(heap.get(x),x);
        //else if(heap.get(x).compareTo(heap.get((x*2)+1))>0 || heap.get(x).compareTo(heap.get((x*2)+2))>0)
            filterDown(heap.get(x),x);

        for(int xx=0; xx<heap.size(); xx++)
            filterUp(heap.get(xx),xx);
        return retur;
    }

    public void filterUp(E item, int startIndex){
        if(item.compareTo(heap.get((startIndex-1)/2))<0)
        {
            int index=startIndex;
            int parIndex=(index-1)/2;
            E par=heap.get(parIndex);

            heap.set(index,par);
            heap.set(parIndex,item);

            filterUp(item,parIndex);
        }
    }
    public void filterDown(E item,int startIndex){
        int index=startIndex;
        int lIndex=(index*2)+1;
        int rIndex=(index*2)+2;



    if(lIndex<heap.size()) {
        E lChild=heap.get(lIndex);
        E rChild=null;
        if(rIndex<heap.size())
         heap.get(rIndex);
        if (lChild != null && rChild == null) {
            heap.set(index, lChild);
            heap.set(lIndex, item);

        }
        else if(item.compareTo(lChild) > 0 || item.compareTo(rChild) > 0) {
            if (lChild.compareTo(rChild) < 0) {
                heap.set(lIndex, item);
                heap.set(index, lChild);
                index=lIndex;
            } else if (rChild.compareTo(lChild) < 0) {
                heap.set(rIndex, item);
                heap.set(index, rChild);
                index=rIndex;
            }
            filterDown(item,index);
        }
    }


        }
        public String toString(){
            return heap.toString();
    }

}


