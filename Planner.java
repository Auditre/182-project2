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
		}
		else if((a1.getDay() < a2.getDay()) && (a1.monthToNum(a1) < a2.monthToNum(a2))) {
			return true;
		}else if((a1.getHour() < a2.getHour()) && (a1.getDay() < a2.getDay()) && (a1.monthToNum(a1) < a2.monthToNum(a2))) {
			return true;
		}else if((a1.getMinute() < a2.getMinute()) && (a1.getHour() < a2.getHour()) && (a1.getDay() < a2.getDay()) && (a1.monthToNum(a1) < a2.monthToNum(a2))) {
			return true;
		}
		else return false;
		
	}
			
	
	//insertAppointment (Appointment A1) places A1 in the proper (sorted) slot of the array
	public void insertAppointment(Appointment a1) {
				
		if(isFull(apparr))
			System.out.println("Your planner is full!");
		else
			for(int i = apparr.length-1; i >= 0; i--) 				
				if(apparr[i] != null)
					if(compareAppointment(a1, apparr[i])) {
						apparr[i+1] = apparr[i];
						apparr[i] = a1;
						
					} 
					else if(compareAppointment(apparr[i],a1) && apparr[i+1] == null){
						apparr[i+1] = a1;
						break;
					}
	
		}
	
	
	// deleteAppointment () delete an object from the array using the number listAppointment () outputs in front of the item
	public void deleteAppointment(int num){
				
		if(num > 20){
			System.out.println("Invalid index.");
		}
		else
		while(apparr[num-1] != null){
			apparr[num-1] = apparr[num];
			num++;
		}
		
	}

	
	
	
	public boolean isFull(Appointment[] p){
		if (p[p.length-1] != null)
			return true;
		else
			return false;
		
		
	}
	
	public Appointment[] getApparr(){
		return apparr;
	}
	
	
	
	public void run(){
		int stopCheck = 0;
		while(stopCheck == 0){
			System.out.println();
			System.out.println("1.Add Appointment   2.Delete Appointment   3.List Appointments   4.Exit");
			int input = UserInput.getInt(1, 4);
			
			
			if(input == 1){
				Appointment a = new Appointment();
				a.inputAppointment();
				insertAppointment(a);
				
			}else if(input == 2){
				input = UserInput.getInt();
				deleteAppointment(input);
				
				
			}else if(input == 3){
				listAppointments();
				
				
			}else if(input == 4){
				System.out.println("Bye!");
				stopCheck = 1;
				
			}
		}
		
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Planner p = new Planner();
		p.run();
		
		
//		Appointment test0 = new Appointment("Jan", 1, 17, 30, "Midterm");
//		Appointment test = new Appointment("Dec", 1, 29, 31, "Quiz 1");
//		Appointment test1 = new Appointment("Apr", 4, 17, 30, "plz work");
//		Appointment fuckthis = new Appointment("Apr", 2, 01, 00, "y god");
//		Planner p = new Planner();
//		
//		p.listAppointments();
//		System.out.println();
//		
//		System.out.print(p.compareAppointment(test0, test));
//		
//		p.insertAppointment(test0);
//		p.insertAppointment(test1);
//		p.insertAppointment(test);
//		p.insertAppointment(fuckthis);
//		
//		p.listAppointments();
//		System.out.println();
//		
//		p.deleteAppointment(4);
//		p.listAppointments();
//		
	}
	
}
