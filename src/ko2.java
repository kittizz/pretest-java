public class ko2 {
    public static void main(String[] args) {
        System.out.println(param3(3,2,1));
    }
    static public int param3(int x ,int y ,int z){
        if (x < y ){
            if (x < z){
                return  x;
            }
        }
        if (y < x){
            if (y < z){
                return  y;
            }
        }
        return z;
    }
}
