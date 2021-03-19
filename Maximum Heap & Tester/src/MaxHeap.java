
import java.util.ArrayList;

public class MaxHeap<E extends Comparable> implements  HeapInterface<E> {

    ArrayList<E>heap;
    public MaxHeap(){
        heap=new ArrayList<>();
    }



    public boolean add(E item){
      heap.add(item);
      int index;
      int parIndex;
      while(true){
          index=heap.indexOf(item);
          parIndex=(index-1)/2;
          if(heap.get(parIndex).compareTo(item)<0)
          {
              E par=heap.get(parIndex);
              heap.set(parIndex,item);
              heap.set(index,par);
          }
          else
              break;

      }
      return true;
    }

    public boolean insert(E item){
        return add(item);
    }

    public E remove(){
        E root=heap.get(0);
    heap.set(0,heap.get(heap.size()-1));
    heap.remove(heap.size()-1);
    filterDown(heap.get(0),0);


    return root;
    }
    public void filterUp(E item){
        if(item.compareTo(heap.get((heap.indexOf(item)-1)/2))>0)
        {
            int index=heap.indexOf(item);
            E par=heap.get((index-1)/2);
            heap.set((index-1)/2,item);
            heap.set(index,par);
            filterUp(item);
        }
    }
    public void filterDown(E item,int startIndex){
        int index=startIndex;
        int lIndex=(index*2)+1;
        int rIndex=(index*2)+2;
        E rChild=null;


        if(lIndex<heap.size()) {
            E lChild=heap.get(lIndex);
            if(heap.size()>rIndex)
            rChild=heap.get(rIndex);


            if (item.compareTo(lChild) < 0 ) {
                if (lChild != null && rChild == null) {
                    heap.set(lIndex, item);
                    heap.set(index, lChild);
                    filterDown(item,lIndex);
                } else if (lChild.compareTo(rChild) > 0) {
                    heap.set(lIndex, item);
                    heap.set(index, lChild);
                    filterDown(item,lIndex);
                } else if (rChild.compareTo(lChild) > 0) {
                    heap.set(rIndex, item);
                    heap.set(index, rChild);
                    filterDown(item,rIndex);
                }
                
            }
        }


    }
    public boolean empty(){
        return heap.get(0)==null;
    }

    public int size(){
        return heap.size();
    }

    public E get(int x){
        return heap.get(x);
    }

    public void clear(){
        heap.clear();
    }
    public String toString(){
        return heap.toString();
    }
}
