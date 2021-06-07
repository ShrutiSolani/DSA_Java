class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1){
            return("1");
        }
        else{
            StringBuilder x = new StringBuilder();
            String prev = countAndSay(n - 1);
            int count = 1;
            for(int i = 0; i < prev.length(); i++){
                if(i == prev.length() - 1 || prev.charAt(i) != prev.charAt(i + 1)) {
                    x.append(count).append(prev.charAt(i));
                    count = 1;
                }
                else{
                    count++;
                }
            }
            String x1 = x.toString();
            return(x1);
        }
    }
}