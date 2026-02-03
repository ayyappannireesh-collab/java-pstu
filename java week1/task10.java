class UserMainCode {

    public static String secondWordUpper(String str) {

        // Trim extra spaces
        str = str.trim();

        // Split words by space
        String[] words = str.split("\\s+");

        // If less than two words, return "LESS"
        if (words.length < 2)
            return "LESS";

        // Return second word in uppercase
        return words[1].toUpperCase();
    }
}
