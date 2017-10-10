/*
* Finding min cost path in a matrix using plain recursion
*
* */

public class MinCostPath {
    static int sum = 0;
    static int min(int x, int y, int z) {
        if(x < y && x< z)
            return x;
        else if(y<x && y<z)
            return y;
        else
            return z;
    }
    static int minCostpath (int mat[][], int i, int j ) {
        System.out.println("i= "+i+ " ,j= "+j);
        if(i<0 || j<0)
            return Integer.MAX_VALUE;
             else if(i == 0 && j == 0)
             return mat[i][j];
                 else
                 return mat[i][j] + min(minCostpath(mat, i-1, j), minCostpath(mat, i,j-1), minCostpath(mat, i-1, j-1));

    }

    public static void main(String args[]) {
        int cost[][]= {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};
        System.out.println("min cost = " +minCostpath(cost, 2, 2));
    }
}
