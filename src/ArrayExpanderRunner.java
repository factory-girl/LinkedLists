public class ArrayExpanderRunner
{
   public static void main(String[] args)
   {
      ArrayExpander ae = new ArrayExpander();
      System.out.println(ae);
      ae.add("a");
      ae.add("b");
      System.out.println(ae);
      ae.add("c");
      ae.add("d");  
      ae.add("e");
      ae.add("f");
      ae.add("g");
      ae.add("h");  
      System.out.println(ae);
      ae.add("i");
      System.out.println(ae);
   }
}