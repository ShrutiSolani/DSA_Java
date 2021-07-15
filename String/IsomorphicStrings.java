import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


public class IsomorphicStrings {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}
// } Driver Code Ends



class Solution
{
    //Function to check if two strings are isomorphic.
    
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        int n1 = str1.length();
        int n2 = str2.length();
        int size = 256;
        if(n1 != n2){
            return false;
        }
        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);
        int[] map = new int[size];
        Arrays.fill(map, -1);
        
        for (int i = 0; i < n1; i++)
        {
            if (map[str1.charAt(i)] == -1)
            {
                if (marked[str2.charAt(i)] == true)
                    return false;
                    
                marked[str2.charAt(i)] = true;
                map[str1.charAt(i)] = str2.charAt(i);
            }
            else if (map[str1.charAt(i)] != str2.charAt(i))
            return false;
        }
 
        return true;
        
        // Another Approach

        // HashMap<Character, Character> map = new HashMap<>();
        // HashMap<Character, Boolean> visit = new HashMap<>();

        // for(int i = 0;i < n1;i++){
        //     char c1 = str1.charAt(i);
        //     char c2 = str2.charAt(i);
        //     if(map.containsKey(c1)){
        //         if(map.get(c1) != c2){
        //             return false;
        //         }
        //     }
        //     else{
        //         if(visit.containsKey(c2)){
        //             return false;
        //         }
        //         else{
        //             map.put(c1,c2);
        //             visit.put(c2, true);
        //         }
        //     }
        // }
        // return true;
    }
}