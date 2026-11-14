package src.heap;

import java.util.*;

class Triplate implements Comparable<Triplate>{
    int dist;
    int x;
    int y;

    Triplate(int dist, int x, int y){
        this.dist = dist;
        this.x = x;
        this.y = y;
    }

    public int compareTo(Triplate t){
        return this.dist - t.dist;
    }
}

public class kth_closest {
    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int k = 2;
        System.out.println(k_smallest(arr, k));
    }

    public static int[][] k_smallest(int[][] points, int k){
        PriorityQueue<Triplate> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int[] point : points){
            int x = point[0], y = point[1];
            int dist = x*x + y*y;
            pq.add(new Triplate(dist, x, y));
            if(pq.size()>k) pq.remove();
        }
        int[][] ans = new int[k][2];
        for(int i = 0; i<k; i++){
            Triplate top = pq.remove();
            ans[i][0] = top.x;
            ans[i][1] = top.y;
        }
        return ans;
    }
}
