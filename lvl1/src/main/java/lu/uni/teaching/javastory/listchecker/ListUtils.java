package lu.uni.teaching.javastory.listchecker;
import java.util.List;
//import java.util.concurrent.atomic.AtomicReference;

public class ListUtils {

    public static boolean isNumberAnswerInList(Integer number, List<Integer> list){
        return list.stream().filter(n -> n.equals(number)).count() > 0;
    }

}