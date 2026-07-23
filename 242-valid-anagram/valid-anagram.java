import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> S = new HashMap<>();
        HashMap<Character, Integer> T = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            S.put(ch, S.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            T.put(ch, T.getOrDefault(ch, 0) + 1);
        }

        return S.equals(T);
    }
}