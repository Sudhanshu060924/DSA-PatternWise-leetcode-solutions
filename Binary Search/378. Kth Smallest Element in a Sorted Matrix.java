// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix

class Solution {

    int count(int[][] arr , int m ,int n,int g){
        int row = n-1;
        int col = 0;
        int c =0;
        while(row>=0 && col<m){
            if(arr[row][col]<=g){
                c += row+1;
                col++;
            }
            else{
                row--;
            }
        }
        return c;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n =matrix.length;
        int m = matrix[0].length;
        int res =-1;

        int l = matrix[0][0];
        int h = matrix[n-1][m-1];
        while(l<=h){
            int g = (l+h)/2;
            int ans = count(matrix,m,n,g);

            if(ans<k){
                l =g+1;
            }
            else{
                res = g;
                h=g-1;
            }
        }
        return res;
        
    }
}