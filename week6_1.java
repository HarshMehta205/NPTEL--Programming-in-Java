//Complete the code segment to print the following using the concept of extending the Thread class in Java:
//-----------------OUTPUT-------------------
//Thread is Running.
//------------------------------------------


 // Write the appropriate code to extend the Thread class to complete the class Question61.
public class Question61{ 
	void start()
    {
     System.out.print("Thread is Running."); 
    }
	public static void main(String args[]){  

		// Creating object of thread class
		Question61 thread=new Question61();  

                // Start the thread
		thread.start();
	}  
}
