//check whether a string is palindrome or not

import java.io.DataInputStream;
public class stringpalindromeornot {
    @SuppressWarnings("deprecation")
    public static void main(String ar[]){
        DataInputStream in=new DataInputStream(System.in);
        String word,rev="";
        try {
            System.out.println("enter the string :");
            word=in.readLine();
            for(int i=word.length()-1;i>=0;i--){
                rev=rev+word.charAt(i);
            }
            if (!rev.equals(word)) {
                System.out.println("The string is not palindrome..");
            }else{
                System.out.println("The string is a palindrome...");
            }
        } catch (Exception e) {
        }
    }
}

