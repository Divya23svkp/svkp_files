package BasicsOfJava;

public class SwitchDemo {

	public static void main(String[] args) {
		String day="Monday";
		switch(day)
		{
		case  "Monday":
		case  "monday":
		System.out.println("Attend the meetings");
		break;
		
		case  "Tuesday":
		case  "tuesday":
		System.out.println("Work on project task");
		break;
		
		case  "Wednesday":
		case  "wednesday":
		System.out.println("submit the progess report");
		break;
		
		case  "Thursday":
		case  "thursday":
		System.out.println("Client call and review");
		break;
		
		case  "Friday":
		case  "friday":
		System.out.println("Wrap up weekly task");
		
		case  "Saturday":
		case  "saturday":
		case  "Sunday":
		case  "sunday":
			System.out.println("enjoy the weekwnd");
			break;
			
			default:
			{
				System.out.println("Invalid day");
			}
		}
		

	}

}
