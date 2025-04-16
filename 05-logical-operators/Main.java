// package 05-logical-operators;

public class Main {
    public static void main(String[] args){
        // Comparison and Logical Operators

        // Comparison operators work the same as in JavaScript
        System.out.println(5 > 10);
        System.out.println(5 <= 10);
        // There is only double equal in Java
        System.out.println(3 == 3);

        // Logical Operators
        boolean a = true; 
        boolean b = false;

        // TRUE aoperator is &&
        // Only true && true => true
        // Anything else (true && false, or false && true) will be false
        System.out.println("a && b =>" + (a && b));

        // OR operator is || (double-pipe character)
        // As long as one side of the OR is true, the entire expression is evaluated
        // to be true
        System.out.println("a || b =>" + (a || b));

        if (a == true){
            System.out.println("A is true");
        } else {
            
        }
    }
    
}
