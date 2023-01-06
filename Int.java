interface Stud
{
	void sybca();
}
class bca implements Stud 
{
	public void sybca()
	{
		System.out.print("hello java");
	}
}	
class Int
{
	public static void main(String [] args)
	{
		Stud s=new bca();
		s.sybca();
	}
}