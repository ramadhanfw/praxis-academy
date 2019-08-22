package anotation.src.main.java.anotation;

class anotation
{
     public void display()
     {
         System.out.println("Base display()");
     }
}
class Derived extends anotation
{
     @Override
     public void display(int x)
     {
         System.out.println("Derived display(int )");
     }

     public class main3 {
     public static void main(String args[])
     {
         Derived obj = new Derived();
         obj.display();
     }
    }
}