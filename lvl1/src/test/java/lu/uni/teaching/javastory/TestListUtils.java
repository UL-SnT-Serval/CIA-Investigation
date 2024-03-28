package lu.uni.teaching.javastory;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lu.uni.teaching.javastory.listchecker.ListUtils;

public class TestListUtils {

    @Test
    public void testEmpty(){
        List<Integer> list= Collections.emptyList();
        assertFalse(ListUtils.isNumberAnswerInList(0, list));
    }

    @Test
    public void testInList(){
        List<Integer> list = Arrays.asList(49, 85, 0);
        assertTrue(ListUtils.isNumberAnswerInList(0, list));
    }

    @Test
    public void testNotInList(){
        List<Integer> list = Arrays.asList(49, 85, 0);
        assertFalse(ListUtils.isNumberAnswerInList(42, list));
    }

}
