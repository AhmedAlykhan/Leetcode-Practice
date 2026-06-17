class Solution {
    public boolean isPalindrome(String s) {
        
        //Base case: An empty string or single-character string is always a palindrome
        if(s == null || s.isEmpty()){
            return false;
        }


        // Initialize colliding pointers
       int left = 0;
       int right = s.length()-1;

      while (left < right){
         
         //inner loop 1 moving left pointer forward if its not an alphabet
         while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
            left++;
         }
          
         //inner loop 2 moving right pointer backwards if its not an alphabet
         while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
         }

         //if pointers havent crossed eachother compare them
         if(left<right){
             char leftChar = Character.toLowerCase(s.charAt(left));
             char rightChar = Character.toLowerCase(s.charAt(right));
            
            // If characters do not match, it is not a palindrome
             if(leftChar!=rightChar){
                return false;
             }
            
            // Move both pointers inward
             left++;
             right--;


         }
       }
        // If the pointers successfully met or crossed, the string is a valid palindrome
        return true;
    }
}