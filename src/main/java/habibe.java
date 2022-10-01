public class habibe {
    public static void main(String[] args) {
        /*
        Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
elemanlarin toplamini ekrana yazdiran bir program yaziniz.
(Zor soru) arr1 = { {1,2},{3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

         */
       int [][] arr1 = { {1,2},{3,4,5}, {6} };
        int [][] arr2 = { {7,8,9}, {10,11}, {12} };
        int sum1=0;
        for(int i=0;i< arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                sum1+=arr2[i][j];
            }
        }
        int sum2=0;
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                sum2+=arr1[i][j];
            }
        }
        int totalSum=sum1+sum2;
        System.out.println("total result : " + totalSum);
    }
}
