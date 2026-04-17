package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {
    public static void main(String[] args) {
        List<String>myList= Arrays.asList("apple","banana","Orange");
        Stream<String>seq=myList.stream();
        Stream<String>par=myList.stream();
        List<String> ans=myList.stream().
                filter(s->s.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(ans);
        List<Integer>length=myList.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(length);
    }
}
