import edu.princeton.cs.algs4.In;
import org.antlr.v4.runtime.tree.Tree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> m = new HashMap<>();
        Integer i = 1;
        for (Character c = 'a'; c <='z'; c++, i++){
            m.put(c, i);
        }
        return m;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> m= new HashMap<Integer, Integer>();
        for (Integer i : nums){
            m.put(i, (int) Math.pow(i, 2.0));
            System.out.println(i);
        }
        return m;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> m = new TreeMap<>();
        for (String s : words){
            if (m.containsKey(s)){
                m.put(s, m.get(s)+1);
            } else {
                m.put(s, 1);
            }
        }
        return m;
    }
}
