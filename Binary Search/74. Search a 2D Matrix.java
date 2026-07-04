// https://leetcode.com/problems/search-a-2d-matrix?listId=552y65ke&page=1

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int l=0;
        int h = (m*n)-1;

        while(l<=h){
            int g = (l+h)/2;
            int row = g/n;
            int col = g%n;

            if(matrix[row][col]==target) {
                return true;
            }
            if(matrix[row][col]<target) {
                l=g+1;
            }
            else {
                h=g-1;
            }}
        return false;   

    }
}