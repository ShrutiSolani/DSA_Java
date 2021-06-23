class SquareBitWise {
    static int square(int n)
    {
 
        // Base case
        if (n == 0){
            return 0;
        }
 
        // Handle negative number
        if (n < 0){
            n = -n;
        }
 
        // Get floor(n/2) using
        // right shift
        int x = n >> 1;
 
        // If n is odd
        
        if (n % 2 != 0){
            return ((square(x) << 2) + (x << 2) + 1);
        }
        else{

            return (square(x) << 2);
        }
    }
 
    // Driver code
    public static void main(String args[])
    {
        // Function calls
        for (int n = 1; n <= 5; n++)
            System.out.println("n = " + n
                               + " n^2 = " + square(n));
    }
}