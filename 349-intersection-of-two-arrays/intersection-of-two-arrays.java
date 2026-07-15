import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> answer = new HashSet<>();

        // Store all elements of nums1
        for (int num : nums1) {
            set.add(num);
        }

        // Check nums2
        for (int num : nums2) {

            if (set.contains(num)) {
                answer.add(num);
            }

        }

        // Convert HashSet to int[]
        int[] result = new int[answer.size()];

        int i = 0;

        for (int num : answer) {

            result[i] = num;
            i++;

        }

        return result;
    }
}