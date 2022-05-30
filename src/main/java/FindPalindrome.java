import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindPalindrome {
    public static void main(String[] args) {
        //    Given the string, check if it is a palindrome.
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        ifPalindrome(word);

    }
   static boolean ifPalindrome(String inputString) {
        boolean solution=false;
        String [] arr=inputString.split("");
        List<String> list= new ArrayList<String>();
        list= Arrays.asList(arr);
        int k=0;
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i).equals(list.get(k))){
                solution=true;
                k++;
            }else{
                solution=false;
                break;
            }
        }
        return solution;
    }

}
