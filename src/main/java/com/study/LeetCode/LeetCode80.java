package com.study.LeetCode;

/**
 * @author jianghui
 * @date 2020-12-21 17:48
 */
public class LeetCode80 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        for (int i = 2; i < n; i++) {
            if (nums[i] == nums[i - 1] && nums[i] == nums[i - 2]) {
                n--;
                if (nums.length - 1 - i >= 0) {
                    System.arraycopy(nums, i + 1, nums, i, nums.length - 1 - i);
                }
                i--;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6};
        int i = new LeetCode80().removeDuplicates(arr);
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }
    }
}
