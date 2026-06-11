class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> elementFrequency = new HashMap<>();

        int threshold = nums.length/2;

        for(int i=0; i<nums.length;i++){
            
            elementFrequency.put(nums[i],elementFrequency.getOrDefault(nums[i], 0) + 1);

            int count= elementFrequency.getOrDefault(nums[i], 0);
            if(count>threshold){
                return nums[i];
            }
        }

        return -1;
        
    }
}