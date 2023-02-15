package ch12.task2.bankapp.model;

/**
 * Creates an account shared by two holders
 */
public class JointAccount {

    private int id1;
    private int id2;
    private String iban;
    private String firstname1;
    private String lastname1;
    private String firstname2;
    private String lastname2;
    private String ssn;
    private double balance;

    public JointAccount() {

    }

    public JointAccount(int id1, int id2, String iban, String firstname1, String lastname1,
                        String firstname2, String lastname2, String ssn, double balance) {
        this.id1 = id1;
        this.id2 = id2;
        this.iban = iban;
        this.firstname1 = firstname1;
        this.lastname1 = lastname1;
        this.firstname2 = firstname2;
        this.lastname2 = lastname2;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public int getId2() { return id2; }

    public void setId2(int id2) { this.id2 = id2; }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname1() {
        return firstname1;
    }

    public void setFirstname1(String firstname1) {
        this.firstname1 = firstname1;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getFirstname2() {
        return firstname2;
    }

    public void setFirstname2(String firstname2) {
        this.firstname2 = firstname2;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
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

    public void withdraw(double amount, String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)) throw new Exception("Ssn not valid exception");
            balance -= amount;
        } catch (Exception e) {
            //e.printStackTrace();
            throw e;
        }
    }

    public double getAccountBalance () {
        return getBalance();
    }

    public String getAccountState() {
        return "(" + id1 + ", " + id2 + ", " + iban + ", " + firstname1 + ", "
                + lastname1 + ", " + firstname2 + ", " + lastname2 + ", " +
        ssn + ", " + balance + ", ";
    }

    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }


}
