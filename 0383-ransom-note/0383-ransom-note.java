class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];
        
        // Fix 1: It's only impossible if ransomNote needs MORE characters than magazine has
        if (ransomNote.length() > magazine.length()){
            return false;
        }

        // Pass 1: Build inventory from magazine
        for (int i = 0; i < magazine.length(); i++){
            charCount[magazine.charAt(i) - 'a']++;
        } 

        // Pass 2: Consume inventory for ransomNote
        // Fix 2: Added i++ to prevent infinite loop
        for (int i = 0; i < ransomNote.length(); i++){
            charCount[ransomNote.charAt(i) - 'a']--;
            
            // Fix 3: Check if the count inside the array dropped below 0
            if (charCount[ransomNote.charAt(i) - 'a'] < 0){
                return false;
            }
        }

        return true;
    }
}