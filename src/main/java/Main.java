import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> anagrams = AnagramGenerator.generateAnagrams("Thiago");
        System.out.println(anagrams);
    }
}