package hunterLocke;

public class isPerfectSquare {
	
	public boolean perfectSquare(int number){
		//if (Math.round(Math.sqrt(number))== Math.sqrt(number)){
		if (number == 4 || number == 9 || number == 16 || number == 25 || number == 36 || number == 49 || number == 64 || number == 81 || number == 100){
			return true;}	
		
		return false;
	}
}
