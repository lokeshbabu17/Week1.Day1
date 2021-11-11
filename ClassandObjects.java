package week1.day1;

public class ClassandObjects {
	String model;
	String brandname;
	int cost;
	boolean touchscreen;
	int resolution;
	
	public void makecall () {
		
		System.out.println("making call");		
	}
	public void paymoney()
	{
		System.out.println("pay money");
	}
	
	public void viewgalary()
	{
		System.out.println("Viewgalary");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassandObjects samsung= new ClassandObjects();
		
		samsung.model="honor8c";
		samsung.brandname="samsung";
		samsung.cost=12000;
		samsung.touchscreen= true;
		samsung.resolution= 245;
		samsung.makecall();
		samsung.paymoney();
		samsung.viewgalary();
		
		System.out.println("All details of the samsung phone object attached");
		System.out.println("samsung.model=" +samsung.model);
		System.out.println("samsung.brandname=" +samsung.brandname);
		System.out.println("samsung.cost=" +samsung.cost );
		System.out.println("samsung.touchscreen=" +samsung.touchscreen);
		System.out.println("samsung.resolution=" +samsung.resolution);
		
		
		
		
		
		
	}

}
