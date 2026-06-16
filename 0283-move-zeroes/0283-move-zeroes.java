class Solution {
    public void moveZeroes(int[] nums) {
        // This is your 'slow' writer pointer. Declare it OUTSIDE the loop.
        int insertPosition = 0;

        // Pass 1: The 'i' variable is your 'fast' reader pointer.
        for (int i = 0; i < nums.length; i++) {
            // If the current number is NOT a zero...
            if (nums[i] != 0) {
                // Overwrite the zero at the slow pointer's location
                nums[insertPosition] = nums[i];
                // Move the slow pointer forward
                insertPosition++;
            }
        }
        
        // Pass 2: The non-zero numbers are packed at the front. 
        // Now, fill the rest of the array with zeroes starting from the slow pointer.
        while (insertPosition < nums.length) {
            nums[insertPosition] = 0;
            insertPosition++;
        }
    }
}