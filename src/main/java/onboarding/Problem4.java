package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        String result = "";
        
        for(int i = 0 ; i < word.length(); i++) {
        	char ch = word.charAt(i);
        	
    		if (true == Character.isLowerCase(ch)) {
				
    			result += (char)(('z' - ch) + 'a');
				
			}else if(true == Character.isUpperCase(ch)) {
				
				result += (char)(('Z' - ch) + 'A');
        }
    		
        answer = result;
    		
        return answer;
    }
}
