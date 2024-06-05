public class Question2 {
    public static void printTheSequence(int a, int b, int n) {
       
        for (int i = 0; i < n; i++) {
            a = a + (int) Math.pow(2, i) * b;
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test cases
        printTheSequence(0, 2, 4); // Should print: 2 6 14 30 62 126 254 510 1022 2046
        printTheSequence(5, 3, 5);  // Should print: 8 14 26 50 98
    }
}
/*Question 2 :
Use integer a, b, n to create the following series:
(a + 20.b), (a + 20.b + 21.b), ………, (a + 20.b + 21.b + 2n-1.b)
• You are given a, b, n, print the series corresponding to the
given a, b, n values as a single line of n space-separated
integers.
• 0 <= a,b <= 50
• 1 <= n <= 15
• Examples:
o When a=0, b=2, n=10, should print: 2 6 14 30 62 126 254
510 1022 2046. Numbers in detail:
§ S0 = 0 + 1.2 = 2
§ S1 = 0 + 1.2 + 2.2 = 6
§ S2 = 0 + 1.2 + 2.2 + 4.2 = 14
§ … and so on
o When a=5, b=3, n=5, should print: 8 14 26 50 98. Numbers
in detail:
§ S0 = 5 + 1.3 = 8
§ S1 = 5 + 1.3 + 2.3 = 14
§ S2 = 5 + 1.3 + 2.3 + 4.3 = 26
§ S3 = 5 + 1.3 + 2.3 + 4.3 + 8.3 = 50
§ S4 = 5 + 1.3 + 2.3 + 4.3 + 8.3 + 16.3 = 98
Sample Java method:
public void printTheSequence(int a, int b, int n){
//write your code here
} */