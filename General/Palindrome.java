class Palindrome {
    public boolean isPalindrome(int x) {
        int i;
        String num = Integer.toString(x);
        int n = num.length();
        for(i = 0;i <= (int)n/2; i++){
            if(num.charAt(i) != num.charAt(n-1-i)){
                return false;
            }
        }
        return true;
        
    }
}