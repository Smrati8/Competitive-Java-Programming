import java.util.*;

public class SubsetsWithDuplicates {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, new ArrayList<>(), 0);
        return result;
    }
    
    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> tempList, int start) {
        result.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i-1]) {
                continue;
            }
            tempList.add(nums[i]);
            backtrack(nums, result, tempList, i+1);
            tempList.remove(tempList.size() - 1);
        }
    }
    
    public static void main(String arg[]) {
        int nums[] = {1,2,3};
        System.out.println(subsets(nums));
    }
}

