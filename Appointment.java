import java.util.*;

public class Appointment {
	private String month;
	private int day;
	private int hour;
	private int minute;
	private String message;
	
	
	

	//		GETTERS
	public String getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public String getMessege() {
		return this.message;
	}
	
	
	//		SETTERS
	public void setMonth(String mon) {
		UserInput.checkString(mon);
		this.month = mon;
	}
	
	public void setDay(int d) {
		UserInput.checkInt(d);
		this.day = d;
		
	}
	
	public void setHour(int hr) {
		UserInput.checkInt(hr);
		this.hour = hr;
	}
	
	public void setMinute(int min) {
		UserInput.checkInt(min);
		this.minute = min;
	}
	
	public void setMessage(String mes) {
		UserInput.checkString(mes);
		this.message = mes;
	}
	
	
	
	
	//		CONSTRUCTORS
	
	public Appointment() {
		this.month = "Jan";
		this.day = 1;
		this.hour = 12;
		this.minute = 00;
		this.message = "Day 1";
	}
	
	public Appointment(String mon, int d, int hr, int min, String mes) {
		this.month = mon;
		this.day = d;
		this.hour = hr;
		this.minute = min;
		this.message = mes;
		
		
		
	}
	
	
	/*
	 * 01 Jan 31
	 * 02 Feb 28
	 * 03 Mar 31
	 * 04 Apr 30
	 * 05 May 31
	 * 06 Jun 30
	 * 07 Jul 31
	 * 
	 * 08 Aug 31
	 * 09 Sep 30
	 * 10 Oct 31
	 * 11 Nov 30
	 * 12 Dec 31
	 * 
	 * if(month%2 = 0 && month < 7)
	 */
	
	
	
	
	public int monthToNum(Appointment a) {
		String[] months = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		int a1month = 0;
		for(int i = 0; i<= months.length-1; i++) {
			if(a.getMonth().equalsIgnoreCase(months[i]))
				a1month = ++i;
			}
		return a1month;
		
	}
	
	
	
	
	
	
	

	//		inputAppointment() METHOD CALLS UserInput
	public void inputAppointment() {
		String[] months = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		List mons = Arrays.asList(months);

		System.out.print("Input 3-letter Month: ");
		String mon = UserInput.getString(3,3);
		while(UserInput.checkString(mon) == false || mons.contains(mon.toLowerCase()) == false) {
			System.out.println("Invalid input.");
			mon = UserInput.getString(3,3);
		}
		
		//Converts any input entered to the proper format of "Upper Lower Lower": jAn --> Jan
		char c1 = mon.toUpperCase().charAt(0);
		char c2 = mon.toLowerCase().charAt(1);
		char c3 = mon.toLowerCase().charAt(2);
		
		
		setMonth(""+c1+c2+c3);
		
		
		System.out.print("Input day number: ");
		int d = UserInput.getInt(1, 31);
		while(UserInput.checkInt(day) != true) {
			System.out.println("Invalid input.");
			d = UserInput.getInt(1, 31);
		}
		setDay(d);
		
		
		
		System.out.print("Input Hour: ");
		int hr = UserInput.getInt(0, 23);
		while(UserInput.checkInt(hr) != true) {
			System.out.println("Invalid input.");
			hr = UserInput.getInt(0, 23);
		}
		setHour(hr);
		
		
		System.out.print("Input Minute: ");
		int min = UserInput.getInt(0, 59);
		while(UserInput.checkInt(min) != true) {
			System.out.println("Invalid input.");
			min = UserInput.getInt(0, 59);
		}
		setMinute(min);
		
		
		System.out.print("Input message: ");
		String mes = UserInput.getString();
		while(UserInput.checkString(mes) != true) {
			System.out.println("Invalid input.");
			mes = UserInput.getString();
		}
		setMessage(mes);
	
		
	}
	
	
	
	
	//		TO STRING
	public String toString() {
		
		
		String dayF = String.format("%02d", this.day);
		String hourF = String.format("%02d", this.hour);
		String minuteF = String.format("%02d", this.minute);
		
		return this.month
				+  " " + dayF 
				+ ", " + hourF
				+ ":" + minuteF
				+ " " + this.message;
		
	}
	
	
	
	
	//		MAIN	
	public static void main(String[] args) {
		Appointment app = new Appointment();
		app.inputAppointment();
		System.out.println(app.toString());
//		Appointment app2 = new Appointment("Aug", 18, 12, 18, "Paul");
//		System.out.println(app2.toString());
//		
		
	}
	
	
	
	
	
}
