package Conditional;

public class IF_ELSE_Conditional {

	public static void main(String[] args) {

		int hour = 19;

		if (hour <= 12) {
			System.out.println("Morning");
		}
		else if(hour > 12 && hour <= 18) {
			System.out.println("Afternoon");			
		}else{			
			System.out.println("Night");
		}

	}

}
