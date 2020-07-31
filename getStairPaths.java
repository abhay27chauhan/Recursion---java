import java.util.Scanner;
import java.util.ArrayList;

class getStairPaths{

    public static ArrayList<String> getStairPaths(int n){
        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);

        ArrayList<String> mpath = new ArrayList<>();

        for(String path: path1){
            mpath.add(1 + path);
        }
        for(String path: path2){
            mpath.add(2 + path);
        }
        for(String path: path3){
            mpath.add(3 + path);
        }

        return mpath;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }
}