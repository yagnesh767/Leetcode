class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Return an empty string if the input array is empty or null
        }
        
        // Start with the first string as the potential prefix
        String prefix = strs[0];
        
        // Iterate through the remaining strings
        for (int i = 1; i < strs.length; i++) {
            // Compare the current prefix with each string
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix; // Return the longest common prefix
    }
}
