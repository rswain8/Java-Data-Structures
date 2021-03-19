public class TNode<E extends Comparable> {

    private E data;
    private TNode<E>left;
    private TNode<E>right;

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public TNode<E> getLeft() {
        return left;
    }

    public void setLeft(TNode<E> left) {
        this.left = left;
    }

    public TNode<E> getRight() {
        return right;
    }

    public void setRight(TNode<E> right) {
        this.right = right;
    }

    public TNode(E data){
        this.data=data;
        left=null;
        right=null;

    }
    public String toString(){
        return ""+data.toString();
    }
}
