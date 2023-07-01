package practice.programmers.lv1;

public class 내적 {
    public static void main(String[] args) {
        내적 main = new 내적();
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {-3,-1,0,2};
        System.out.println(main.solution(arr1,arr2));
    }

    private int solution(int[] arr1, int[] arr2) {
        int answer =0;
        int length = arr1.length;

        for (int i = 0; i < length; i++) {
            int i1 = arr1[i] * arr2[i];
            answer+=i1;
        }

        return answer;
    }
}
