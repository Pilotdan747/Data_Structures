package paymentProblem;


/**
 * A sub class of Payment
 *
 * Holds the amount and card details(name, card number, and expiration date
 *
 * @author Daniel Owen
 *
 */
public class CreditCardPayment extends Payment {

    String cardName;
    String cardNumber;
    String cardDate;

    /**
     * Constructs a payment using an amount and details about the credit card
     * used
     *
     *
     * @param paymentAmount
     *            double - The amount of the payment
     * @param name
     *            String - The name on the card
     * @param date
     *            String - The expiration date on the card
     * @param number
     *            String - The card number
     */
    public CreditCardPayment(double paymentAmount, String name, String date, String number) {
        super(paymentAmount);

        cardName = name;
        cardNumber = number;
        cardDate = date;
    }

    /**
     * Returns the expiration date entered for the card
     *
     * @return - String - expiration date on the card
     */
    public String getCardDate() {
        return cardDate;
    }

    /**
     *
     * @return cardName - String - Returns a string containing the name used on
     *         the card
     */
    public String getCardName() {
        return cardName;
    }

    /**
     *
     * @return - String - Returns the number used on the card
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Prints details about the payment including the information on the card
     */
    @Override
    public void paymentDetails() {
        System.out.println("This person paid the amount of $" + paymentAmount + " using a card with the name "
                + cardName + ", the number " + cardNumber + ", and with the expiration date " + cardDate + ".");
    }

    /**
     *
     * @param cardDate
     *            String - Changes the date on the card
     */
    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
    }

    /**
     *
     * @param cardName
     *            String - Changes the name on the card
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     *
     * @param cardNumber
     *            String - Changes the number on the card
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

}
