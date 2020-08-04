import java.util.Scanner;
class printMazePaths{

    public static void printMazePaths(int sr, int sc, int dr, int dc, String path){
        if(sc>dc || sr>dr){
            return;
        }
        if(sc==dc && sr==dr){
            System.out.print(path + " ");
            return;
        }

        printMazePaths(sr,sc+1,dr,dc, path+ "h");
        printMazePaths(sr+1,sc,dr,dc, path+"v");
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("No. of rows: ");
        int n = scn.nextInt();
        System.out.print("No. of columns: ");
        int m = scn.nextInt();
        printMazePaths(1,1,n,m, "");
        System.out.println();
    }
}