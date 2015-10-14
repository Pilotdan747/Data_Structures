package paymentProblem;


/**
 * A sub class of Payment
 *
 * holds an amount and prints details about the payment using the paymentDetails
 * method
 *
 * @author Daniel Owen
 *
 */
public class CashPayment extends Payment {

    /**
     * Constructs a Cash Payment using the amount given
     *
     * @param paymentAmount
     *            double - The amount of the payment in dollars
     */
    public CashPayment(double paymentAmount) {
        super(paymentAmount);
    }

    /**
     * Prints out details about the payment - Amount and that it was a cash
     * payment.
     */
    @Override
    public void paymentDetails() {
        System.out.println("This person paid the amount of $" + paymentAmount + " using cash.");
    }

}
