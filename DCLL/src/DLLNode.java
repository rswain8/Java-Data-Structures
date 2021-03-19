public class DLLNode<E> {
    private E data;
    private DLLNode<E> next;
    private DLLNode prev;

    public DLLNode getPrev() {
        return prev;
    }

    public void setPrev(DLLNode prev) {
        this.prev = prev;
    }

    public DLLNode(E data)
    {
        this.data=data;
        this.prev=null;

        next=null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public DLLNode<E> getNext() {
        return next;
    }

    public void setNext(DLLNode<E> next) {
        this.next = next;
    }
    public String toString(){
        return data+" ";
    }
}
