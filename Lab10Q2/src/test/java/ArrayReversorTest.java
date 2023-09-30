import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.*;

import org.example.ArrayFlattenerService;
import org.example.ArrayReversor;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ArrayReversorTest {

    @Mock
    ArrayFlattenerService arrayFlattenerService;

    @InjectMocks
    ArrayReversor arrayReversor;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testReverseArray() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        when(arrayFlattenerService.flattenArray(inputArray)).thenReturn(new int[]{1, 3, 0, 4, 5, 9});
        int[] expectedResult = {9, 5, 4, 0, 3, 1};
        int[] actualResult = arrayReversor.reverseArray(inputArray);
        assertArrayEquals(expectedResult, actualResult);
        verify(arrayFlattenerService).flattenArray(inputArray);
    }
}
