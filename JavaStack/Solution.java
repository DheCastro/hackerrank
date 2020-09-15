import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		Stack<Character> charStack = new Stack<>();

		while (sc.hasNext()) {
			String input=sc.next();

            for(int i=0 ; i < input.toCharArray().length; i++) {
                
                //Checking the start character
                if(input.charAt(i) != ')' && input.charAt(i) != '}' && input.charAt(i) != ']') {
                   charStack.push(input.charAt(i));
                   continue;
                }                    
                
                //Checking pairs
                if(input.charAt(i) == ')' && !charStack.isEmpty() && charStack.peek() == '('){
                        charStack.pop();  
                        continue;
                }else if(input.charAt(i) == '}' && !charStack.isEmpty() && charStack.peek() == '{') {
						charStack.pop();
						continue;
                }else if(input.charAt(i) == ']' && !charStack.isEmpty() && charStack.peek() == '['){
						charStack.pop();
						continue;
                }
                
                //Checking the end character
                if(input.charAt(i) == ')' || input.charAt(i) == '}' || input.charAt(i) == ']') {
                    charStack.push(input.charAt(i));
                    break;
                }   
            }

            System.out.println(charStack.isEmpty());

            //Checking for remnants of unbalanced strings
            if(!charStack.isEmpty()){
                charStack.clear(); 
            }
            
		}
		
	}
}
