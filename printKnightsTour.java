class printKnightsTour{

    public static void display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }

    public static void printKnightsTour(int[][] chess, int row, int col, int move){
        if(row<0 || col<0 || row>=chess.length || col>= chess[0].length || chess[row][col] > 0){
            return;
        }else if(move == chess.length*chess.length){
            chess[row][col] = move;
            display(chess);
            chess[row][col] = 0;
            System.out.println();
            return;
        }
        
        chess[row][col] = move;
        printKnightsTour(chess, row-2, col+1, move+1);
        printKnightsTour(chess, row-1, col+2, move+1);
        printKnightsTour(chess, row+1, col+2, move+1);
        printKnightsTour(chess, row+2, col+1, move+1);
        printKnightsTour(chess, row+2, col-1, move+1);
        printKnightsTour(chess, row+1, col-2, move+1);
        printKnightsTour(chess, row-1, col-2, move+1);
        printKnightsTour(chess, row-2, col-1, move+1);
        chess[row][col] = 0;
    }

    public static void main(String[] args){
        int[][] chess = {{0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0}
                        };

        printKnightsTour(chess, 2, 2, 1);
    }
}