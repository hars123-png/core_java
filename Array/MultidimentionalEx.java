public class MultidimentionalEx {
      public static void main(String[] args) {
        
        /*
        1 2 3
        4 5 6 */

        // int [][] matrix ={
        //     { 1, 2, 3},
        //     {4, 5, 6}
        // };

        int [][] matrix = new int [2][3];

        matrix[0][0] =1;
        matrix[0][1] =2;
        matrix[0][2] =3;

        matrix[1][0] =4;
        matrix[1][1] =5;
        matrix[1][2] =6;


// enhance for loop
        // for (int [] row: matrix){
        //     for(int value: row){
        //         System.out.print(value +" ");
        //     }
        //     System.out.println();
        // }
      int j;
      
// Manual for loop 
        for (int i =0; i< matrix.length; i++){
            System.out.println(matrix[i]); // row
            for(j= 0; j< matrix[i].length; j++){
        
                System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
}
    }
    
}
