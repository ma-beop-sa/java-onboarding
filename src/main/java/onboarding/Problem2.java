package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";
        return answer;
    }
    
    private boolan checkDuplicate(String cryptogram) {
    	Pattern pattern = Pattern.compile("(\\w)\\1+");
    	Matcher regex = pattern.matcher(cryptogram);
        return matcher.find();
        
        
    }
}
