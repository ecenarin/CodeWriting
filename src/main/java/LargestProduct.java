public class LargestProduct {
    public static void main(String[] args) {
        //Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

    }
   static int solution(int[] inputArray) {
        int result=Integer.MIN_VALUE;
        int k=0;
        for(int i=0;i<inputArray.length-1;i++){
            if(inputArray[i]*(inputArray[k+1])>result){
                result=(inputArray[i]*(inputArray[i+1]));
            }
            k++;
        }
        return result;
    }
}
