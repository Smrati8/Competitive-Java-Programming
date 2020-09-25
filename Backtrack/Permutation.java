import java.util.*;

class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean seen[] = new boolean[nums.length];
        backtrack(nums, seen, new ArrayList<>(), result);
        return result;
    }
    
    public void backtrack(int nums[], boolean seen[], List<Integer> tempList, List<List<Integer>> result) {
        if(nums.length == tempList.size()) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(seen[i]) {
                continue;
            }
            tempList.add(nums[i]);
            seen[i] = true;
            backtrack(nums, seen, tempList, result);
            tempList.remove(tempList.size()-1);
            seen[i] = false;
        }
    }
}
