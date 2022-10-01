public class RomansNum {
    public static void main(String[] args) {
        int total=romanToInt("LVIII");
        System.out.println(total);
    }
    public static int romanToInt(String s) {
        int total=0;
        for (int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case('I'):
                    if(i!=(s.length()-1)&& s.charAt(i+1)=='V' ){
                        total+=4;
                        i++;
                    }else{
                        total+=1;
                    }
                    continue;
                case('V'):
                    total+=5;
                    continue;
                case('X'):
                    if(i!=(s.length()-1)&&s.charAt(i+1)=='C'){
                        total+=90;
                        i++;
                    }else{
                        total+=100;
                    }
                    continue;
                case('L'):
                    total+=50;
                    continue;
                case('C'):
                    if(i!=(s.length()-1)&&s.charAt(i+1)=='M'){
                        total+=900;
                        i++;
                    }else{
                        total+=100;
                    }
                    continue;
                case('D'):
                    total+=500;
                    continue;
                case('M'):
                    total+=1000;
                    continue;
            }
        }
        return total;
    }
}
