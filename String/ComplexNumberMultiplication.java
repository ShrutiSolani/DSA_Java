class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        
        String[] a = num1.split("\\+|i");
        String[] b = num2.split("\\+|i");
//         (x+yi)*(p+qi) = (x*p - y*q) + (x*q + y*p)i 
//         x = a[0]
//         y = a[1]
//         p = b[0]
//         q = b[1]
        int x = (Integer.parseInt(a[0])*Integer.parseInt(b[0])) - (Integer.parseInt(a[1])*Integer.parseInt(b[1]));
        int y = (Integer.parseInt(a[0])*Integer.parseInt(b[1])) + (Integer.parseInt(a[1])*Integer.parseInt(b[0]));
        String str = Integer.toString(x)+"+"+Integer.toString(y)+"i";
        return str;
    }
}
