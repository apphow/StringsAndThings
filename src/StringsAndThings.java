public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */

    public static int countYZ(String input) {
        String[] arr = input.split(" ");
        int count = 0;
        for (String each : arr) {
            if (each.charAt(each.length() - 1) == 'y' || each.charAt(each.length() - 1) == 'z') {
                count++;
            }
        }
        return count;
    }
}
