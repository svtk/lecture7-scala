import java.util.*;

public class JavaWildcards {

    public static void foo(Integer[] ints) {

        Object[] objects = ints;
//        objects[0] = "";
    }

    public static void bar(List<Object> objects, List<Integer> ints) {

//        objects = ints; //doesn't compile
        objects.addAll(ints);
    }

    public static void baz(List<? extends String> c) {

//        c.add(new Object());
        String s = c.get(0);
        Object o = s;
    }

    public static Collection<?> getWildcardCollection() {
        return null;
    }

    public static Map<? super Integer, ? extends String> getWildcardMap() {
        return null;
    }
}
