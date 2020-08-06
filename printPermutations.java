class printPermutations{

    public static void printPermutations(String ques, String asf ){
        if(ques.length() == 0){
            System.out.print(asf + " ");
            return;
        }

        for(int i=0; i<ques.length(); i++){
            char ch = ques.charAt(i);
            String lros = ques.substring(0,i);
            String rros = ques.substring(i+1);

            String str = lros +rros;
            printPermutations(str, asf + ch);
        }
    }
    
    public static void main(String[] args){
        printPermutations("abc", "");
        System.out.println();
    }
}