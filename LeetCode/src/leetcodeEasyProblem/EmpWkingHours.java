package leetcodeEasyProblem;

class MeetHours {
	public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
		
		
		int temp=0;
		for(int i=0;i<hours.length;i++ ) {
			if(hours[i]>=target) {
				temp++;
			}
		}return temp;
}
}


public class EmpWkingHours {
	public static void main(String[] args) {
		
	}
}
