package Array.TwoDArray;

public class SetZeroes {

    public static void setZeroes(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;

        boolean col[] = new boolean[m];
        boolean row[] = new boolean[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(mat[i][j]==0){
                    col[j] = true;
                    row[i] = true;
                }
            }
        }
        //set row to zero
        for(int i=0;i<n;i++){
            if(row[i]){
                for(int j=0;j<m;j++){
                    mat[i][j] = 0;
                }
            }
        }

        // Step 3: Set columns to zero
        for (int j = 0; j < m; j++) {
            if (col[j]) {
                for (int i = 0; i < n; i++) {
                    mat[i][j] = 0;
                }
            }
        }
    }
}
