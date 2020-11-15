import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 * 解题思路：对字符串数组每个元素进行排序arrstring,若map含有该key,则存放在该key的value
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ConcurrentMap<String,List<String>> map = new ConcurrentHashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String arrString = String.valueOf(arr);
            List<String> data = new ArrayList<>();
            
            if(map.containsKey(arrString)){
                data = map.get(arrString);                  
            }
            data.add(s);
            map.put(arrString, data);
        }
        return new ArrayList<>(map.values());
    }
}
// @lc code=end
