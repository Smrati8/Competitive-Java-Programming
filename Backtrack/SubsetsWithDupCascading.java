import java.util.*;

public class SubsetsWithDupCascading {
//Cascading
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        int endIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            int startIndex = 0;
            if(i > 0 && nums[i] == nums[i-1]) {
                startIndex = endIndex;
            }
            endIndex = result.size();
            
            for(int j = startIndex; j < endIndex; j++) {
                List<Integer> list = new ArrayList<>(result.get(j));
                list.add(nums[i]);
                result.add(list);
            }
        }
        return result;
    }
    
    public static void main(String arg[]) {
        int nums[] = {1,2,3};
        System.out.println(subsets(nums));
    }
}

