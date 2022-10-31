package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
     
        for(int i = 1; i <= number; i++) {
        	answer += getClaps(i);
        }
        
        return answer;
    }
    
    
    private ArrayList<Integer> calcDigit(int number){
		
		ArrayList<Integer> digitsArray = new ArrayList<Integer>();
		while (number > 0) {
			digitsArray.add(number % 10);
			number /= 10;
		}
		
		return digitsArray;
	}
    
}
