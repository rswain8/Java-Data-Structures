import java.util.*;
public class MainFile
{
	public static void main(String[]args)
	{
		Scanner keyboard= new Scanner(System.in);
	
		int choice;
		BinaryTree<Integer> tree = new BinaryTree<Integer>(5);
		tree.add(6);
		tree.add(7);
		tree.remove(5);
		System.out.println(tree.inOrder());





		/*do
		{
			System.out.print("\n-Menu-\n");
			System.out.println("1. Print");
			System.out.println("2. Size");
			System.out.println("3. Clear");
			System.out.println("4. Empty");
			System.out.println("5. Insert");
			System.out.println("6. Remove");
			System.out.println("7. Contains");
			System.out.println("8. Min Value");
			System.out.println("9. Max Value");
			System.out.println("10. Max Depth");
			System.out.println("0. Exit");
			System.out.print("Enter selection: ");
			choice= keyboard.nextInt();
			
			System.out.println();
			if(choice==1)
			{
				
			}
			else if(choice==2)
			{
				
			}
			else if(choice==3)
			{
				
			}
			else if(choice==4)
			{
				
			}
			else if(choice==5)
			{
				
			}
			else if(choice==6)
			{
				
			}
			else if(choice==7)
			{
				
			}
			else if(choice==8)
			{
				
			}
			else if(choice==9)
			{
				
			}
			else if(choice==10)
			{
				
			}
			if(choice==0)
				break;
	
		}while(true);
	*/
		//System.out.print("\nGood Bye!!");

		//System.out.println("\n\nEnter \"exit\" to quit");
		//keyboard.next();
	}
}