import java.util.ArrayList;
class getPermutations{

    public static ArrayList<String> getPermutations(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> mres = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String lros = str.substring(0, i);
            String rros = str.substring(i+1);

            String ros = lros +rros;

            ArrayList<String> rres = getPermutations(ros);
            for(String rstr : rres){
                mres.add(rstr + ch);
            }
        }
        return mres;
    }

    public static void main(String[] args){
        ArrayList<String> res = getPermutations("abc");
        System.out.println(res);
    }
}