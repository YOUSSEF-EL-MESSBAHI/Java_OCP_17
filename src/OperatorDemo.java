public class OperatorDemo {
    public static void main(String[] args) {
        int a=8; //1000
        int b= a << 2; // 10000 add 2 bit in left
        int c= a >> 2;  // 10 remove 2 bit from left
        System.out.println(b);
        System.out.println(c);

//        A  |  B  |  A ^ B
//        0  |  0  |   0
//        0  |  1  |   1
//        1  |  0  |   1
//        1  |  1  |   0

        int x = 5;  // Binary: 0101
        int y = 3;  // Binary: 0011
        int result = x ^ y; // Binary: 0110 -> Decimal: 6
        System.out.println(result); // Output: 6

//        A  |  B  |  A | B
//        0  |  0  |   0
//        0  |  1  |   1
//        1  |  0  |   1
//        1  |  1  |   1

        int d = 5;  // Binary: 0101
        int e = 3;  // Binary: 0011
        int f = d | e; // Binary: 0111 -> Decimal: 7
        System.out.println(f); // Output: 7

//        A  |  B  |  A & B
//        0  |  0  |   0
//        0  |  1  |   0
//        1  |  0  |   0
//        1  |  1  |   1

        int h = 5;  // Binary: 0101
        int t = 3;  // Binary: 0011
        int w = h & t; // Binary: 0001 -> Decimal: 1
        System.out.println(w); // Output: 1

        int s = 5;

        int res = ++s + s++ + ++s;

        System.out.println("Final value of s: " + s);
        System.out.println("Result: " + res);

    }
}
