class printKPC{

    static String[] codes ={".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKPC(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        String codesforch = codes[ch - '0'];
        for(int i=0; i<codesforch.length(); i++){
            char cho = codesforch.charAt(i);
            printKPC(roq, ans + cho);
        }
    }

    public static void main(String[] args){
        String str = "678";
        printKPC("678", "");
    }
}