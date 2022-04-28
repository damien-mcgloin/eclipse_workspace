package maths.examples;

public class NumberCruncher {

	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}

	public int addNumbers(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}
	
	public int multiplyNumbers(int num1, int num2, int num3) {
		return num1*num2*num3;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 * @throws Exception - if 2nd parameter is a zero
	 */
	public double divNumbers(double num1, double num2) throws Exception  {
        double answer;
        
        if(num2==0) {
        	// a problem
        	throw new Exception("INVALID DIV BY ZERO");
        }
        
        answer = num1/num2;
        return answer;
    }
	
	public static String monthToString(int month) throws NumberFormatException {
        String monthStr = "";
        switch (month) {
        case 1:
            monthStr = "Jan";
            break;
        case 2:
            monthStr = "Feb";
            break;
        case 3:
            monthStr = "Mar";
            break;
        case 4:
            monthStr = "April";
            break;
        default:
            throw new NumberFormatException();
        }
        return monthStr;
    }
	
}
