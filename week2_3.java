//to call print() method of class Question by creating a method named ‘studentMethod()’.

// This is the main class Question
public class Question213{ 
    public static void main(String[] args) { 
		// Object of the main class is created
		Question213 q = new Question213();
		// Print method on object of Question class is called
		q.studentMethod();
    }
	
	// 'print()' method is defined in class Question
	void print(Question213 object){
		System.out.print("Well Done!");
	}

// Define a method named 'studentMethod()' in class Question

// Call the method named 'print()' in class 
	void studentMethod()
	{
		System.out.println("Calling print() method ");
		Question213 q1 =new Question213();
		Question213 q2 =new Question213();
		q1.print(q2);
	}
}
