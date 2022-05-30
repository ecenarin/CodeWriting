import java.util.Arrays;

public class statuesDifferentSize {
    public static void main(String[] args) {
        /*
        Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size.
        Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous
        one exactly by 1. He may need some additional statues to be
        able to accomplish that. Help him figure out the minimum number of additional statues needed.
         */
        //u can create an array for testing if it works or not
    }
   static int solution(int[] statues) {
        int count=0;

        Arrays.sort(statues);
        int k=statues[0];
        for(int i=0;i<statues.length;i++){
            if(statues[i]!=k){
                count++;
                i--;
            }
            k++;

        }
        return count;
    }
}
