class Solution
{
    static List<List<Integer>> combinationSum(int A[], int N, int B) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        // sort the provided array
        Arrays.sort(A);
        
        // call bactracking method for finding all the possible combinations
        getCombinations(A, N, B, resultList, temp, 0);
        
        return resultList;
    }
    
    static void getCombinations(int[] arr, int n, int sum, List<List<Integer>> resultList, 
        List<Integer> temp, int index) {
        if (sum == 0) {
            resultList.add(new ArrayList(temp));
            return;
        }
        
        for (int i = index; i < n; i++) {
            if (i != index && arr[i] == arr[i-1]) {
                continue;
            }
            
            if (arr[i] > sum) {
                break;
            }

            temp.add(arr[i]);
            getCombinations(arr, n, sum - arr[i], resultList, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
