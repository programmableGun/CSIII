public class BracketMatcher
{
	public static void main(String[] args)
	{
		
	}
	
	public static String matchBrackets(String str)
	{
		Stack<String> s = new MyStack<String>();
		for(int i = 0; i < str.length();i++) {
			if(str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '('){
				s.push(str.charAt(i)+"");
			}
			else if (str.charAt(i) == ']'){
				if(s.isEmpty()){
					return "Too many closing brackets";
				}
				else{
					String l = str.charAt(i)+ "";
					String r = s.pop();
	
					if( !(r.equals("[") || r.equals("]")) &&(l.equals("[") || l.equals("]")) ){
						return "Bracket mismatch";
					}
				}
			}
			else if(str.charAt(i) == '}'){
				if(s.isEmpty()){
					return "Too many closing brackets";
				}
				String l = str.charAt(i)+ "";
				String r = s.pop();
				if( !(r.equals("{") || r.equals("}")) &&(l.equals("{") || l.equals("}")) ){
					return "Bracket mismatch";
				}
			}
			else if(str.charAt(i) == ')'){
				if(s.isEmpty()){
					return "Too many closing brackets";
				}
				String l = str.charAt(i)+ "";
				String r = s.pop();
				if(!( (r.equals("(") || r.equals(")")) &&(l.equals("(") || l.equals(")"))) ){
					return "Bracket mismatch";
				}
			}
		}
		if(s.size()==0){
			return "Balanced";
		}
		else{
			return "Not enough closing brackets";
		}
	}
}