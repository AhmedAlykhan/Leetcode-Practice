class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> viewedNumbers = new HashMap<>();

        for (int i=0 ; i<nums.length; i++){

            int complement= target-nums[i];
            
           if(viewedNumbers.containsKey(complement)){
           int complemetIndex= viewedNumbers.get(complement);
           return new int[] {complemetIndex,i};
           }

           viewedNumbers.put(nums[i],i);

            
        }

     return new int[] {};

    }
}