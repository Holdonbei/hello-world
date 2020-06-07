package Day12;

public class Demo01 {
    public static void main(String[] args) {
        int[] arrayA = new int[10];
        arrayA = null;
        //for (int i = 0; i < 10; i++) {
        //    arrayA[i] = i + 1;
         //   System.out.println(arrayA[i]);
       // }
        System.out.println("===============");
        int a = getElement(arrayA, 10);
        System.out.println(a);
    }


    public static int getElement(int[] array, int index) {//传入数据以及索引，方法功能为获取该索引号数组对应的元素
        if (array == null) {//空指针异常处理
            throw new NullPointerException("空指针异常");
        }
        if (index < 0 || index > array.length - 1) {
            throw new IndexOutOfBoundsException("数组越界异常");
        }
        int i = array[index];
        return i;
    }
}
