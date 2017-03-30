final class RnaTranscription {

    static String ofDna(final String dnaString) {
        if (dnaString.isEmpty()) {
            return "";
        }

        final StringBuilder stringBuilder = new StringBuilder();
        for (final char dna : dnaString.toCharArray()) {
            stringBuilder.append(dnaToRnaComplement(dna));
        }

        return stringBuilder.toString();
    }

    private static char dnaToRnaComplement(final char dnaComplement) {
        switch (dnaComplement) {
            case 'G':
                return 'C';
            case 'C':
                return 'G';
            case 'T':
                return 'A';
            case 'A':
                return 'U';
            default:
                throw new IllegalArgumentException("Unknown DNA complement: " + dnaComplement);
        }
    }
}