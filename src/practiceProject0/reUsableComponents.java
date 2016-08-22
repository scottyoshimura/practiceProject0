package practiceProject0;

public class reUsableComponents {

//we want to call the blocks from here. we don't need main, we are just calling the class
	
//lets write a method
	public String validateHeader()
	//public is an access modifier. it can be called from anywhere
	//void indicates a return type. you have to tell what you want to return here.
	//eg. just returning a value is 10 is not enough. you have to tell it to return an int.
	//the below example shows how to return a string.
	{
		//here we will write the code for validate header
		System.out.println("header links validated");
		//we can use a string below because the above method indicates a return type string.
		return "Pass";
		
	}

}
