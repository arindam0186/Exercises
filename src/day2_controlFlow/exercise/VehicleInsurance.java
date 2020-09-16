package day2_controlFlow.exercise;

public class VehicleInsurance extends Insurance {

	private String vehicleModel;
	private int yearOfManufacture;
	private double costOfVehicle;
	public VehicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleInsurance(int policyNumber, String policyHolderName, int policyHolderAge, double insuredAmount,String vehicleModel, int yearOfManufacture, double costOfVehicle) {
		super(policyNumber, policyHolderName, policyHolderAge, insuredAmount);
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
		this.costOfVehicle = costOfVehicle;
		// TODO Auto-generated constructor stub
	}
	
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public double getCostOfVehicle() {
		return costOfVehicle;
	}
	public void setCostOfVehicle(double costOfVehicle) {
		this.costOfVehicle = costOfVehicle;
	}
	
	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double totalAmount=0.0;
		
		if(getVehicleModel().equals("TWO")) {
			if(getYearOfManufacture()>2018)
				totalAmount = (50*getCostOfVehicle())/100;
			else 
				totalAmount = (60*getCostOfVehicle())/100;
		}

			else if(getVehicleModel().equals("FOUR")) {
				if(getYearOfManufacture()>2018)
					totalAmount = 40*getCostOfVehicle()/100;
				else
					totalAmount = 50*getCostOfVehicle()/100;
		}
		
		return totalAmount;
	}
}