import java.util.Scanner;
public class main {
    public static void main(String[]args) {


        NSPQ<PriorityNode<String>> nspq = new NSPQ();
        nspq.add(new PriorityNode("bob", 1));
        nspq.add(new PriorityNode("tedd",-2));
        nspq.add(new PriorityNode("jane",14));
        System.out.println(nspq.toString());
        nspq.remove();
        System.out.println(nspq.toString());





    }


    


}
