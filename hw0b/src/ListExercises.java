import java.util.ArrayList;
import java.util.List;


public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        Integer s = 0;
        for (Integer elem : L){
            s += elem;
        }
        return s;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> result = new ArrayList<>();
        for (Integer elem : L){
            if (elem % 2 == 0){
                result.add(elem);
            }
        }
        return result;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : L1){
            for (Integer j : L2) {
                if (i==j){
                    res.add(i);
                }
            }
        }
        return res;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for (String s : words){
            for (int i=0; i < s.length(); i++){
                if (c == s.charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
