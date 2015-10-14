/*
 * TestPayment2.java 1.0 Sep 8, 2015
 *
 * Daniel Owen
 */
package paymentProblem;


/**
 * @author Daniel Owen
 *
 * @version 1.0
 *
 */
public class TestPayment2 {

    public static void main(String[] args) {
        // Create several test classes and invoke the paymentDetails method
        CashPayment cash1 = new CashPayment(26124), cash2 = new CashPayment(-15);
        CreditCardPayment credit1 = new CreditCardPayment(100, "Daniel", "12/31/2015", "440-8493475228585");
        CreditCardPayment credit2 = new CreditCardPayment(100, "Lukas Buechel", "06/04/2018", "09857345987234");

        System.out.println("Cash 1 details:");
        cash1.paymentDetails();
        System.out.println();
        System.out.println("Cash 2 details:");
        cash2.paymentDetails();
        System.out.println();

        System.out.println("Credit 1 details:");
        credit1.paymentDetails();
        System.out.println();
        System.out.println("Credit 2 details:");
        credit2.paymentDetails();
        System.out.println();

        if (cash2.equals(cash1)) {
            System.out.println("cash2 and cash1 are equal");
        }

        if (cash2.equals(credit1)) {
            System.out.println("cash2 and credit1 are equal");
        }

        if (credit1.equals(credit2)) {
            System.out.println("credit2 and credit1 are equal");
        }

    }

} // end of TestPayment
