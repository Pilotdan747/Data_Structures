package paymentProblem;


/**
 * Super class for Payments
 *
 * Holds an amount with mutator and accessory methods
 *
 * @author Daniel Owen
 *
 */
public class Payment {

    protected double paymentAmount;

    /**
     *
     * Creates a payment object with an amount
     *
     * @param paymentAmount
     *            double - the amount of the payment
     */
    public Payment(double paymentAmount) {
        super();
        this.paymentAmount = paymentAmount;
    }

    /**
     *
     * Checks to see if the object o is the same as this object
     *
     * @param o
     *            Object to check
     * @return - boolean - Returns true if the classes are the same type and the
     *         amounts and equal
     */
    @Override
    public boolean equals(Object o) {
        return (this.getClass().equals(o.getClass()) && this.paymentAmount == ((Payment) o).getPaymentAmount());
    }

    /**
     *
     * Returns the amount entered for the payment
     *
     * @return - double - amount entered in for the payment
     */
    public double getPaymentAmount() {
        return paymentAmount;
    }

    /**
     *
     * Prints details about the payment
     *
     */
    public void paymentDetails() {
        System.out.println("This person paid the amount of $" + paymentAmount + ".");
    }

    /**
     *
     * Change the payment amount
     *
     * @param paymentAmount
     *            - double - New payment amount
     */
    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
