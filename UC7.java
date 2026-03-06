import java.util.*;

public class UC7 {

    /* Inner Static Class */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility method to get pattern of a character
    public static String[] getCharacterPattern(CharacterPatternMap[] patterns, char ch) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    // Method to print banner
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {
            String[] pattern = getCharacterPattern(patterns, ch);

            for (int i = 0; i < 7; i++) {
                banner[i].append(pattern[i]).append("  ");
            }
        }

        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }

    // Main Method
    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {

            new CharacterPatternMap('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }),

            new CharacterPatternMap('P', new String[]{
                    "***** ",
                    "*    *",
                    "*    *",
                    "***** ",
                    "*     ",
                    "*     ",
                    "*     "
            }),

            new CharacterPatternMap('S', new String[]{
                    " *****",
                    "*     ",
                    "*     ",
                    " *****",
                    "     *",
                    "     *",
                    "***** "
            })
        };

        printBanner("OOPS", patterns);
    }
}