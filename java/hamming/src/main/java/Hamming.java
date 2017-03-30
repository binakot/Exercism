final class Hamming {

    private final String dna1;
    private final String dna2;

    Hamming(final String dna1, final String dna2) {
        if (dna1.length() != dna2.length()) {
            throw new IllegalArgumentException("DNA strands lengths are different");
        }

        this.dna1 = dna1;
        this.dna2 = dna2;
    }

    int getHammingDistance() {
        int hammingDistance = 0;
        final char[] dna1Complements = dna1.toCharArray();
        final char[] dna2Complements = dna2.toCharArray();
        for (int i = 0; i < dna1Complements.length; i++) {
            if (dna1Complements[i] != dna2Complements[i]) {
                hammingDistance++;
            }
        }

        return hammingDistance;
    }
}
