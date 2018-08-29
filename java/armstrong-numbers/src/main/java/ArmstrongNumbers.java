class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
        final String str = String.valueOf(numberToCheck);
        final int digitsNumber = str.length();
        final int sum = str.chars()
                .map(Character::getNumericValue)
                .map(i -> (int) Math.pow(i, digitsNumber))
                .sum();

        return numberToCheck == sum;
    }
}
