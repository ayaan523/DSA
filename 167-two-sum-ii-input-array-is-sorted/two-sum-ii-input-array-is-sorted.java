class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Online Java Compiler
// Use this editor to write, compile and run your Java code online


        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[] {left+1, right+1};
            }
            if(sum>target){
                right--;
            }else{
            left++;}
        }return new int[]{-1,-1};       
    }
}
    