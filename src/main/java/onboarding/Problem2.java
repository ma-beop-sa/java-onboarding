package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = removeDuplicate(cryptogram);
        return answer;
    }
    
    private boolan checkDuplicate(String cryptogram) {
    	Pattern pattern = Pattern.compile("(\\w)\\1+");
    	Matcher regex = pattern.matcher(cryptogram);
        return matcher.find();
    }
    
    private String removeDuplicate(String cryptogram) {
    	String result = cryptogram.replaceAll("(\\w)\\1+", "");

        if(true == checkDuplicate(result)) {
            return removeDuplicate(result);
        }
        
        return result;

    }
}
