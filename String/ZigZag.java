class Solution {
    public String convert(String s, int numRows) {
        if(numRows <= 1 || numRows >= s.length()){
            return s;
        }
        int count = 0;
        char dir = 'D';
        int row = 0;
        ArrayList<ArrayList<Character>> a = new ArrayList<ArrayList<Character>>();
        StringBuilder s2 = new StringBuilder();
        while(count < s.length()){
            try{
                a.get(row).add(s.charAt(count)); 
                System.out.println(a.get(row));
                System.out.println("new row - " + s.charAt(count));
            }
            catch(Exception e){
                ArrayList<Character> b = new ArrayList<Character>();
                b.add(s.charAt(count));
                a.add(b);
                System.out.println("new char - " + s.charAt(count));
            }
            
           
            if(dir == 'D'){
                row += 1;
            }
            else{
                row -= 1;
            }
            
             if(row == numRows - 1){
                dir = 'U';
            }
            if(row == 0){
                dir = 'D';
            }
            count++;
        }
        for(List<Character> innerList : a) {
            for(Character letter : innerList) {
                System.out.println(letter);
                s2.append(letter);
            }
        }
        return s2.toString();
    }
}
