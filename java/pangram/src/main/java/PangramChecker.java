import java.util.stream.IntStream;
import java.util.stream.Stream;

class PangramChecker {

    static boolean isPangram(String sentence) {
        return alphabet().allMatch(c -> sentence.toLowerCase().indexOf(c) != -1);
    }

    private static Stream<Character> alphabet() {
        return IntStream.rangeClosed('a', 'z').mapToObj(i -> (char) i);
    }
}
