// abc -> --- --c -b- -bc a-- a-c ab- abc
// bc -> -- -c b- bc
import java.util.ArrayList;
class getSubsequence{

    public static ArrayList<String> gss(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();
        for(String rstr : rres){
            mres.add("" + rstr);
            mres.add(ch + rstr);
        }
        return mres;
    }

    public static void main(String[] args){
        String str = "abc";
        ArrayList<String> ss = gss(str);
        System.out.println(ss);
    }
}