import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] rows = new String[]{"logo", "mama", "coco", "yes"};

        HashMap<String, Integer> result = countUniqueCharacters(rows);
        for (String str : result.keySet()) {
            int uniqueCharactersCount = result.get(str);
            System.out.println("String: " + str + "UniqueCharactersCount: " + uniqueCharactersCount);
        }
    }
    public static HashMap <String, Integer> countUniqueCharacters (String [] strings) {
    HashMap <String, Integer> result = new HashMap<>();

    for (String str : strings) {
        char [] charArray = str.toCharArray();
        int uniqueCharactersCount = countUniqueCharactersInArray(charArray);
        result.put(str, uniqueCharactersCount);
    }
    return result;
    }
    private static int
countUniqueCharactersInArray(char [] charArray) {
    HashMap <Character, Integer> charCountMap = new HashMap<>();

    for (char ch : charArray){
    charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
    }
    return charCountMap.size();
    }
}
