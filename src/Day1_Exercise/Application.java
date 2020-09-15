package Day1_Exercise;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BloodDonor first = new BloodDonor("Harry",25,"Male","Boston");
		
		System.out.println(first.getName());
		System.out.println(first.getAddress());
		
		BloodDonor second = new BloodDonor();
		
		second.setName("Selena");
		second.setAddress("California");
		
		System.out.println(second.getName());
		System.out.println(second.getAddress());
		
	}

}
