package refactoring.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import refactoring.after.v1.NewSumCulculator;
import refactoring.after.v2.New2SumCulculator;
import refactoring.before.SumCulculator;

import static org.junit.jupiter.api.Assertions.assertEquals;


class NewSumCulculatorTest {

    @Test
    @DisplayName("테스트")
    public void 테스트(){
        assertEquals(NewSumCulculator.newSumCulculator("1.2:3"), 6);
    }

}