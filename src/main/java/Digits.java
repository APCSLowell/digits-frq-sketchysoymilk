import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
		digitList = new ArrayList<Integer>();
		int numDigits = 0;
		int currentNum = 0;
		while(num!=0){
			num = num/10;
			numDigits++;
		}
		for(int i = 0; i < numDigits; i++){
			digitList.add(currentNum%10);
			currentNum = currentNum%10;
		}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 0; i<digitList.size()-1;i++){
			if(digitList.get(i).intValue() <= digitList.get(i+1).intValue()){
				return true;
			}
		}
		return false;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
