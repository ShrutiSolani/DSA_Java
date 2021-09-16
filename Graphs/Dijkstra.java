class Solution
{
    //Function to find the shortest distance of all the vertices
    //Function to find the vertex with minimum distance value, from the set
    //of vertices not yet included in shortest path tree.
    int minDistance( int dist[], boolean sptSet[],int V)
    {
        //initializing minimum value.
        int min = Integer.MAX_VALUE, min_index = 0;
        
        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min){
                min = dist[v]; min_index = v;
            }
        
        return min_index;
    }
    
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    int[] dijkstra(int V,  ArrayList<ArrayList<ArrayList<Integer>>> adj,int S) 
    {
        
        //creating Adjacency matrix from Adjacency list.
        int [][]adj_mat = new int[V][V];
        
        for(int i=0; i<V; i++)
            for(int j=0; j<adj.get(i).size(); j++)
                adj_mat[i][adj.get(i).get(j).get(0)] = adj.get(i).get(j).get(1);
        
        //dist[] is output list. dist[i] will hold the 
        //shortest distance from source to i.
        int[] dist = new int[V];
    
        //sptSet[i] will true if vertex i is included in shortest
        //path tree or shortest distance from src to i is finalized.
        boolean[] sptSet = new boolean[V];
        
        //initializing all distances as INFINITE and stpSet[] as false.
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
        
        //distance of source vertex from itself is always 0.
        dist[S] = 0;
        
        //iterating over all vertices.
        for (int count = 0; count < V-1; count++)
        {
            //picking the minimum distance vertex from the set of vertices
            //not yet processed and marking the picked vertex as processed.
            int u = minDistance(dist, sptSet,V);
            sptSet[u] = true;

            //updating dist[] value of adjacent vertices of the picked vertex.
            for (int v = 0; v < V; v++)
            {
                //updating dist[v] only if it's not in sptSet, there is an
                //edge from u to v, and total weight of path from source to
                //v through u is smaller than current value of dist[v].
                if (!sptSet[v] && adj_mat[u][v] !=0 && dist[u] != Integer.MAX_VALUE 
                                            && dist[u]+adj_mat[u][v] < dist[v])
                    dist[v] = dist[u] + adj_mat[u][v];
            }
        }
        //returning the list.
        return dist;
    }
};
