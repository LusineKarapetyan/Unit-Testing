import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test BankAccount class")
public class BankAccountTest {

    /**
     * Testing the withdraw method
     * balance is 500 and minimum balance is -1000
     * the amount being withdrawen is 300
     * so the assertion expected is 200
     */
    @Test
    @DisplayName("Withdraw 500 successfully")
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }

    /**
     * Testing the deposit method
     * the balance is 400 and 500 is being deposited
     * asserting that the final balance is 900
     */
    @Test
    @DisplayName("Deposit 400 successfully")
    public void deposit(){
        BankAccount bankAccount = new BankAccount(400, 0);
        bankAccount.deposit(500);
        assertEquals(900, bankAccount.getBalance());

    }
}
