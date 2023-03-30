public class Palindrome
{
	public static void main(String[] args)
	{
		
	}
	
	public static boolean isPalindrome(String str)
	{
		Stack<String> s = new MyStack<String>();
        Queue<String> q = new MyQueue<String>();
		String legal = "abscdefghijklmnopqrstuvwxyz";
		for(int i =0; i < str.length();i++){
			String letter = str.substring(i, i+1);
			String lowerCaseLetter = letter.toLowerCase();
		if( legal.indexOf( lowerCaseLetter ) > -1 )
		{
		   s.push(lowerCaseLetter);
		   q.add(lowerCaseLetter);
		}
		}
		String s1 = "";
		String s2 = "";
		for(int i =0; i < s.size(); i++){
			s1 += s.peek();
			s.pop();
			s2 += q.peek();
			q.remove();
		}
				return s1.equals(s2);
	}
}