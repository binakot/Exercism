import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

final class PangramChecker {

    private static final int ENGLISH_ALPHABET_CHARACTERS_COUNT = 26;

    boolean isPangram(final String input) {
        if (input.isEmpty()) {
            return false;
        }

        final byte[] chars = input.toLowerCase().getBytes(StandardCharsets.US_ASCII);
        final Set<Byte> charSet = new HashSet<>(0);
        for (final byte ch : chars) {
            if (ch >= 'a' && ch <= 'z') {
                charSet.add(ch);
            }
        }

        return charSet.size() == ENGLISH_ALPHABET_CHARACTERS_COUNT;
    }
}
