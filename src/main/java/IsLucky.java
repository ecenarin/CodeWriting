public class IsLucky {

    boolean solution(int n) {

        String[] list=String.valueOf(n).split("");
        int sum=0;
        for(int i=0;i<list.length/2;i++){
            sum+=Integer.parseInt(list[i]);
        }
        int sum1=0;
        for(int i=list.length/2;i<list.length;i++){
            sum1+=Integer.parseInt(list[i]);
        }

        if(sum==sum1){
            return true;
        }else{
            return false;
        }
    }
}
