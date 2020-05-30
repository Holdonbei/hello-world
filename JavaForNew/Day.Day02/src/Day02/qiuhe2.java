package Day02;

public class qiuhe2 {
    public static void main(String[] args){
        isSum();
    }
    public static void isSum(){
        int sum = 0,a;
        for(a = 1;a < 101;a++){
            sum += a;
        }
        System.out.println(sum);
    }
}
