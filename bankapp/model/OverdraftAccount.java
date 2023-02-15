package ch12.task2.bankapp.model;

/**
 * Creates an account with overdraft option
 * @author v51
 */
public class OverdraftAccount {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public OverdraftAccount() {

    }

    public OverdraftAccount(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * adds money to account
     *
     * @param amount        the amount of money to be deposited
     * @throws Exception    exception in case of negative amount entered
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount >= 0) {
                balance += amount;
            } else throw new Exception("Negative amount exception");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * withdraws money from account even when there is
     * not enough balance
     *
     * @param amount        the amount of money to be withdrawn
     * @param ssn           the social security number to be checked if valid
     * @throws Exception    exception in case of negative amount entered
     */
    public void withdraw(double amount, String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)) throw new Exception("Ssn not valid exception");
            balance -= amount;
        } catch (Exception e) {
            //e.printStackTrace();
            throw e;
        }
    }

    /**
     * gets the remaining balance available
     *
     * @return      the balance sum available
     */
    public double getAccountBalance () {
        return getBalance();
    }

    /**
     * returns all the info of the account
     *
     * @return      account holder's info
     */
    public String getAccountState() {
        return "(" + id + ", " + iban + ", " + firstname + ", "
                + lastname + ", " + ssn + ", " + balance + ", ";
    }

    /**
     * checks if social security number is valid
     *
     * @param ssn       social security number
     * @return          returns true if ssn is valid
     */
    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}