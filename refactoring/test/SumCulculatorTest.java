package refactoring.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import refactoring.before.SumCulculator;

import static org.junit.jupiter.api.Assertions.*;


class SumCulculatorTest {

    @Test
    @DisplayName("테스트")
    public void 테스트(){
        assertEquals(SumCulculator.sumCulculator("1.2:3"), 6);
    }

}