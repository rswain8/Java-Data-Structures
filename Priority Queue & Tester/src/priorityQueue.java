public class priorityQueue<E extends Comparable> implements PriorityQueueInterface<E> {

    minimumHeap<E>minHeap;

    public priorityQueue(){
        minHeap=new minimumHeap<>();
    }

    public boolean add(E o)
    {
        minHeap.add(o);
        return true;
    }
    public boolean offer(E o){
        return add(o);
    }
    public E poll(){
        return minHeap.remove();
    }
    public E remove(){
        return poll();
    }
    public int size(){
        return minHeap.size();
    }
    public boolean empty() {
        return minHeap.empty();
    }
    public void clear(){
        minHeap.clear();
    }
    public E get(int x){
        return minHeap.get(x);
    }
    public E set(int x, E item){
        return minHeap.set(x,item);
    }
    public E peek(){
        return minHeap.get(0);
    }
    public String toString(){
        return minHeap.toString();
    }
}
