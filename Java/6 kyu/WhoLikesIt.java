/* 6 kyu - Who likes it?
https://www.codewars.com/kata/who-likes-it/train/java
 */
import java.util.Arrays;
import java.util.List;

public class WhoLikesIt {
    public static void main(String[] args) {

        //Tests
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Alex"));
        System.out.println(whoLikesIt("Alex", "Peter"));
        System.out.println(whoLikesIt("Alex", "Peter", "Mark"));
        System.out.println(whoLikesIt("Alex", "Peter", "Mark", "John"));
    }

    public static String whoLikesIt(String... names) {
        if (names == null || names.equals(""));
        List<String> strings = Arrays.asList(names);
        if ((strings.size() == 1) && (strings.get(0).length() > 0)) {
            return strings.get(0) + " likes this";
        } else if (strings.size() == 2) {
            return strings.get(0) + " and " + strings.get(1) + " like this";
        } else if (strings.size() == 3) {
            return strings.get(0) + ", " + strings.get(1) + " and " + strings.get(2) +" like this";
        } else if (strings.size() > 3) {
            return strings.get(0) + ", " + strings.get(1) + " and " + (strings.size()-2) + " others like this";
        }
        return "no one likes this";
    }
}