import java.util.Iterator;
import java.util.Scanner;
public class LLTester {

        public static void main(String[]args)
        {
            Scanner keyboard= new Scanner(System.in);

            int choice;
            LinkedList<String> ll = new LinkedList<String>(new LLNode("5"));

            ll.addFirst("6");
           ll.addLast("7");
            ll.add(0,"44");
            ll.add(4,"17");
            ll.add(3,"75");
            System.out.println(ll.size());
            ll.addFirst("3");
            System.out.println(ll.remove(ll.size()-1));
            System.out.println(ll.remove(0));
            ll.addFirst("99");
            System.out.println(ll.toString());
            System.out.println(ll.getFirst());
            System.out.println(ll.getLast());
            System.out.println(ll.size());










            /*do
            {
                System.out.print("\n-Menu-\n");
                System.out.println("1. Size");
                System.out.println("2. Print");
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
                System.out.println("13. Is Empty");
                System.out.println("14. Clear");
                System.out.println("0. Exit");
                System.out.print("Enter selection: ");
                choice= keyboard.nextInt();

                System.out.println();
                if(choice==1)
                {
                System.out.println(ll.size());
                }
                if(choice==2)
                {
                    System.out.println(ll.toString());

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
                    System.out.println("Enter a location ");
                    int x=keyboard.nextInt();

                    System.out.println(ll.get(x));
                }
                if(choice==6)
                {
                    System.out.println(ll.remove(0));
                }
                if(choice==7)
                {
                    System.out.println(ll.remove(ll.size()-1));
                }
                if(choice==8)
                {
                    System.out.print("Where do you want to remove ");
                    int x=keyboard.nextInt();
                    System.out.println(ll.remove(x));
                }
                if(choice==9)
                {
                    System.out.println("Enter a String to add");
                    String s=keyboard.next();
                    ll.addFirst(s);
                }
                if(choice==10)
                {
                    System.out.println("Enter a String to add");
                    String s=keyboard.next();
                    ll.addLast(s);
                }
                if(choice==11)
                {
                    System.out.println("Enter a String and a Index to add");
                    String s=keyboard.next();
                    int x=keyboard.nextInt();
                    ll.add(x,s);
                }
                if(choice==12)
                {
                    System.out.println("Enter a String and a Index to set");
                    String s=keyboard.next();
                    int x=keyboard.nextInt();
                    ll.set(x,s);
                }
                if(choice==13)
                {
                    System.out.println(ll.empty());
                }
                if(choice==14)
                {
                    ll.clear();
                }
                if(choice==0)
                    break;

            }while(true);

            System.out.print("\nGood Bye!!");

            System.out.println("\n\nEnter \"exit\" to quit");
            keyboard.next();*/
        }
        
    }

