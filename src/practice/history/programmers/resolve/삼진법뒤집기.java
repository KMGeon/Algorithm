package practice.history.programmers.resolve;

/**
 * https://hongjw1938.tistory.com/43
 */
public class 삼진법뒤집기 {
    public static void main(String[] args) {
        삼진법뒤집기 main = new 삼진법뒤집기();
        int n = 45;
        System.out.println(main.solution(n));
    }

    private int solution(int n) {
        int answer =0;
        String str1 = decimalToTernary(n).reverse().toString();
        return converse_ten(str1,3);
    }

    public static StringBuilder decimalToTernary(int decimal) {
        StringBuilder ternary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 3;
            ternary.insert(0, remainder);
            decimal /= 3;
        }

        return ternary;
    }
    public static int converse_ten(String number, int N){
        char[] nums = number.toCharArray(); // char의 배열로 만들어서 하나씩 숫자별로 대응
        int ans = 0; // 시작은 0으로 시작

        // 아래에서 ans를 0으로 시작하고 계속 N(기존 진법)을 곱하고 있다.
        // 이는, 앞자리의 숫자는 전체 m자리라면 m-1승 까지 곱해야 하기 때문
        // 1의 자리는 0승 곱하면 되기 때문에 0으로 시작하는 것임
        for(int i=0; i < nums.length; i++){
            // 'A'이상의 숫자, 즉 10이상의 경우에는 'A'를 빼고 10을 더하면 원래 숫자가 됨
            if(nums[i] >= 'A'){
                ans = ans * N + (nums[i] - 'A' + 10);
                // 그 이하는 단순히 '0'만 빼면 된다.
            } else {
                ans = ans * N + (nums[i] - '0');
            }
        }
        return ans;
    }
}
