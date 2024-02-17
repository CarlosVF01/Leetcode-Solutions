package from2901to3000;

import java.util.ArrayList;
import java.util.List;

//TODO: Improve speed from 2ms to 1ms
public class FindWordsContainingCharacter2942 {
    class Solution {
        public List<Integer> findWordsContaining(String[] words, char x) {
            List<Integer> indexList = new ArrayList<>();
            for (int i = 0; i < words.length; i++) {
                if (words[i].contains(String.valueOf(x))) {
                    indexList.add(i);
                }
            }
            return indexList;
        }
    }
}
