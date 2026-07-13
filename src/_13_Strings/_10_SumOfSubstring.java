package _13_Strings;

public class _10_SumOfSubstring {
    public static void main(String[] args) {
        String s = "123";
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int number = 0;
            for (int j = i; j < s.length(); j++) {
                number = number * 10 + (s.charAt(j) - '0');
                sum += number;
            }
        }
        System.out.println(sum);
    }
}

