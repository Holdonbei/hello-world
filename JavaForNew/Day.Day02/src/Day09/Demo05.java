package Day09;

public class Demo05 {
    public static void main(String[] args) {
        int[]  arrayA = new int[]{1,2,3,4,5,6,7};
        int[]  arrayB = new int[]{8,9,10,11,12};
        System.arraycopy(arrayA,0,arrayB,0,3);
        for (int i = 0;i<7;i++){
            System.out.print(arrayA[i]);

        }            System.out.println();
        for (int i = 0;i<5;i ++){
            System.out.print(arrayB[i]);
        }
    }
}
