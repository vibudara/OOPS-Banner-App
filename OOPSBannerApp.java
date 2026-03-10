import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Method to create and return character patterns
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        map.put('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "     *",
                "     *",
                "***** "
        });

        return map;
    }

    // Method to print the banner word
    public static void printBanner(String word, Map<Character, String[]> patterns) {

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {
            String[] pattern = patterns.get(ch);

            for (int i = 0; i < 7; i++) {
                banner[i].append(pattern[i]).append("  ");
            }
        }

        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }

    // Main method
    public static void main(String[] args) {

        Map<Character, String[]> patterns = buildCharacterPatterns();

        String word = "OOPS";

        printBanner(word, patterns);
    }
}