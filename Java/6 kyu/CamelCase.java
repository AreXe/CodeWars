/* 6 kyu - CamelCase Method
https://www.codewars.com/kata/camelcase-method/java
 */
public class CamelCase {
    public static void main(String[] args) {

        //Sample test
        System.out.println(camelCase("  hello camel case"));
    }

    public static String camelCase(String str) {
        if (str == "") return "";
        String word = str.replaceAll("^\\s+", "");
        String[] words = word.split("\\s+");
        String camelWord = "";
        for (String s : words) {
            if (s != null && s.length() > 0) {
                camelWord += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
            }
        } return camelWord;
    }
}