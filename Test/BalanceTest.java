import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    @Test
    void main() {
        String input = "test";
        int result;
        Spiller testspiller = new Spiller(input);

        for(int i = 0; i < 10; i++){
            testspiller.setSaldo(-2000);
            result = testspiller.getSaldo();
            Assertions.assertEquals(0,result);
        }
    }
}