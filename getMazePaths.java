import java.util.Scanner;
import java.util.ArrayList;

class getMazePaths{

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hpath = new ArrayList<>();
        ArrayList<String> vpath = new ArrayList<>();

        if(sc<dc){
            hpath = getMazePaths(sr, sc+1, dr, dc);
        }
        if(sr<dr){
            vpath = getMazePaths(sr+1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();

        for(String path: hpath){
            paths.add('h' + path);
        }

        for(String path: vpath){
            paths.add('v' + path);
        }

        return paths;
        
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("No. of rows: ");
        int n = scn.nextInt();
        System.out.print("No. of columns: ");
        int m = scn.nextInt();
        ArrayList<String> paths = getMazePaths(1,1,n,m);
        System.out.println(paths);
    }
}