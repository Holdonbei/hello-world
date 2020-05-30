package Day02;

public class IsSame {
    public static void main(String[] args){
    System.out.println(isSame(11,12));
        System.out.println(isSame((byte)11,(byte)12));
        System.out.println(isSame((short)11,(short)12));
        System.out.println(isSame((long)11,(long)12));
    }
    public static boolean isSame(byte a, byte b){
        System.out.println("byte类型的方法被成功调用啦！");
        boolean same;
        if (a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }
    public static boolean isSame(short a, short b){
        System.out.println("short类型的方法被成功调用啦！");
        if (a == b){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isSame(int a, int b){
        System.out.println("int类型的方法被成功调用啦！");
        boolean same = a == b ? true: false;
        return same;
    }
    public static boolean isSame(long a, long b){
        System.out.println("long类型的方法被成功调用啦！");
        return a == b;
    }


}
