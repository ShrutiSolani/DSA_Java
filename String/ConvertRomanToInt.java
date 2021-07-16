class ConvertRomanToInt {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int sum = 0;
        for(int i = 0;i < s.length(); i++){
            if((s.charAt(i) == 'I') && (i != s.length()-1) && (s.charAt(i+1) == 'V')){
                sum += 4;
                i++;
            }
            else if((s.charAt(i) == 'I') && (i != s.length()-1) && (s.charAt(i+1) == 'X')){
                sum += 9;
                i++;
            }
            else if((s.charAt(i) == 'X') && (i != s.length()-1) && (s.charAt(i+1) == 'L')){
                sum += 40;
                i++;
            }
            else if((s.charAt(i) == 'X') && (i != s.length()-1) && (s.charAt(i+1) == 'C')){
                sum += 90;
                i++;
            }
            else if((s.charAt(i) == 'C') && (i != s.length()-1) && (s.charAt(i+1) == 'D')){
                sum += 400;
                i++;
            }
            else if((s.charAt(i) == 'C') && (i != s.length()-1) && (s.charAt(i+1) == 'M')){
                sum += 900;
                i++;
            }
            else{
                sum += hm.get(s.charAt(i));  
            }   
        }
        return sum;
    }
}