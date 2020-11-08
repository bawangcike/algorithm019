//给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
//输出：6
//解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 
// 
//
// 示例 2： 
//
// 
//输入：height = [4,2,0,3,2,5]
//输出：9
// 
//
// 
//
// 提示： 
//
// 
// n == height.length 
// 0 <= n <= 3 * 104 
// 0 <= height[i] <= 105 
// 
// Related Topics 栈 数组 双指针 
// 👍 1798 👎 0

package com.leetcode.editor.cn;
public class TrappingRainWater {
    public static void main(String[] args) {
        Solution solution = new TrappingRainWater().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int n = height.length;
        if (n == 0 || height == null){
            return 0;
        }
        int[] max_left = new int[n];
        int[] max_right = new int[n];
        max_left[0] = height[0];
        for (int i=1;i<n-1;i++){
            max_left[i] = Math.max(max_left[i-1],height[i]);
        }
        max_right[n-1] = height[n-1];
        for (int i=n-2;i>0;i--){
            max_right[i] = Math.max(max_right[i+1],height[i]);
        }
        for (int i=1;i<n-1;i++){
            ans += (Math.min(max_left[i],max_right[i]) - height[i]);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}