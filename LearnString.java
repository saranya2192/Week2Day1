package Week2.day1;

public class LearnString {
	public static void main(String[] args) {
		String text="testleaf";
		char[] charArray = text .toCharArray();
		int count=0;
		for(int i=0; i < charArray.length; i++)
		{
			if(charArray[i]=='e')
			{
				count++;
	}
		}
	System.out.println("count" +count);
		
	}

}
