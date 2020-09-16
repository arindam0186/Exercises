package day2_controlFlow.exercise;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//EXERCISE 1
		
		Insurance insurance = new Insurance(111,"John",25,1000);
		
		double premiumAmount;
		
		premiumAmount = insurance.getpolicyHolderAge() < 25 ? 60 : 70;
		
		System.out.println("Premium amount ==> "+premiumAmount);
		
		VehicleInsurance vehicle = new VehicleInsurance(111,"John",25,1000,"TWO",2018,100000);
		
/*-----------------------------------------------------------------------------------------------*/

//EXERCISE 2
		
		double totalAmount=0.0;
		
		
		if(vehicle.getVehicleModel().equals("TWO")) {
			if(vehicle.getYearOfManufacture()>2018)
				totalAmount = (50*vehicle.getCostOfVehicle())/100;
			else 
				totalAmount = (60*vehicle.getCostOfVehicle())/100;
		}

			else if(vehicle.getVehicleModel().equals("FOUR")) {
				if(vehicle.getYearOfManufacture()>2018)
					totalAmount = 40*vehicle.getCostOfVehicle()/100;
				else
					totalAmount = 50*vehicle.getCostOfVehicle()/100;
		}
		
		System.out.println("Total Cost of Vehicle ==> "+totalAmount);
		
	}

}
