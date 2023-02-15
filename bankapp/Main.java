package ch12.task2.bankapp;

import ch12.task2.bankapp.model.JointAccount;
import ch12.task2.bankapp.model.OverdraftAccount;

public class Main {

    public static void main(String[] args) throws Exception {
        OverdraftAccount akalyptos = new OverdraftAccount(5, "GR999", "Andreas", "Akamatos",
                "A455", 200);

        JointAccount twoHolders = new JointAccount(7, 9, "GR4345", "Chris", "Vaughn", "Nick",
                "Vaughn", "T71", 6600);

        akalyptos.withdraw(800, "A455");

        System.out.println(akalyptos.getAccountState());

        System.out.println();

        System.out.println(twoHolders.getAccountState());

    }
}
