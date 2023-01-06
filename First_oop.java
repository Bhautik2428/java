import java.util.*;
class one 
{
    //Scanner sc= new Scanner(System.in);
    //System.out.print("Enter A:");
    int a=10;

    //System.out.print("enter B:");
    int b=5;
}
class First_oop
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        one o =new one ();
        System.out.print("enter your choice no :");
        int choice=sc.nextInt();
        switch(choice)
        {
        case 1:  
            System.out.print("sum is:"+(o.a+o.b));
            break;
        case 2:
            System.out.print("sum is:"+(o.a-o.b));
            break;

        case 3:
            System.out.print("sum is:"+(o.a*o.b));
            break;
        case 4:
            System.out.print("sum is:"+(o.a/o.b));
            break;
        default:
            System.out.print("pls enter 1 2 3 4 ..............");
            break;
       } 
    }
}