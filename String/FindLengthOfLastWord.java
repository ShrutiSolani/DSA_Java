class FindLengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int j = n-1;
        int count = 0;
        if(s == " "){
            return 0;
        }
        while(j>= 0 && s.charAt(j) == ' '){
            j--;
        }
        while(j >= 0 && s.charAt(j) != ' '){
            count++;
            j--;
        }
        return count;
    }
}