//A program code is given to call the parent class static method and instance method in derive class without  creating object of parent class. You should write the appropriate code so that the program print the contents of static method() and instance method () of parent class.

class Parent {
    public static void testClassMethod() {
        System.out.println("The static method.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method.");
    }
}
public class Child extends Parent {
   public static void testClassMethod() {
        
    }
    
    public static void main(String[] args) {
     		Child nce=new Child(); 
            nce.testInstanceMethod();
            Parent.testClassMethod();
	}	
}
	
    


