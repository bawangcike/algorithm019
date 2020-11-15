import java.util.Arrays;

import sun.jvm.hotspot.oops.Array;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 解题思路：先比较String长度是否相同，若不同返回false,否则对两个String进行转化为char数组，再排序，在遍历比较是否一致。
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();
        Arrays.sort(s_char);
        Arrays.sort(t_char);

        for(int i=0;i<s_char.length;i++){   
            boolean con= s_char[i] == t_char[i]?true:false;
            if(!con){
                return false;
            }           
        }
        return true;        
    }
}
// @lc code=end
