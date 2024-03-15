import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CheckItTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Test
    public void testPredicateCoverage1() {
        System.setOut(new PrintStream(out));

        CheckIt.checkIt(true, true, true);
        assertEquals("P is true", out.toString());
    }

    @Test
    public void testForPredicateCoverage2() {
        System.setOut(new PrintStream(out));

        CheckIt.checkIt(false, true, false);
        assertEquals("P isn't true", out.toString());
    }

    @Test
    public void testForPredicateCoverage3() {
        System.setOut(new PrintStream(out));

        CheckIt.checkIt(false, false, false);
        assertEquals("P isn't true", out.toString());
    }

    @Test
    public void testForClauseCoverage1() {
        System.setOut(new PrintStream(out));

        CheckIt.checkIt(true, true, true);
        assertEquals("P is true", out.toString());
    }

    @Test
    public void testForClauseCoverage2() {
        System.setOut(new PrintStream(out));

        CheckIt.checkIt(true, true, false);
        assertEquals("P is true", out.toString());
    }


    @Test
    public void testForClauseCoverage3() {
        System.setOut(new PrintStream(out));

        CheckIt.checkIt(false, false, false);
        assertEquals("P isn't true", out.toString());
    }


    @Test
    public void testForCACCCoverage1() {
        System.setOut(new PrintStream(out));

        CheckIt.checkIt(true, true, true);
        assertEquals("P is true", out.toString());
    }

    @Test
    public void testForCACCCoverage2() {
        System.setOut(new PrintStream(out));

        CheckIt.checkIt(false, false, true);
        assertEquals("P isn't true", out.toString());
    }

    @Test
    public void testForCACCCoverage3() {
        System.setOut(new PrintStream(out));

        CheckIt.checkIt(false, true, false);
        assertEquals("P isn't true", out.toString());
    }

    @Test
    public void testForCACCCoverage4() {
        System.setOut(new PrintStream(out));

        CheckIt.checkIt(false, true, false);
        assertEquals("P isn't true", out.toString());
    }

    @Test
    public void testForRACCCoverage1() {
        System.setOut(new PrintStream(out));

        CheckIt.checkIt(true, true, true);
        assertEquals("P is true", out.toString());

    }

    @Test
    public void testForRACCCoverage2() {
        System.setOut(new PrintStream(out));

        CheckIt.checkIt(true, true, true);
        assertEquals("P is true", out.toString());
    }

}
