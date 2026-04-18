public class jaggedArrayExample {
    public static void main(String[] args) {
        // 10 20 30
        // 40 50
        // 60 70 80 90

        int [][] arr = new int [3][];
        arr[0] = new int[3];
        arr[1] = new int [2];
        arr[2] = new int [4];

        arr[0][1] = 10;
        arr[0][2] = 20;
        arr[0][3] = 30;

          arr[1][0] = 40;
          arr[1][1] = 50;

          arr[2][0] = 60;
          arr[2][1] = 70;
          arr[2][2] = 80;
          arr[2][3] = 90;

// second way to write array

        //   int[][] arr1 ={
        //     {10, 20 ,30}, 
        //     {40, 50,},
        //     {60, 70 ,80,90}
        //   };
        int j;
        for (int i =0; i< arr.length; i++){
            System.out.println(arr[i]); // row
            for(j= 0; j< arr[i].length; j++){
        
                System.out.print(arr[i][j] + " ");
        }
        System.out.println();
}
    }

    }
    

