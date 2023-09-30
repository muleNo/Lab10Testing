import org.example.ArrayFlattener;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayFlattenerTest {

    @Test
    public void testFlattenArrayWithLegitInput() {
        int[][] inputArray = {{1,3}, {0}, {4,5,9}};
        int[] expectedOutput = {1,3,0,4,5,9};
        assertArrayEquals(expectedOutput, ArrayFlattener.flattenArray(inputArray));
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        int[][] inputArray = null;
        int[] expectedOutput = null;
        assertArrayEquals(expectedOutput, ArrayFlattener.flattenArray(inputArray));
    }
}
