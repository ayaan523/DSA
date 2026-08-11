class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] result = new int[n];

        // k == 0
        if (k == 0) {
            return result;
        }

        // k > 0: sum next k elements
        if (k > 0) {

            int sum = 0;

            // Build first window for index 0
            for (int j = 1; j <= k; j++) {
                sum += code[j % n];
            }

            for (int i = 0; i < n; i++) {

                result[i] = sum;

                // Remove the element leaving
                sum -= code[(i + 1) % n];

                // Add the new element entering
                sum += code[(i + k + 1) % n];
            }
        }

        // k < 0: sum previous |k| elements
        else {

            int window = -k;
            int sum = 0;

            // Build first window for index 0
            for (int j = 1; j <= window; j++) {
                sum += code[(n - j) % n];
            }

            for (int i = 0; i < n; i++) {

                result[i] = sum;

                // Remove the element leaving
                sum -= code[(i - window + n) % n];

                // Add the new element entering
                sum += code[i];
            }
        }

        return result;
    }
}