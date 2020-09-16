package day2_controlFlow.exercise;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//EXERCISE 1
		
		Insurance insurance = new Insurance(111,"John",25,1000);
				
		System.out.println("Premium amount ==> "+insurance.calculatePremium());
		
		
/*-----------------------------------------------------------------------------------------------*/

//EXERCISE 2
		
		VehicleInsurance vehicle = new VehicleInsurance(111,"John",25,1000,"TWO",2018,100000);
		
		System.out.println("Total Cost of Vehicle ==> "+vehicle.calculatePremium());
		
	}

}
