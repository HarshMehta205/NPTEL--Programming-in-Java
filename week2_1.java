// to call the method  print() in class using the concept of inner class

 // This is the outer class named School
class School { 
    // This is the inner class named Student
    class Student { 
		// This is a method in inner class Student
        public void print() { 
			System.out.println("Hi! I am inner class STUDENT of outer class SCHOOL."); 


System.out.println("NPTEL");
        } 
    } 
} 

public class Question211{ 
    public static void main(String[] args) { 
// Create an object of inner class Student

// Access the 'print()' method of the inner class Student using the inner class object
		

		//method 1-
		//School.Student st = new School().new Student();
		//st.print();

		//method2-
		School sc = new School();
		School.Student st = sc.new Student();
		st.print();
     } 
}
