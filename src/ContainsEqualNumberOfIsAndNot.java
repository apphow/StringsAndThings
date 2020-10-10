public class ContainsEqualNumberOfIsAndNot {
    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */

    public static Boolean containsEqualNumberOfIsAndNot(String input) {
        int count = 0;
        int num = 0;
        input = input.toLowerCase();
        input = input.replaceAll("x", "");
        input = input.replaceAll("y", "");
        input = input.replaceAll("is", "x");
        input = input.replaceAll("not", "y");

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'x') {
                count++;
            } else if (input.charAt(i) == 'y') {
                num++;
            }

        }
        return count == num;

    }
}
