class Solution {
    
    /**
     * Approach 1: Sorting-Based Keys
     * Time Complexity: O(N * K log K) where N is the number of strings and K is the max length of a string.
     * Space Complexity: O(N * K) to store the elements in the grouping map.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        // Guard clause for edge cases
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        // Map to group anagrams: Key = Sorted String signature, Value = List of matches
        Map<String, List<String>> signatureMap = new HashMap<>();
        
        for (String word : strs) {
            // Step 1: Convert the string to a character array and sort it
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            
            // Step 2: Reconstruct the sorted characters back to a string to act as the map key
            String signatureKey = new String(charArray);
            
            // Step 3: Compute/retrieve the list for this signature and append the original word
            signatureMap.putIfAbsent(signatureKey, new ArrayList<>());
            signatureMap.get(signatureKey).add(word);
        }
        
        // Step 4: Convert the map values collection directly into a nested list
        return new ArrayList<>(signatureMap.values());
    }
}