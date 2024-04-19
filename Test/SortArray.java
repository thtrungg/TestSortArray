package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SortArray{

    @Test
    public void testArraySort() {
        int[] numbers = {20, 35, -15, 7, 55, 1, -22};
        int[] expectedSortedNumbers = {-22, -15, 1, 7, 20, 35, 55};
        SortArray.sort(numbers);

        assertArrayEquals(expectedSortedNumbers, numbers);
    }

    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        int[] expectedEmptyArray = {};
        
        SortArray.sort(emptyArray);
        
        assertArrayEquals(expectedEmptyArray, emptyArray);
    }

    @Test
    public void testSingleElementArray() {
        int[] singleElementArray = {5};
        int[] expectedSingleElementArray = {5};
        
        SortArray.sort(singleElementArray);
        
        assertArrayEquals(expectedSingleElementArray, singleElementArray);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] sortedArray = {-10, -5, 0, 5, 10};
        int[] expectedSortedArray = {-10, -5, 0, 5, 10};
        
        SortArray.sort(sortedArray);
        
        assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] arrayWithDuplicates = {4, 2, 2, 3, 1, 4, 4};
        int[] expectedSortedArray = {1, 2, 2, 3, 4, 4, 4};
        
        SortArray.sort(arrayWithDuplicates);
        
        assertArrayEquals(expectedSortedArray, arrayWithDuplicates);
    }

    @Test
    public void testArrayWithAllEqualElements() {
        int[] arrayWithAllEqualElements = {3, 3, 3, 3, 3};
        int[] expectedSortedArray = {3, 3, 3, 3, 3};
        
        // Call the sorting function
        SortArray.sort(arrayWithAllEqualElements);
        
        // Check if the array with all equal elements remains unchanged
        assertArrayEquals(expectedSortedArray, arrayWithAllEqualElements);
    }
    
    @Test
    public void testArrayWithMixedNumbers() {
        int[] mixedNumbersArray = {-1, 0, 5, -5, 3, -3, 7};
        int[] expectedSortedArray = {-5, -3, -1, 0, 3, 5, 7};
        
        // Call the sorting function
        SortArray.sort(mixedNumbersArray);
        
        // Check if the array with mixed numbers is sorted as expected
        assertArrayEquals(expectedSortedArray, mixedNumbersArray);
    }
}

