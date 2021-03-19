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
        DLLNode current=first;
        first.setPrev(last);

        do{
            current=current.getNext();
        } while(current.getNext()!=last);




            return retur;

    }

    public E removeLast(){
        E retur=last.getData();
        first.setPrev(first.getPrev().getPrev());
        first.getPrev().setNext(first);
        return retur;
    }

    public void addFirst(E data){
        DLLNode<E> s=new DLLNode(data);
        if(size()==0){
            first=s;
            last=s;
            first.setNext(last);
            first.setPrev(last);
            last.setNext(first);
            last.setPrev(first);

        }
        else{

        s.setPrev(last);
        s.setNext(first);
        first.setPrev(s);
            first=s;
            last.setNext(first);


      }
    }

    public void addLast(E data){
        DLLNode<E> s=new DLLNode(data);
        if(size()==0){
            last=s;
            last.setNext(first);
            last.setPrev(first);
            first.setNext(last);
            first.setPrev(last);
        }
        else {

            last.setNext(s);
            s.setNext(first);
            s.setPrev(last);

            last = s;
            first.setPrev(last);

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
        DLLNode<E> s=new DLLNode(data);
        DLLNode current=first;
        int index=0;
        if(x==0)
            addFirst(data);
        else if(x==size())
           addLast(data);
         else{
        while(true){
            if(index==x-1) {
                DLLNode<E> nex = current.getNext();
                current.setNext(s);
                s.setPrev(current);
                nex.setPrev(s);
                s.setNext(nex);
                break;
            }



            current=current.getNext();
            index++;

        }}






    }

    public E remove(int x){
        E remove=null;
        DLLNode<E> current=first;
        DLLNode<E> before=first.getPrev();
        DLLNode<E> rem=new DLLNode(get(x));
        int index=0;
    if(x==0)
    {   removeFirst();
    return rem.getData();}
    else if(x==size()-1)
    {removeLast();
    return rem.getData();}
    else{
        do{
            if(x==index){
                while(current.getNext()!=first){
                    current.setData(current.getNext().getData());
                    current.setPrev(before);
                    if(current.getNext().equals(last)){
                        current.setNext(first);
                           continue;}
                    before=current;
                    current=current.getNext();
                }
                    return rem.getData();
            }

            current=current.getNext();
            before=current;
            index++;
        }while(current.getNext()!=first);}



        return remove;
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