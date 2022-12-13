package com.kodilla.basic_assertion;




import com.kodilla.bank.homerwork.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldReturnNumberDevices(){
        Bank bank = new Bank(4);
        assertEquals(4, bank.getNumberOfDevices());
    }

    @Test
    public void shouldCountNumberAllTransactionsEvenIfInvalidTransactionTriedToBeMade(){
        Bank bank = new Bank(4);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, 20);
        bank.addTransaction(2, 100);
        bank.addTransaction(2, -10);

        bank.addTransaction(3, 20);
        bank.addTransaction(3, 20);
        bank.addTransaction(3, 20);
        bank.addTransaction(3, -50);

        assertEquals(14, bank.getTotalNumberOfDeposits() + bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCountTotalBalanceEvenIfInvalidTransactionTriedToBeMade(){
        Bank bank = new Bank(4);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, 20);
        bank.addTransaction(2, 100);
        bank.addTransaction(2, -10);

        bank.addTransaction(3, 20);
        bank.addTransaction(3, 20);
        bank.addTransaction(3, 20);
        bank.addTransaction(3, -50);

        assertEquals(410, bank.getTotalBalance());
    }

    @Test
    public void shouldCountNumberAllDeposits(){
        Bank bank = new Bank(4);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, 20);
        bank.addTransaction(2, 100);
        bank.addTransaction(2, -10);

        bank.addTransaction(3, 20);
        bank.addTransaction(3, 20);
        bank.addTransaction(3, 20);
        bank.addTransaction(3, -50);

        assertEquals(11, bank.getTotalNumberOfDeposits());
    }

    @Test
    public void shouldCountNumberAllWithdrawalsEvenIfInvalidTransactionTriedToBeMade(){
        Bank bank = new Bank(4);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, 20);
        bank.addTransaction(2, 100);
        bank.addTransaction(2, -10);

        bank.addTransaction(3, 20);
        bank.addTransaction(3, 20);
        bank.addTransaction(3, 20);
        bank.addTransaction(3, -50);

        assertEquals(3, bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCalcAverageAllDeposits(){
        Bank bank = new Bank(4);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, 20);
        bank.addTransaction(2, 100);
        bank.addTransaction(2, -10);

        bank.addTransaction(3, 20);
        bank.addTransaction(3, 20);
        bank.addTransaction(3, 20);
        bank.addTransaction(3, -50);

        assertEquals(50.83, bank.getTotalAvgDeposits(), 0.01);
    }

    @Test
    public void shouldCalcAverageAllWithdrawalsEvenIfInvalidTransactionTriedToBeMade(){
        Bank bank = new Bank(4);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);

        bank.addTransaction(2, -50);
        bank.addTransaction(2, 20);
        bank.addTransaction(2, 100);
        bank.addTransaction(2, -10);

        bank.addTransaction(3, 20);
        bank.addTransaction(3, 20);
        bank.addTransaction(3, 20);
        bank.addTransaction(3, -50);

        assertEquals(35.00, bank.getTotalAvgWithdrawals(), 0.01);
    }
}

