import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to reach the target
            int complement = target - nums[i];
            
            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }
            
            // Add the current number and its index to the HashMap
            map.put(nums[i], i);
        }
        
        // If no solution is found (not possible as per constraints), throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
}
