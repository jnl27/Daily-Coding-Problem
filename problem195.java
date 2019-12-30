/*Let A be an N by M matrix in which every row and every column is sorted.

Given i1, j1, i2, and j2, compute the number of elements of M smaller than M[i1, j1] and larger than M[i2, j2].
*/
public class Main
{
    public static int computeNumSmallerLarger(int[][] mat, int i1, int i2, int j1, int j2){
        int totalCount = 0;
        int numSmallerthan = mat[i1][j1];
        int numLargerthan = mat[i2][j2];
        for (int i=0; i<mat.length;i++){
            for (int j=0; j<mat[0].length; j++){
                if (mat[i][j]<numSmallerthan || mat[i][j]>numLargerthan){
                    totalCount++;
                }
            }
        }
        return totalCount;
    }
	public static void main(String[] args) {
		int[][] matrix = {{1, 3, 7, 10, 15, 20},
                            {2, 6, 9, 14, 22, 25},
                             {3, 8, 10, 15, 25, 30},
                             {10, 11, 12, 23, 30, 35},
                             {20, 25, 30, 35, 40, 45}};
        System.out.println(computeNumSmallerLarger(matrix, 1, 3, 1, 3));
	}
}
