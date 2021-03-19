public class DoublyCircularLinkedList<E> implements DoublyCircularLinkedListInt<E>
{
	// use chapter notes to code this file

    DLLNode<E> first;
    DLLNode<E> last;
    public static int size=0;
    public DoublyCircularLinkedList(){
        first=null;


        last=null;

    }
    public DLLNode<E> getFirstNode(){

    return first;
    }

    public DLLNode<E> getLastNode(){
        return last; }

    public E getFirst(){return first.getData();}

    public E getLast(){return last.getData();}

    public E removeFirst(){
        E retur=first.getData();
        first=first.getNext();
        last.setNext(first);
        first.setPrev(last);





            return retur;

    }

    public E removeLast(){
        E retur=last.getData();
        last=last.getPrev();
        last.setNext(first);
        first.setPrev(last);
        return retur;
    }

    public void addFirst(E data){
        DLLNode<E> s=new DLLNode(data);
        if(size()==0){
            s.setNext(s);
            s.setPrev(s);
            first=s;
            last=first;


        }
        else{

        s.setPrev(last);
        last.setNext(s);
        first.setPrev(s);
        s.setNext(first);
        first=s;



      }
    }

    public void addLast(E data){
        DLLNode<E> s=new DLLNode(data);
        if(size()==0){
           s.setNext(s);
           s.setPrev(s);
            first = s;
            last=s;

        }
        else {

            s.setPrev(last);
            last.setNext(s);
            first.setPrev(s);
            s.setNext(first);
            last=s;

        }
    }

    public void clear(){
        first=null;
        last=null;
    }

    public int size(){

        size=0;
        DLLNode current=first;
        if(first!=null && first.equals(last))
            return 1;
        else if(last==null)
            return 0;

        do{

            current=current.getNext();
            size++;
        }while(current!=first);
        return size;
    }

    public E get(int x){
        int index=0;
        DLLNode<E> current=first;
        E retur=null;
        do{
            if(index==x)
            {retur=current.getData();
            break;}
            current=current.getNext();
            index++;

        }while(true);
        return retur;

    }

    public void add(int x, E data){
        DLLNode<E>current=first;
        DLLNode<E>s=new DLLNode<>(data);
        if(x==0)
            addFirst(data);
        else if(x==size())
            addLast(data);
        else {
            for (int index = 1; index <size(); index++) {
                if (index == x) {
                    DLLNode<E>  nex = current.getNext();
                    current.setNext(s);
                    s.setPrev(current);
                    s.setNext(nex);
                    nex.setPrev(s);


                }
                current = current.getNext();

            }
        }
    }

    public E remove(int x){
        E data=null;
        DLLNode<E>current=first.getNext();
        if(x==0){
            return removeFirst();
        }
        else if(x==size()-1)
            return removeLast();
        else {
            for (int index =1; index <= size(); index++) {

                if (index == x) {
                    data = current.getData();
                    DLLNode<E> prev = current.getPrev();
                    DLLNode<E> nex = current.getNext();

                    prev.setNext(nex);
                    nex.setPrev(prev);

                }

                current = current.getNext();


            }
        }

        return data;
    }

   public E set(int x, E data){
        DLLNode<E>current=first;
        int index=0;
        E retur=null;
        while(true){
            if(index==x) {
                retur = current.getData();
                current.setData(data);
            }

            index++;
            current=current.getNext();
            if(index==size())
                break;
        }

        return retur;

   }

   public boolean empty(){
       return first==null;
   }
}