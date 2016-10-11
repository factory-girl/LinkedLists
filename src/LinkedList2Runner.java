public class LinkedList2Runner
{
   public static void main(String[] args)
   {
       LinkedList2 myList = new LinkedList2();
       myList.addFirst("aaa");
       myList.addFirst("bbb");
       myList.addFirst("ccc");
       myList.addFirst("ddd");
       System.out.println(myList);
       System.out.println("Removed element:  " + myList.removeFirst());
       System.out.println("Removed element:  " + myList.removeFirst());
       System.out.println(myList);
   }
}