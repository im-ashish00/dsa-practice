public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.length() < 26) return false;
            if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') seen[sentence.charAt(i) - 'a'] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (seen[i] == false) return false;
        }
        return true;
    }
}
