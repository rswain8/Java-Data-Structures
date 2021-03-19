import java.util.*;
public class MainFile
{
	public static void main(String[]args)
	{
		Scanner keyboard= new Scanner(System.in);
	
		int choice;
		DoublyCircularLinkedList<String> ll = new DoublyCircularLinkedList<String>();
		ll.addFirst("3");
		ll.addLast("8");
		//ll.add(1,"4");
		//ll.add(0,"8");
		ll.remove(3);
		ll.remove(1);
		ll.addLast("6");

		//ll.add(2,"5");
		//ll.add(1,"3");
		if(true)
			{
				int x=0;
				DLLNode current=ll.getFirstNode();
				do{
					System.out.print(current.toString());

					current=current.getNext();
					x++;
				}while(x<=9);


			}
System.out.print("\n");
		if(true){
		 DLLNode current=ll.getLastNode();
		 int y=0;
		do{
			System.out.print(current.toString());
			current=current.getPrev();
			y++;
		}while(y<=9);

		System.out.println("\n"+ll.getFirst());
		System.out.println(ll.getLast());
		ll.set(1,"12");
		int c=0;
		do{
			System.out.print(current.toString());

			current=current.getNext();
			c++;
		}while(c<=9);}



		do
		{
			System.out.print("\n-Menu-\n");
			System.out.println("1. Print X Forward");
			System.out.println("2. Print X Backward");
			System.out.println("3. Print First");
			System.out.println("4. Print Last");
			System.out.println("5. Get Location");
			System.out.println("6. Remove First");
			System.out.println("7. Remove Last");
			System.out.println("8. Remove X");
			System.out.println("9. Add First");
			System.out.println("10. Add Last");
			System.out.println("11. Insert");
			System.out.println("12. Set X");
			System.out.println("13. Size");
			System.out.println("14. Is Empty");
			System.out.println("15. Clear");
			System.out.println("0. Exit");
			System.out.print("Enter selection: ");
			choice= keyboard.nextInt();
			
			System.out.println();
			if(choice==1)
			{
				DLLNode current=ll.getFirstNode();
				do{
					System.out.print(current.toString());

					current=current.getNext();

				}while(!current.equals(ll.getFirstNode()));

				
			}
			if(choice==2)
			{
				DLLNode current=ll.getLastNode();


				do{
					System.out.print(current.toString());
					current=current.getPrev();
			}while(!current.equals(ll.getLastNode()));

			}
			if(choice==3)
			{
				System.out.println(ll.getFirst());
			}
			if(choice==4)
			{
				System.out.println(ll.getLast());
			}
			if(choice==5)
			{
				System.out.print("Enter a index");
				int index=keyboard.nextInt();
				System.out.println(ll.get(index));
			}
			if(choice==6)
			{
				System.out.println(ll.removeFirst());
			}
			if(choice==7)
			{
				System.out.println(ll.removeLast());
			}
			if(choice==8)
			{
				System.out.print("Enter a index");
				int index=keyboard.nextInt();
				System.out.println(ll.remove(index));
			}
			if(choice==9)
			{
				System.out.print("Enter a value");
				String s=keyboard.next();
				ll.addFirst(s);
			}
			if(choice==10)
			{
				System.out.print("Enter a value");
				String s=keyboard.next();
				ll.addLast(s);
			}
			if(choice==11)
			{
				System.out.print("Enter a String and then a index");
				String s=keyboard.next();
				int index=keyboard.nextInt();
				ll.add(index,s);
			}
			if(choice==12)
			{
				System.out.print("Enter a value and a index");
				String s=keyboard.next();
				int index=keyboard.nextInt();
				System.out.println(ll.set(index,s)+" was removed");
			}
			if(choice==13)
			{
				System.out.println(ll.size());
			}
			if(choice==14)
			{
				System.out.println(ll.empty());
			}
			if(choice==15)
			{
				ll.clear();
			}
			if(choice==0)
				break;
	
		}while(true);
	
		System.out.print("\nGood Bye!!");

		System.out.println("\n\nEnter \"exit\" to quit");
		keyboard.next();
	}
}