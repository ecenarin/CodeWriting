public class Solution {
    public static void main(String[] args) {

    }
    String[] solution(String[] inputArray) {

        int length = 0;
        int count = 0;

        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i].length() > length) {
                length = inputArray[i].length();
                count = 1;
            } else if (inputArray[i].length() == length) {
                count++;
            }
        }

        String[] resultArray = new String[count];
        int resultIndex = 0;
        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i].length() == length) {
                resultArray[resultIndex] = inputArray[i];
                resultIndex++;
            }
        }
        return resultArray;
    }

}
