import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeTest {
    @Test
    public void bracket1To1BracketShouldBeReturn1() {
        Range range = new Range("[1,1]");
        assertEquals("1", range.getOutput());
    }

    @Test
    public void bracket3To3BracketShouldBeReturn3() {
        Range range = new Range("[3,3]");
        assertEquals("3", range.getOutput());
    }

    @Test
    public void bracket1To2BracketShouldBeReturn1To2() {
        Range range = new Range("[1,2]");
        assertEquals("1,2", range.getOutput());
    }

    @Test
    public void bracket1To5BracketShouldBeReturn1To5() {
        Range range = new Range("[1,5]");
        assertEquals("1,2,3,4,5", range.getOutput());
    }
}
