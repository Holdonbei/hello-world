package Day02;

public class RectangleForWay {
    public static void main(String[] args) {
        method();
    }


    public static void method() {
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
