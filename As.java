import java.util.*;

public class As
{  
public static void main(String args[])  
{  
System.out.print("Enter a character: ");  
Scanner sc=new Scanner(System.in);  
char chr = sc.next(); 
int asciiValue = chr;  
System.out.println("ASCII value of " +chr+ " is: "+asciiValue);  
}  
}