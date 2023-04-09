import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int sum = 0;
        for (int n : L) {
            sum += n;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> evenLst = new ArrayList<>();
        for (int n: L) {
            if (n % 2 == 0) {
                evenLst.add(n);
            }
        }
        return evenLst;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
         List<Integer> commonLst = new ArrayList<>();
         for (int i = 0; i < L1.size(); i++) {
             for (int j = 0; j < L2.size(); j++) {
                 if (L1.get(i) == L2.get(j)) {
                     commonLst.add(L1.get(i));
                 }
             }
         }

         return commonLst;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int countOfCh = 0;
        for (String word: words) {
            for (int i = 0; i < word.length(); i++) {
                char nextCh = word.charAt(i);
                if (nextCh == c) {
                    countOfCh ++;
                }
            }
        }
        return countOfCh;
    }
}
