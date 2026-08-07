package GFG;

public class extra {
    static void main(String[] args) {
        int a = 10;
        int d = 10;
        // a++ means first used a value(10) and after that incerement (11)
        // ++a means first incerement a value(11) and after that used (11)
        int b = a++ + a++ + ++a; // 10 + 11 + 13
        //     a = 10 after a++ = 11
        //     a = 11 after a++ = 12
        //     a = 12 after ++a = 13
        int c = ++d + ++d + d++;
        System.out.println(b);
        System.out.println(c);

        boolean [][] check = new boolean[2][3];



        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(check[i][j]);
            }
            System.out.println();
        }
    }
}
