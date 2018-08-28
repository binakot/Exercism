import java.util.stream.IntStream;

class Hamming {

    private final String sequence1;
    private final String sequence2;

    Hamming(final String sequence1, final String sequence2) {
        if (sequence1.length() != sequence2.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.sequence1 = sequence1;
        this.sequence2 = sequence2;
    }

    int getHammingDistance() {
        return IntStream
                .range(0, sequence1.length())
                .map(i -> sequence1.charAt(i) != sequence2.charAt(i) ? 1 : 0)
                .sum();
    }
}
