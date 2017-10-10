public class TestRecursionInsideLoop {
    static void PrintStack(int num) {
            for(int i=0;i<num;i++) {
                System.out.println("num= " +num);
                PrintStack(num-1);
            }

   }

    public static void main(String[] args) {
        int num = 3;
        PrintStack(num);
    }
}
