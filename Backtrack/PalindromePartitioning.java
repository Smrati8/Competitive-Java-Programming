class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(String s, List<String> temp, List<List<String>> result) {
        // System.out.println(temp);
        if(s.equals("")) {
            // System.out.println("Hello");
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i = 0; i < s.length(); i++) {
            String first = s.substring(0, i+1);
            String last = s.substring(i+1);
            if(isPalindrome(first)) {
                // System.out.println(first + " : " + last);
                temp.add(first);
                backtrack(last, temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }
    
    private boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while(i <= j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
