class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        HashMap<Character, Integer> P = new HashMap<>();
        HashMap<Character, Integer> S = new HashMap<>();

        List<Integer> output = new ArrayList<>();

        int window = p.length();

        if (window > s.length()) {
            return output;
        }

        // Frequency of p
        for (int i = 0; i < window; i++) {
            char c = p.charAt(i);
            P.put(c, P.getOrDefault(c, 0) + 1);
        }

        // First window
        for (int i = 0; i < window; i++) {
            char c = s.charAt(i);
            S.put(c, S.getOrDefault(c, 0) + 1);
        }

        if (S.equals(P)) {
            output.add(0);
        }

        // Slide the window
        for (int i = window; i < s.length(); i++) {

            // Remove leaving character
            char leaving = s.charAt(i - window);

            S.put(leaving, S.get(leaving) - 1);

            if (S.get(leaving) == 0) {
                S.remove(leaving);
            }

            // Add entering character
            char entering = s.charAt(i);

            S.put(entering, S.getOrDefault(entering, 0) + 1);

            // Check current window
            if (S.equals(P)) {
                output.add(i - window + 1);
            }
        }

        return output;
    }
}