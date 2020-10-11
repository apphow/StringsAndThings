public class GIsHappy {

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public static Boolean gIsHappy(String input) {

        boolean isHappy = false;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == 'g'){
                if(input.charAt(i-1) == 'g' || input.charAt(i+1) == 'g'){
                    isHappy = true;
                }else {
                    isHappy = false;
                }
            }
        }
        return isHappy;
    }


/*
        boolean isHappy = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'g') {
                if (input.charAt(i -1) == 'g') {
                    isHappy = true;
                } else if(input.charAt(i + 1) == 'g')
                    isHappy = true;
                } else
                    isHappy = false;
            }
        return isHappy;
    }

 */
}
