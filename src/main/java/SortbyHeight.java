import java.util.Arrays;

public class SortbyHeight {
    public static void main(String[] args) {
        /*
       Some people are standing in a row in a park. There are trees between them which cannot be moved.
        Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
        People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].  */
        int [] arr={-1, 150, 190, 170, -1, -1, 160, 180};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==(-1)){
                count++;
            }
        }
        int [] arrNew=new int [arr.length-count];
        int count3=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==(-1)){
                continue;
            }else{
                arrNew[count3]=arr[i];
                count3++;
            }
        }
        Arrays.sort(arrNew);
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==(-1)){
                continue;
            }else{
                arr[i]=arrNew[count2];
                count2++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
