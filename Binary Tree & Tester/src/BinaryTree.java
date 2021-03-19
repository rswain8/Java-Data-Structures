public class BinaryTree<E extends Comparable>implements BinaryTreeInterface<E>
{
    TNode<E> root;
    String result="";
    int depth=0;
    int currentDepth=0;
    public int size=1;
    public TNode<E>smallestSubNode=null;
    public TNode<E>biggestSubNode=null;
    public BinaryTree(E data){
        root=new TNode<E>(data);
    }
    public String preOrder(){

        result="";
        return preOrder(root);
    }
    public String preOrder(TNode start)
    {
        if(start!=null) {
            result+=" "+start.getData();
            preOrder(start.getLeft());
            preOrder(start.getRight());
        }
        return result;

    }
    public String inOrder(){
        result="";
        return inOrder(root);
    }
    public String inOrder(TNode start){
        if(start!=null){
            inOrder(start.getLeft());
            result+=" "+start.getData();
            inOrder(start.getRight());
        }
        return result;
    }
    public String postOrder(){
        result="";
        return postOrder(root);
    }
    public String postOrder(TNode start){
        if(start!=null){
            postOrder(start.getLeft());
            postOrder(start.getRight());
            result+=" "+start.getData();
        }
        return result;
    }
    public boolean add(E data){
        return add(data,root);
    }
    public boolean add(E data,TNode<E> start){


        if(data.compareTo(start.getData())>0)
        {if(start.getRight()==null)
            start.setRight(new TNode(data));
         else

        {add(data,start.getRight());
        size--;
         }
        }
        if(data.compareTo(start.getData())<0){
            if(start.getLeft()==null)
                start.setLeft(new TNode(data));
            else
            {
                add(data,start.getLeft());
                size--;
                }
        }
        size++;
        return true;
    }
    public int maxDepth(){
        return maxDepth(root,0);
    }
    public int maxDepth(TNode<E>start, int cd) {
        if(start.getLeft()!=null && start.getRight()!=null) {
            cd++;
            maxDepth(start.getLeft(),cd);
            maxDepth(start.getRight(),cd);
        }
        else if(start.getLeft()!=null){
            cd++;
            maxDepth(start.getLeft(),cd);
        }
        else if(start.getRight()!=null) {
            cd++;
            maxDepth(start.getRight(),cd);
        }
        else{
            if(cd>depth)
                depth=cd;

            cd=0;}

            return depth;
    }
    public E minValue(){
        return minValue(root);
    }
    public E minValue(TNode<E> start){
        if(start.getLeft()!=null){
            minValue(start.getLeft());
        }
        return start.getData();
    }
    public E maxValue(){
        return maxValue(root);
    }
    public E maxValue(TNode<E>start){
        if(start.getRight()!=null) {
            maxValue(start.getRight());
        }
        return start.getData();
    }

    //public int maxDepth(){
   // return depth;
   // }

    public void clear(){
        root=null;
    }

   public int size(){
        return size;
   }

    public boolean empty(){
       return root==null;
    }
    public boolean contains(E data){
        boolean contain=false;
        String preOrder=preOrder();
        return preOrder.contains(data.toString());
    }

    public boolean insert(E data){
        return add(data);
    }



    public boolean remove(E data){
        if(!contains(data))
            return false;
        size--;
        TNode<E>t=search(data);
        TNode<E>par=searchForParent(data);
        if(t.equals(root))
        {
            if(root.getLeft()==null)
                root=root.getRight();
            else {
                TNode<E> rightSide = root.getRight();
                root = root.getLeft();
                root.setRight(rightSide);
                remove(root.getLeft().getData());
            }
            return true;
        }
        //if T is the left child
        if (par.getLeft().getData().compareTo(data) == 0) {
            if (t.getLeft() == null && t.getRight() == null)
                par.setLeft(null);
            else if (t.getLeft() == null && t.getRight() != null) {
                par.setLeft(t.getRight());
            } else if (t.getLeft() != null && t.getRight() == null) {
                    par.setLeft(t.getLeft());
            } else {
                findSmallestSubTree(t.getRight());
                remove(smallestSubNode.getData());
                t.setData(smallestSubNode.getData());
            }
        }
        else if(par.getRight().getData().compareTo(data) == 0) {
            if (t.getLeft() == null && t.getRight() == null)
                par.setRight(null);
            else if (t.getLeft() == null && t.getRight() != null) {
                par.setRight(t.getRight());
            }
            else if (t.getLeft() != null && t.getRight() == null) {
                par.setRight(t.getLeft());
            }
            else {
                    findSmallestSubTree(t.getRight());
                    remove(smallestSubNode.getData());
                    t.setData(smallestSubNode.getData());


            }



        }



        return contains(data);
    }
    public void findSmallestSubTree(TNode<E>node){
        if(node.getLeft()!=null)
            findSmallestSubTree(node.getLeft());
        if( node.getLeft()==null)
            smallestSubNode=node;

    }
    public void findBiggestSubTree(TNode<E>node){
        if(node.getRight()!=null)
            findBiggestSubTree(node.getRight());
        if(node.getRight()==null){
            biggestSubNode=node;}
    }
    public TNode<E>searchForParent(E data){
        return searchForParent(root,data);
    }
    public TNode<E>searchForParent(TNode<E>start, E data){
        TNode<E>current=root;
        while(true){
            //System.out.println(current);
            if(current.getRight()!=null)
            {if(current.getRight().getData().compareTo(data)==0)
                return current;}
            if(current.getLeft()!=null)
            {if(current.getLeft().getData().compareTo(data)==0)
                    return current;}
            if(current.getData().compareTo(data)>0)
                     current=current.getLeft();
            else if(current.getData().compareTo(data)<0)
                     current=current.getRight();
            else
                break;

        }
        return null;

    }




    public TNode<E>search(E data){
        return search(root,data);
    }
    //fix search
    public TNode<E>search(TNode<E>start, E data){
        TNode current=root;


        while(true) {
            if(current.getData().compareTo(data)==0)
                return current;
            if (data.compareTo(current.getData()) > 0)
            {

                current = current.getRight();
            }

            else if(data.compareTo(current.getData())<0) {

                current = current.getLeft();
            }
            else if(data==null)
                return null;
        }





    }
}