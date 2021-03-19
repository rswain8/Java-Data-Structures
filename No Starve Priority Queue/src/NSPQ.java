public class NSPQ<E> extends priorityQueue<PriorityNode<E>> {


    @Override
    public PriorityNode<E> remove(){
        PriorityNode<E>retur=super.remove();
        for(int x=0; x<size(); x++)
            get(x).setPriority(get(x).getPriority()-1);

        return retur;
    }
}
