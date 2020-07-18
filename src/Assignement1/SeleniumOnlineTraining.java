package Assignement1;

public class SeleniumOnlineTraining {

	public static void main(String[] args) {
		
	  String trainerName= "Mukesh";
	  
	  SeleniumOnlineTraining obj1 = new SeleniumOnlineTraining();
	  System.out.println ("Output of seleniumTraining");
	  obj1.seleniumTraining();
	  System.out.println( trainerName);
	  System.out.println ("\n Output of devOpsTraining");		
	  obj1.devOpsTraining();
	  System.out.println( trainerName);
	  System.out.println ("\n Output of jmeterTraining");		
	  obj1.jmeterTraining();
	  System.out.println( trainerName);
		
		
	}
 
	//method 1 should be seleniumTraining with local variable called price=200USD
	
	public void  seleniumTraining()
	{
		  int price  = 200;
		  System.out.println("Welcome to Online Training Program");
		  System.out.println("Thank you showing interest in training program");	
	      System.out.print("Selenium Training charges are " +price +" USD and Trainer name is "  );
	}
	
	//method 2 should be devOpsTraining with local variable called price=300USD
	public void  devOpsTraining()
	{
		  int price  = 300;
		  System.out.println("Welcome to Online Training Program");
		  System.out.println("Thank you showing interest in training program");	
	      System.out.print("DevOps Training charges are " +price +" USD and Trainer name is "  );
	}
	
	//method 3 should be jmeterTraining with local variable called price=400USD
	public void  jmeterTraining()
	{
		  int price  = 400;
		  System.out.println("Welcome to Online Training Program");
		  System.out.println("Thank you showing interest in training program");	
	      System.out.print("jmeter Training charges are " +price +" USD and Trainer name is "  );
	}
}
