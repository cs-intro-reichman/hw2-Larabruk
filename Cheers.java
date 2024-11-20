// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int num = Integer.parseInt(args[1]);
            String UpperCaseWord = word.toUpperCase();
            String changeToAn = "AEFHILMNORSX";
            char c;

            for (int i = 0; i < word.length(); i++){
                c = UpperCaseWord.charAt(i);
                if (changeToAn.indexOf(c) == -1){
                System.out.println("Give me a " + UpperCaseWord.charAt(i) +": " + UpperCaseWord.charAt(i) + "!" );
            } else {
                System.out.println("Give me an " + UpperCaseWord.charAt(i) +": " + UpperCaseWord.charAt(i) + "!" );
            }
        }
            System.out.println("What does it spell?");
            for(int j = 0; j < num; j++){
                System.out.println(UpperCaseWord + "!!!");
            }
        }
}



