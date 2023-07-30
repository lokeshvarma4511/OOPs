package exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a=4;
        int b=0;
        try
        {
//            divide(a, b);
            String str = "loki";
            if (str.equals("loki")) {
                throw new MyException("Nam is loki");
            }
        }
        catch (MyException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Completed");
        }
    }

    static int divide(int a , int b) throws ArithmeticException
    {
        if (b==0)
        {
            throw new ArithmeticException("b is 0");
        }
        return a/b;
    }
}
