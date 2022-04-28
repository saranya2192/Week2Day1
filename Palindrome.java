package Week2.day1;
public class Palindrome {
	public static void main(String[] args) {
		String word = "madam";
				 String rev = "";
		for(int i = word.length()-1; i>=0; i--)
		{
			rev = rev + word.charAt(i);//
			
		}System.out.println(rev);
		if(word.equals(rev))
		{			
		System.out.println("Palindrome");
		}
				else
				{
					System.out.println("not palindrome");
	}
	}
}