class Leetcode1239 {
    int max = 0;
    public int maxLength(List<String> arr) {
        backtrack(arr, "", 0);
        return max;
    }
    
    private void backtrack(List<String> arr, String str, int start) {
        max = Math.max(max, str.length());
        for(int i = start; i < arr.size(); i++) {
            String ans = str + arr.get(i);
            if(isUnique(ans)) {
                backtrack(arr, ans, i + 1);
            }
        }
    }
    
    private boolean isUnique(String str) {
        Set<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()) {
            if(set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}
