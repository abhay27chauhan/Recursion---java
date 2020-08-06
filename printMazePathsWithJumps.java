// level option Style -> print
// faith expectation style -> get
import java.util.Scanner;
class printMazePathsWithJumps{

    public static void printMazePathsWithJumps(int sr, int sc, int dr, int dc, String path){
        if(sc==dc && sr==dr){
            System.out.print(path + " ");
            return;
        }

        for(int ms=1; ms<=dc-sc; ms++){
            printMazePathsWithJumps(sr, sc+ms, dr, dc, path + "h" + ms);
        }

        for(int ms=1; ms<=dr-sr; ms++){
            printMazePathsWithJumps(sr+ms, sc, dr,dc,path + "v" + ms );
        }

        for(int ms=1; ms<=dr-sr && ms<=dc-sc; ms++){
            printMazePathsWithJumps(sr+ms, sc+ms, dr,dc,path + "d" + ms );
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("No. of rows: ");
        int n = scn.nextInt();
        System.out.print("No. of cols: ");
        int m = scn.nextInt();
        printMazePathsWithJumps(1,1,n,m, "");
        System.out.println();
    }
}