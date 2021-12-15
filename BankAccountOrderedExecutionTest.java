import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BankAccountOrderedExecutionTest {
    static BankAccount bankAccount = new BankAccount(0, 0);

    @Test
    @Order(2)
    @DisplayName("Withdrawing 200 from bank account")
    public void testWithdraw() {
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @Order(1)
    @DisplayName("Depositing 500 to account")
    public void testDeposit(){
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }
}
