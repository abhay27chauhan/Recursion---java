import java.util.ArrayList;
import java.util.Scanner;
class getMazePathWithJumps{

    public static ArrayList<String> gmpwj(int sr, int sc, int dr, int dc){
        if(sc==dc && sr==dr){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> mpath = new ArrayList<>();
        for(int ms=1; ms<=dc-sc; ms++){
            ArrayList<String> hpaths = gmpwj(sr, sc+ms, dr, dc);
            for(String path: hpaths){
                mpath.add("h" + ms + path);
            }
        }

        for(int ms=1; ms<=dr-sr; ms++){
            ArrayList<String> vpaths = gmpwj(sr+ms, sc, dr, dc);
            for(String path: vpaths){
                mpath.add("v" + ms + path);
            }
        }

        for(int ms=1; ms<=dc-sc && ms<=dr-sr; ms++){
            ArrayList<String> dpaths = gmpwj(sr+ms, sc+ms, dr,dc);
            for(String path: dpaths){
                mpath.add("d" + ms + path);
            }
        }

        return mpath;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("No. of rows: ");
        int n = scn.nextInt();
        System.out.print("No. of cols: ");
        int m = scn.nextInt();
        ArrayList<String> paths = gmpwj(1,1,n,m);
        System.out.println(paths);
    }
}