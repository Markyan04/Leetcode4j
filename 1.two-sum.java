/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    // Brute Force
    public int[] twoSum_1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    // Two-pass Hash Table
    public int[] twoSum_2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int summand = target - nums[j];
            if (map.containsKey(summand) && map.get(summand) != j) {
                return new int[] {j, map.get(summand)};
            }
        }
        return new int[] {};
    }

    // One-pass Hash Table
    public int[] twoSum_3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int summand = target - nums[i];
            if (map.containsKey(summand)) {
                return new int[] {map.get(summand), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
// @lc code=end

