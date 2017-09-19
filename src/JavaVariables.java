
public class JavaVariables {
	
	// Class variable 
	public static int intNum=250;
    // instance variable
	public String strVar="Hey";
	
	public void display() {
		System.out.println("Class Variable :" + intNum); //Class variable ,No need to use the class object 
		System.out.println("instance Variable :" + this.strVar);//instance variable ,need to use the class object 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initiate the class
		JavaVariables var= new JavaVariables();
		
		//print the Java variables 
		System.out.println("Class Variable :" + intNum); //Class variable ,No need to use the class object 
		System.out.println("instance Variable :" + var.strVar);//instance variable ,need to use the class object 
		
		var.strVar="Hi"; //instance variable ,need to use the class object 
		intNum=100; //Class variable ,No need to use the class object 
		
		//print the Java variables 
		System.out.println("Class Variable :" + intNum); //Class variable ,No need to use the class object 
		System.out.println("instance Variable :" + var.strVar);//instance variable ,need to use the class object 
	}
}
