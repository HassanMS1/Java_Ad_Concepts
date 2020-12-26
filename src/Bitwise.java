public class Bitwise {
    public static void main(String[] args) {
        System.out.println(8 & 5 ); // adds the binary sequence in truth table 1 + 0 = 0 , 1 + 1 = 1
        System.out.println( 2 | 3 ); // 1 or 0  = 1
        System.out.println(~1); // flips a 32 bit signed (two complent) number : 1111 11111 1111 1111

        // Integer to binary

        int number = 2 ;
        String binary = Integer.toBinaryString(number);
        Long fraction = Double.doubleToRawLongBits(3.103125);
        String binaryDes = fraction.toBinaryString(fraction);
        System.out.println("The integer " + number +" in binary is "+binary );
        System.out.println("The double " + fraction +" in binary is "+binaryDes );
    }
}
