package week03;

import java.util.ArrayList;
import java.util.List;

public class Combine {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (n <= 0 || k <= 0) return res;
        helper(res,n,1,k,new ArrayList<>());
        return res;
    }
    private void helper(List<List<Integer>> res, int n,int index,int k,List<Integer> list) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i=index;i<=n;i++) {
            list.add(i);
            helper(res,n,i+1,k,list);
            list.remove(list.size() - 1);
        }
    }
}