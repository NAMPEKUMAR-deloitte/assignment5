public class ExceptionHandling {
    public static void main(String args[])
    {
        try
        {
            System.out.println("::Try block::");
            int num=98/0;
            System.out.println(num);
        }
        catch (ArithmeticException e)
        {
            System.out.println("::catch block::");
            System.out.println("ArithmeticException::Number divided by Zero");
        }
        finally
        {
            System.out.println("::finally block");
        }
        System.out.println("thank you");
    }
}
