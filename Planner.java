import java.util.*;


public class Planner {

	private Appointment[] apparr = new Appointment[20];
	
//	Appointment q1 = new Appointment("Mar", 4, 17, 30, "Quiz 1");
	Planner() {
		apparr[0] = new Appointment("Mar", 4, 17, 30, "Quiz 1");
		apparr[1] = new Appointment("Apr", 1, 17, 30, "Midterm");
		apparr[2] = new Appointment("May", 6, 17, 30, "Quiz 2");
		apparr[3] = new Appointment("Jun", 3, 17, 30, "Final");
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
		boolean isfull = false;
		for(int t = 0; t <= apparr.length-1; t++) {
			if(apparr[t] == null)
				isfull = false;
			else
				isfull = true;
		}
		if(isfull)
			System.out.println("Your planner is full!");
		else{
			for(int i = 0; i <= apparr.length-1; i++) {
				if(compareAppointment(a1, apparr[i]) == false 
						&& compareAppointment(a1, apparr[i+1]) == true) { // if a1 is > i and < i+1
					Appointment[] temparr = new Appointment[20];
					for(int j = i+1; j <= apparr.length-1; j++) {
						apparr[j] = temparr[j+1];	
					}
					apparr[i+1] = a1;
					for(int j = i+1; j <= apparr.length-1; j++) {
						apparr[j+1] = temparr[j+1];
					}
					
				}
			}
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
//		Appointment test = new Appointment("Jan", 4, 17, 30, "Quiz 1");
		Appointment test1 = new Appointment("Jan", 5, 17, 30, "Quiz 1");
		Planner p = new Planner();
//		System.out.print(p.compareAppointment(test, test1));
		p.insertAppointment(test1);
		p.listAppointments();
		
		
	}
	
}
