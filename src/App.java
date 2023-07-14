import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println(countVietnameseCharacters("hfdawhwhcoomddw"));
    }

    public static int countVietnameseCharacters(String s) {
        int result = 0;
        List<String> vietnameseCharacters = List.of("aa", "aw", "oo", "ow", "dd", "ee", "uw");
        if (s == null) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'w') {
                result += 1;
                continue;
            }
            String doubleCharacter = s.substring(i, i + 2);
            if (vietnameseCharacters.contains(doubleCharacter)) {
                result += 1;
                i++;
            }
        }
        return result;
    }
}
