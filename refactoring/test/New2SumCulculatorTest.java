package refactoring.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import refactoring.after.v2.New2SumCulculator;

import static org.junit.jupiter.api.Assertions.assertEquals;


class New2SumCulculatorTest {

    @Test
    @DisplayName("테스트")
    public void 테스트(){
        assertEquals(New2SumCulculator.new2SumCulculator("1.2:3"), 6);
    }

}