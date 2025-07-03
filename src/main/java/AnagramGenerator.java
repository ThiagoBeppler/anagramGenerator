import java.util.ArrayList;
import java.util.List;

public class AnagramGenerator {

    public static List<String> generateAnagrams(String input) {

        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input must be a non-empty string.");
        }
        if (!input.matches("^[a-zA-Z]+$")) {
            throw new IllegalArgumentException("Input must contain only alphabetic letters.");
        }

        List<String> result = new ArrayList<>();
        boolean[] used = new boolean[input.length()];
        backtrack(input.toCharArray(), new StringBuilder(), used, result);
        return result;
    }

    private static void backtrack(char[] chars, StringBuilder path, boolean[] used, List<String> result) {
        if (path.length() == chars.length) {
            result.add(path.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            path.append(chars[i]);
            backtrack(chars, path, used, result);
            path.deleteCharAt(path.length() - 1); // backtrack
            used[i] = false;
        }
    }
}
