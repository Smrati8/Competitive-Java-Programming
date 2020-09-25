class PermutationCascade {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> permutation = new LinkedList<>();
        permutation.add(new LinkedList<>());
        
        for(int num : nums) {
            int size = permutation.size();
            for(int i = 0; i < size; i++) {
                List<Integer> list = permutation.poll();
                for(int j = 0; j <= list.size(); j++) {
                    List<Integer> newList = new LinkedList<>(list);
                    newList.add(j, num);
                    if(newList.size() == nums.length) {
                        result.add(newList);
                    } else {
                        permutation.add(newList);
                    }
                }
            }
        }
        
        return result;
    }
}
