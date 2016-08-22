package practiceProject0;

//this identifies the class
//the class is the file where you write your code. 
public class parent {

	//pink words are java Keywords   
	//whenever you start execution, control starts in the main method.
	//this is hte main block. the heart of hte java program. 
	//if you write somehwere out the main, java won't execute it. execution is limited to the main block.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this is how we print to the output
		//we pass the text as an argument to this method
		System.out.println("8.14.2016");
		//you always have to use a semi-colon at the end
		
		//lets add a couple of numbers. 2 and 3
		//lets declare to values, in a sense an integer, a float, you have to say it with whatever it is
		
		//we declare the variable type, what the name of the variable is, and what the value is
		int a=2;
		int b=3;
		
		//we create a new variable and we have to id the type with int
		int Sum = a + b;
		
		//System.out.print prints whatever the value passed into it as a variable (the arguement)
		System.out.println(Sum);
		
		//in java + is a concatination operator, which joins strings and variables
		System.out.println("sum is "+Sum);
		
		//lets define an object for a class
		//eg we are testing a web applicaiton with 5 pages and we want to test if the header is properly displaying
		//we will write some code to make sure the header is displayed as expected. we can reuse the code to check the header. we don't want to write it 5 times.
		//we can create a block of code, and call that block of code in a class
		
		//lets call the method to validate the header
		System.out.println("i navigated to the home page");
		
		//now lets validate by calling the class that validates the header
		//we have to define the object for this class parent. that is, we have to tell parent that a class reUsableComponents exists
		
		reUsableComponents component=new reUsableComponents();
		//we create an object component from this method Class reUSableComponents.
		//if we want to access any methods from reUsableComponents we can do it from 
		//component.methodName
		//"classojbect.methodName"
		//if we want to access method from different class we have to add object.methodName
		//new is a memory allocator. it creates memory for component inside of parent
		//component.validateHeader();
		System.out.println(component.validateHeader());
	}

}
