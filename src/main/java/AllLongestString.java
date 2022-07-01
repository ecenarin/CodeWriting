public class AllLongestString {
    public static void main(String[] args) {

    }
    String[] solution(String[] inputArray) {
        int size=0;
        int k=0;
        for(int i=0;i<inputArray.length;i++){
            size=inputArray[i].length();
            if(k<size){
                k=size;
            }
        }
        int sum=0;
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i].length()==k){
                sum++;
            }
        }
        String [] str= new String[sum];
        int count=0;
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i].length()==k){
                str[count]=inputArray[i];
                count++;
            }
        }
        return str;
    }
}
