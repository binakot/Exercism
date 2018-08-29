class RnaTranscription {

    String transcribe(String dnaStrand) {
        return dnaStrand
                .codePoints()
                .map(Character::toUpperCase)
                .map(RnaTranscription::nucleotideMap)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    private static int nucleotideMap(int c) {
        switch (c) {
            case 'G' : return 'C';
            case 'C' : return 'G';
            case 'T' : return 'A';
            case 'A' : return 'U';
        }

        throw new IllegalArgumentException("Invalid input");
    }
}
