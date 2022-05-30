import java.util.Scanner;

public class ReturnCentury {
    //Given a year, return the century it is in. The first century spans from the year
    // 1 up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please input YYYY type years");
        int years= scan.nextInt();
        solution(years);
    }
    public static  int solution(int year) {
        int solution=0;
        int x=year/100;
        int y=year%100;
        if(y>0){
            x+=1;
            solution=x;
        }else{
            solution=x;
        }
        return solution;
    }
}


