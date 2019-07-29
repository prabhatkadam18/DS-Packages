import java.util.*;
import prabhat_ds.*;
// import prabhat.ds.DoublyLinkedList;

public class Demo{
  public static void main(String args[]){
    CircularlyLinkedList<Integer> l = new CircularlyLinkedList<Integer>();
    // for(int i =1;i<5;i++){
    //   l.addLast(i);
    //   l.addFirst(3*i);
    // }
    l.addLast(1);
    l.addLast(2);
    l.addLast(3);
    l.addFirst(4);
    System.out.println(l.toString());
    l.rotate();
    //  l.removeFirst();
    // l.addLast(1);

    // l.addLast(2);
    System.out.println(l.toString());
  }
}