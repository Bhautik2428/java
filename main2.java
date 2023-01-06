import java.util.Random;
public class main2 
{
    public static void main(String[] args)
    {
        int length = 10; // password length
        System.out.println(generatePswd(length));
    }
    static char[] generatePswd(int len)
    {
        System.out.println("Your Password is :");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#$%^&*_=+-/€.?<>)";

        String passSymbols = charsCaps + chars + nums + symbols;
        Random rnd = new Random();
        
        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) 
        {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
            
        }
        return password;
    }
}
