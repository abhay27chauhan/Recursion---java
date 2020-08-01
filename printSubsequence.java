// get Subsequence require more storage as we increase the no. of characters in String.
// In print Subsequence we don't require to store anything.
class printSubsequence{

    public static void printss(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        printss(roq, ans + "");
        printss(roq, ans + ch);

    }

    public static void main(String[] args){
        String str = "abc";
        printss("abc", "");
    }
}