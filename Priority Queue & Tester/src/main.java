import java.util.Scanner;
public class main {
    public static void main(String[]args){
        priorityQueue<Integer>pq=new priorityQueue<>();
       // pq.add(3);
       // pq.add
        //pq.add(7);
      //  System.out.println(pq.toString());
        Scanner s=new Scanner(System.in);
        printMenu();
        int choice=s.nextInt();
        while(choice!=7){
            if(choice==1){
                System.out.println(pq);
            }
            else if(choice==2){
                System.out.println("the size is: "+pq.size());
            }
            else if(choice==3){
                System.out.println(pq.empty());
            }
            else if(choice==4){
                System.out.print("Enter a number to add ");
                int adde=s.nextInt();
                pq.add(adde);
            }
            else if(choice==5){
                pq.remove();
            }
            else if(choice==6){
                pq.clear();
            }
            printMenu();
            choice=s.nextInt();
        }


    }
    public static void printMenu(){
        System.out.println("1. Print\n2. Size\n3. Empty\n4. Add\n5. Remove\n6. Clear\n7. Exit");
    }
}
