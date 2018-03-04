import java.util.*;


public class Planner {

	private Appointment[] apparr = new Appointment[20];
	
//	Appointment q1 = new Appointment("Mar", 4, 17, 30, "Quiz 1");
	Planner() {
		apparr[0] = new Appointment("Mar", 4, 17, 30, "Quiz 1");
		apparr[1] = new Appointment("Apr", 1, 17, 30, "Midterm");
		apparr[2] = new Appointment("May", 6, 17, 30, "Quiz 2");
		apparr[3] = new Appointment("Jun", 3, 17, 30, "Final");
		
//		apparr[4] = new Appointment("Mar", 4, 17, 30, "Quiz 1");
//		apparr[5] = new Appointment("Apr", 1, 17, 30, "Midterm");
//		apparr[6] = new Appointment("May", 6, 17, 30, "Quiz 2");
//		apparr[7] = new Appointment("Jun", 3, 17, 30, "Final");
//		
//		apparr[8] = new Appointment("Mar", 4, 17, 30, "Quiz 1");
//		apparr[9] = new Appointment("Apr", 1, 17, 30, "Midterm");
//		apparr[10] = new Appointment("May", 6, 17, 30, "Quiz 2");
//		apparr[11] = new Appointment("Jun", 3, 17, 30, "Final");
//		
//		apparr[12] = new Appointment("Mar", 4, 17, 30, "Quiz 1");
//		apparr[13] = new Appointment("Apr", 1, 17, 30, "Midterm");
//		apparr[14] = new Appointment("May", 6, 17, 30, "Quiz 2");
//		apparr[15] = new Appointment("Jun", 3, 17, 30, "Final");
//		
//		apparr[16] = new Appointment("Mar", 4, 17, 30, "Quiz 1");
//		apparr[17] = new Appointment("Apr", 1, 17, 30, "Midterm");
//		apparr[18] = new Appointment("May", 6, 17, 30, "Quiz 2");
//		apparr[19] = new Appointment("Jun", 3, 17, 30, "Final");
	}
	
	public void listAppointments() {
		for(int i = 0; i<=apparr.length-1;i++) {
			if(apparr[i] != null)
			System.out.println(i+1 + ". " + apparr[i].toString());
		}
	}
	
	//if a1 < a2, return true, else false
	public boolean compareAppointment(Appointment a1, Appointment a2) {
		
		if(a1.monthToNum(a1) < a2.monthToNum(a2)) {
			return true;
		}else if(a1.getDay() < a2.getDay()) {
			return true;
		}else if(a1.getHour() < a2.getHour()) {
			return true;
		}else if(a1.getMinute() < a2.getMinute()) {
			return true;
		}else return false;
		
	}
			
	
	//insertAppointment (Appointment A1) places A1 in the proper (sorted) slot of the array
	public void insertAppointment(Appointment a1) {

		if(isFull(apparr)){
			System.out.println("Your planner is full!");
		}
		
		
		
		else{
			Appointment[] temparr = new Appointment[20]; //This is gonna be the temp array I use to shift 
			
			for(int i = 0; i <= apparr.length-1; i++) {
				if(compareAppointment(a1, apparr[i]) == false // if a1 is > i and < i+1 while i+1 != null
						&& (compareAppointment(a1, apparr[i+1]) == true || apparr[i+1] == null)) { 

				
					
					
				}
			}
				
		}
	}
		
//					
//					
//					
//
//					
//					
//					
//					//    THIS IS THE CODE THAT DIDN'T WORK
//					
//					
//					for(int j = i+1; j <= apparr.length-1; j++) {
//						apparr[j] = temparr[j+1];	
//					}
//					
////					apparr[i+1] = a1;
//					
//					
//					for(int j = i+1; j <= apparr.length-1; j++) {
//						apparr[j+1] = temparr[j+1];
//						
//						
//						
//						
//						
//					}
//					
//				}
//			}
//			
//		}
//		
//		
	
	public boolean isFull(Appointment[] p){
		if (p[p.length-1] != null)
			return true;
		else
			return false;
		
		
	}
	
	public Appointment[] getApparr(){
		return apparr;
	}
	
	
	
	public static void main(String[] args) {
//		Appointment test = new Appointment("Jan", 4, 17, 30, "Quiz 1");
		Appointment test1 = new Appointment("Dec", 5, 17, 30, "Quiz 1");
		Planner p = new Planner();
//		System.out.print(p.compareAppointment(test, test1));
		p.insertAppointment(test1);
		p.listAppointments();
		
	}
	
}
