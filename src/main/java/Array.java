import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        /*
        Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir
Array olarak yazdiran bir method yazini
         */
        int []arr={5,9,12,7,6,8};
        int [] expected={3,5,7};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< expected.length;j++){
                if(arr[i]==expected[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
        int num=0;
        int [] newArray=new int[arr.length-count];
        for(int i=0;i<arr.length;i++){
            boolean skip=false;
            for(int j=0;j< expected.length;j++){
                if(arr[i]==expected[j]){
                    skip=true;
                }
            }

            if(skip==false){
                newArray[num]=arr[i];
                num++;
            }

        }
        System.out.println(Arrays.toString(newArray));
    }

}
