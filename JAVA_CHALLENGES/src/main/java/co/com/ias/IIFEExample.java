package co.com.ias;

public class IIFEExample {
    /*
With lambdas:
The (5) argument in this context is an example of immediately invoking a lambda function,
also known as an Immediately Invoked Function Expression (IIFE).
*/
    String result = new Object() {
        String checkEvenOdd(int x) {
            return (x % 2 == 0) ? "Even" : "Odd";

        }
    }.checkEvenOdd(5);


}
