class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Online Java Compiler
// Use this editor to write, compile and run your Java code online


        int left=0;
        
        int right=numbers.length-1;
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                break;
            }else if(numbers[left]+numbers[right]<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{left+1, right+1};
       
    }
}
    