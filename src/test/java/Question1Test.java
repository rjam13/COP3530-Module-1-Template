import org.cop3530.assignments.module1.Question1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Question1Test {
    @Test
    public void test_algorithm1_1() {
        int arr1 [] = { -1, 12, -3, 14, -4, 3 };
        Assertions.assertEquals(23, Question1.algorithm1(arr1));
    }

    @Test
    public void test_algorithm1_2() {
        int arr2 [] = { 2, -3, 5, -1, 0, 7};
        Assertions.assertEquals(11, Question1.algorithm1(arr2));
    }

    @Test
    public void test_algorithm2_1() {
        int arr1 [] = { -1, 12, -3, 14, -4, 3 };
        Assertions.assertEquals(23, Question1.algorithm2(arr1));
    }

    @Test
    public void test_algorithm2_2() {
        int arr2 [] = { 2, -3, 5, -1, 0, 7};
        Assertions.assertEquals(11, Question1.algorithm2(arr2));
    }

    @Test
    public void test_algorithm3_1() {
        int arr1 [] = { -1, 12, -3, 14, -4, 3 };
        Assertions.assertEquals(23, Question1.algorithm3(arr1));
    }

    @Test
    public void test_algorithm3_2() {
        int arr2 [] = { 2, -3, 5, -1, 0, 7};
        Assertions.assertEquals(11, Question1.algorithm3(arr2));
    }
}
