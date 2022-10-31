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
    
    private int getClaps(int number) {
    	ArrayList<Integer> digitsArray = new ArrayList<Integer>();
    	digitsArray = calcDigit(i);
    	int clapNumber = 0;
		
		for(Integer digit : digitsArray) {
			if ( (0 == (digit % 3)) && ( 0 != digit )) {
				clapNumber++;
			}
			
		}
		retrurn clapNumber;
    }
		
}
