/**
   A tester class for ArrayList
*/
public class ArrayListTester
{
   public static void main(String[] args)
   {
      ArrayList staff = new ArrayList();
      staff.addLast("Apple");
      staff.addLast("Orange");
      for (int i = 1; i <= 10; i++)
      {
         staff.addLast("Tomato" + i);      
      }
      staff.add(0, "Grape");
      staff.remove(1);
      staff.removeLast();
      for (int i = 0; i < staff.size(); i++)
      {
         System.out.println(staff.get(i));
      }
   }
}