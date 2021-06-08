public class ko1 {
    public static void main(String[] args) {
        int i = 7 , j = 4;
        char c1 = 'a',c2 = 'B';
        double d1 = 6.0,d2 = 3.0;
        String s1 = "veni",s2= "vidi",s3 = "vici";

        int ji = j % i;
        System.out.println("j%i = "+ ji);

        double jd1 = j + d1;
        System.out.println("j+d1 = "+jd1);


        double d1d2 = d1 + (int) d2;
        System.out.println("d1 + (int)d2 = "+d1d2);

        boolean id2jd1 = i + d2 < j + d1;
        System.out.println("i + d2 < j + d1 = "+id2jd1);


        boolean ij1 = i-- != ++j + 1;
        System.out.println("i-- != ++j + 1 = "+ ij1);

        int c21 = c2 + 1;
        System.out.println("c2 + 1 = "+ c21);

        boolean c1c2 = c1 < c2;
        System.out.println("c1 < c2 = "+ c1c2);

        boolean c110 = c1 - '1' == '0';
        System.out.println("c1 - '1' == '0'"+ c110);


        String s1c11 = s1 + (c1 + 1);
        System.out.println("s1 + (c1 + 1) = "+ s1c11);

        String _1c2s2 = '1' + c2 + "" + s2;
        System.out.println("'1' + c2 + '' + s2 = "+_1c2s2);

        System.out.println( "s3 + \"c1\" = " +(s3 + "c1"));

        System.out.println(s2.charAt(1) == s3.charAt(3));

        System.out.println("s3.charAt(2)+1.0 ==s2.charAt(2) =" +(s3.charAt(2)+1.0 == s2.charAt(2)));

    }
}