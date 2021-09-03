import java.util.*;

class Solution {
    public boolean isRotation(String str, String str2){
        if(str.length() != str2.length()){
            return false;
        }
        str = str+str;
        return str.contains(str2);
    }

    public int solve(String[] words) {
        ArrayList<String> list = new ArrayList<String>();
        int count = 0;
        boolean flag = false;
        for(int i = 0;i < words.length; i++){
            for(int j = 0;j < list.size(); j++){
                if(isRotation(words[i], list.get(j))){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                list.add(words[i]);
                count++;
            }
            flag = false;
        }
        return list.size();
    }
}
