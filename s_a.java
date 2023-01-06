import java.util.*;
class s_a
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int no[]=new int[5];
		for (int i=0;i<5;i++)
		{
			System.out.print("enter no:"+i+":");
			no[i]=sc.nextInt();
		}
		System.out.print("\t------\n");
		for (int i=0;i<5;i++)
		{
			System.out.println("no is:"+i+":"+no[i]);
		}
	}	
}