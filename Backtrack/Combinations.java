class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(int start, int n, int k, List<Integer> tempList, List<List<Integer>> result) {
        if(tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        
        for(int i = start; i <= n; i++) {
            tempList.add(i);
            backtrack(i+1, n, k, tempList, result);
            tempList.remove(tempList.size()-1);
        }
    }
}
