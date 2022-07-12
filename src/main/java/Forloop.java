import java.util.Scanner;

public class Forloop {
    /*
SORU 1 : Girilen sayıların toplamı 100'ü geçince daha sayı istemeyecek ve
o ana kadar kaç sayı girildiği ekrana yazdırılacak.
bu soruyu hem for-loop hemde while -do döngüsü ile yapınız.
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int count=0;
        int sum=0;
        for(int i=0;i<=100;i++){
            System.out.println("lutfen "+ (count+1)+". sayiyi girniniz");
            i+=scan.nextInt();
            count++;
            sum=i;
            if(sum>=100){
                System.out.println(" Toplam sonuc : "+sum + "\n toplam girilen sayisi : " + count);
            }
        }

    }
}
