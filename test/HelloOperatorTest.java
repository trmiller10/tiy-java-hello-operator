import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelloOperatorTest extends OutputTest {

    @Test
    public void testOutput(){
        HelloOperator.main(null);

        assertThat(outputStream.toString(), is("134.4\n" +
                "true\n" +
                "125.19999999999999=125.2? false\n" +
                "425.0\n" +
                "425.0\n" +
                "false\n" +
                "false\n" +
                "true\n" +
                "false\n"));
    }
}