public class CountTriple {

    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public static Integer countTriple(String input){
        int count = 0;

        for(int i = 0; i < input.length()-3; i++) {
            if(input.charAt(i) == input.charAt(i + 1) && input.charAt(i) == input.charAt(i + 2)) {
                count++;
            }
        }
        return count;
    }
}
