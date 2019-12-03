import java.util.regex.*;
public class regexExample2 {
        public static void main(String[] args) {
            System.out.println(Pattern.matches(".s","as"));//true(2 char is s)
            System.out.println(Pattern.matches(".s","mk"));//false(2 char is not s)
            System.out.println(Pattern.matches(".s","mst"));//false(has more then two char)
            System.out.println(Pattern.matches(".s","amms"));//false(has more then 2 char)
            System.out.println(Pattern.matches("..s","mas"));//true(3 char is s)
        }
    }


