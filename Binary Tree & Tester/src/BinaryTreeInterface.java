public interface BinaryTreeInterface<E extends Comparable>
{
	public String preOrder();
	public String inOrder();
	public String postOrder();
	public String preOrder(TNode start);
	
	public String inOrder(TNode start);
	
	public String postOrder(TNode start);
	
	public E minValue();
	
	public E maxValue();
	
	public int maxDepth();
	
	public void clear();
	
	public int size();
	
	public boolean empty();
	
	public boolean contains(E data);
	
	public boolean insert(E data);
	
	public boolean add(E data);
	
	public boolean remove(E data);
}