import java.util.*;

public class Subsets {
//Cascading
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int num : nums) {
            int size = result.size();
            for(int i = 0; i < size; i++) {
                List<Integer> list= new ArrayList<>(result.get(i));
                list.add(num);
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
