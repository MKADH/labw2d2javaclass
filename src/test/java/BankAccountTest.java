import org.example.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
public class BankAccountTest {
    private BankAccount bankaccount1;
@BeforeEach
public void setUp(){
    bankaccount1 = new BankAccount();
    bankaccount1.getDob();
    bankaccount1.getFirstname();
    bankaccount1.getLastname();
    bankaccount1.getBalance();
    bankaccount1.getAccountNumber();

}
@Test
    public void depositTest(){
    bankaccount1.Deposit(40.0);
    assertEquals(40.0, bankaccount1.getBalance());
    }
    @Test
    public void withdrawalTest() {
        bankaccount1.Withdrawal(20);
        assertEquals(-20, bankaccount1.getBalance());
    }


}
