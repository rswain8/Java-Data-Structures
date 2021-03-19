public class LLNode<E>
{
	public E data;
	public LLNode<E>next;

	public LLNode(E data)
    {
        this.data=data;
        next=null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public LLNode<E> getNext() {
        return next;
    }

    public void setNext(LLNode<E> next) {
        this.next = next;
    }
    public String toString()
    {
        return data.toString();
    }
}
