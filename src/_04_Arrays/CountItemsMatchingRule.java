package _04_Arrays;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<String>> ls = new ArrayList<>(5);
        String ruleKey = "name";
        String ruleValue = "ipad";

        for (int i = 0; i<3; i++){
            ls.add(new ArrayList<>(3));
        }

        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                ls.get(i).add(in.next());
            }
        }

        System.out.println(ls);

        int res = countItemsMatchingRule(ls, ruleKey, ruleValue);
        System.out.println(res);

    }

    static int countItemsMatchingRule(ArrayList<ArrayList<String>> ls, String ruleKey, String ruleValue) {
        int count = 0;
        switch (ruleKey) {
            case "type":
                for (ArrayList<String> arr : ls) {
                    if (ruleValue.equals(arr.get(0)))
                        count++;
                }
                break;
            case "color":
                for (ArrayList<String> arr : ls) {
                    if (ruleValue.equals(arr.get(1)))
                        count++;
                }
                break;
            case "name":
                for (ArrayList<String> arr : ls) {
                    if (ruleValue.equals(arr.get(2)))
                        count++;
                }
                break;
        }
        return count;
    }

}

