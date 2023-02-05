package practice.programmers.lv1;

public class s12931 {
    public class Solution {
        public int solution(int n) {
            int answer = 0;
            String a1 = String.valueOf(n);
            char[] a2 = a1.toCharArray();
            for (int i=0;i<a2.length;i++) {
                answer+=Integer.parseInt(String.valueOf(a2[i]));
            }
            System.out.println(answer);
            return answer;
        }
    }
}
