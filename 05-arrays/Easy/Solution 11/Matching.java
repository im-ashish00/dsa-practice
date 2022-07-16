import java.util.*;

public class Matching {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    static public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if ((ruleKey == "type" && items.get(i).get(0).equals(ruleValue)) ||
                    (ruleKey == "color" && items.get(i).get(1).equals(ruleValue)) ||
                    (ruleKey == "name" && items.get(i).get(2).equals(ruleValue))) {
                count++;
            }
        }
        return count;
    }
}
