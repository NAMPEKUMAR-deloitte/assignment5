
import java.io.*;
import java.util.*;
public class passwordvalidation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String st= sc.next();
        if(st.length()<5 || st.length()>10)
        {
            System.out.println("Password should have 5 to 10 Characters");
        }
        else
        {
            boolean U=false,L=false,SP=false,NM=false;
            for (int i = 0; i < st.length(); i++) {
                char c = st.charAt(i);
                if (Character.isDigit(st.charAt(i))) {
                    NM = true;

                } else if (Character.isUpperCase(c)) {
                    U = true;

                } else if (Character.isLowerCase(c)) {
                    L = true;

                } else if (!Character.isLetterOrDigit(st.charAt(i))) {
                    SP = true;

                }
            }
            if ( NM && U && L && SP)
            {
                System.out.println("Password is valid");
            }
            else {
                if (!NM)
                {
                    System.out.println("Password should contain atleast on numeber");
                }
                if (!U)
                {
                    System.out.println("Password should contain atleast one Uppercase letter");
                }
                if (!L)
                {
                    System.out.println("Password should contain atleast one LowerCase letter");
                }
                if (!SP)
                {
                    System.out.println("Password should contain atleast one Special Charcter");
                }
            }
        }
    }
}
