public class exceptionHandling {
    public static void main(String[] args) {
        try{
            int data = 100/0;
        } catch(ArithmeticException e){System.out.println(e);
            System.out.println("rest of the code");
        }

        

        try{
            String s = null;  
            if ("gfg".equals(s))
                System.out.print("same");
            else
                System.out.print("not same");     
        } catch(NullPointerException e)
        {
            System.out.print("Caought");
        }
    }
}