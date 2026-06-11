class Solution {
    public int firstUniqChar(String s) {
        //Initailize a frquencey array for the 26 lowercase english objects
        int[] frequencies = new int[26];

        //pass 1 building the frequency map
        for(int i=0; i<s.length(); i++){
            frequencies[s.charAt(i)-'a']++;
        }

        // Pass 2: Scan the string from left to right to find the first unique character
        for(int i=0; i<s.length(); i++){
            if( frequencies[s.charAt(i)-'a']==1){
                return i;// Return the index of the first unique character found
            }

        }

        return -1;
    }
    
}