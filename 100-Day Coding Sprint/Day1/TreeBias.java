/*
Ram was learning the tree data structure when John saw him. Seeing Ram John challenged him to calculate the bias of the tree.
The bias was defined as the sum of the depths of all tree nodes.
Given a tree help Ram in finding the bias of the tree. Consider node with value 1 as the root of the tree
And consider the depth of the root node as 0.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class TreeBias {
    static int sum = 0;

    static void dfs(ArrayList<Integer>[] tree, int depth, int node, int parent){
        sum += depth;
        for(int i = 0;i < tree[node].size();i++){
            if(tree[node].get(i) != parent){
                dfs(tree, depth+1, tree[node].get(i), node);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>[] tree = new ArrayList[n+1];
        for(int i = 0;i < n+1;i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            tree[i] = temp;
        }

        for(int i = 0;i < n-1;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            tree[a].add(b);
            tree[b].add(a);
        }

        dfs(tree, 0, 1, -1);
        System.out.println(sum);
    }
}
