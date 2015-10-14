/*
 * TestPayment3.java 1.0 Sep 8, 2015
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
public class TestPayment3 {

    public static void main(String[] args) {
        // Create several test classes and invoke the paymentDetails method
        CashPayment cash1 = new CashPayment(0), cash2 = new CashPayment(1239573);
        CreditCardPayment credit1 = new CreditCardPayment(100, "Jackie", "09/04/0200", "4092438-3409793405@09854398");
        CreditCardPayment credit2 = new CreditCardPayment(100, "Chan", "01/01/0001", "$343298765%%98q374234");

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
