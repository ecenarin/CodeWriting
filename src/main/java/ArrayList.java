import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {



        /*
Kullanıcı Q'ya basıncaya kadar gireceği isimleri alarak bir liste oluşturup
bu isimleri bir list olarak döndüren bir method yaz.*/

    listDondur();

    }

    private static java.util.ArrayList listDondur() {
        Scanner scan=new Scanner(System.in);
        List<String> arr = new java.util.ArrayList<>();
        while (true) {
            System.out.println("isim giriniz");
            String str = scan.next();
            if (str.equals("Q")) {
                break;
            } else {
                arr.add(str);
                continue;
            }

        }

        return (java.util.ArrayList) arr;
    }
    }

}


