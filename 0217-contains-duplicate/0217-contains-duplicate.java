class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seenNumbers= new HashSet<>();
        for(int num: nums){
            if(!seenNumbers.add(num)) return true;

        }
        return false;
    }
}