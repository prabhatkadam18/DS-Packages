import java.util.*;
import prabhat_ds.*;
// import prabhat.ds.DoublyLinkedList;

public class Demo{
  public static void main(String args[]){
    SinglyLinkedList l = new SinglyLinkedList();
    for(int i =0;i<5;i++){
      l.addLast(i);
      l.addFirst(3*i);
    }
    l.removeFirst();
    // l.addLast(1);

    // l.addLast(2);
    System.out.println(l.toString());
  }
}