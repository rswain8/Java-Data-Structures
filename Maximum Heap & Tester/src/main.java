import java.util.Scanner;
public class main {


    public static void main(String[]args) {
        MaxHeap<Integer>heap=new MaxHeap<>();
        heap.add(4);
        heap.add(9);
        heap.add(12);
        heap.add(17);
        heap.add(6);
        heap.add(5);
        System.out.println(heap);
        heap.remove();
        System.out.println(heap);
        heap.remove();
        System.out.println(heap);


    }


}
