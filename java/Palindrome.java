
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="1112110";
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)//i=>0,i<15,i=14
		{
		s1= s1 + s.charAt(i);
		}
		System.out.println(s1);

	if(s1.equals(s))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}
	

	}

}
