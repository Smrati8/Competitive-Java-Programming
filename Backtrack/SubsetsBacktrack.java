import java.util.*;

public class SubsetsBacktrack {
//Backtrack
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result, 0);
        return result;
    }
    
    private void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> result, int start) {
        result.add(new ArrayList<>(temp));
        for(int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(nums, temp, result, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
    
    public static void main(String arg[]) {
        int nums[] = {1,2,3};
        System.out.println(subsets(nums));
    }
}
