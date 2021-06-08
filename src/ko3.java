public class ko3 {
    public static void main(String[] args) {
        int[] list = {18, 0, 4, 204, 8, 4, 2, 18, 206, 1492, 42};
        System.out.println(isAllEven(list));
        int[] list2 = {2, 4, 6, 8, 10, 208, 16, 7, 92, 14};
        System.out.println(isAllEven(list2));
    }

    public static boolean isAllEven(int[] arr){
        for (int vint:arr) {
            if (vint % 2 != 0){
                return false;
            }
        }
        return true;
    }

}
