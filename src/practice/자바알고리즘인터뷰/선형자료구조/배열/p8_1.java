package practice.자바알고리즘인터뷰.선형자료구조.배열;

public class p8_1 {
    public static void main(String[] args) {
        int[] input = {1, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(p8_1.solution(input));
    }

    // 투 포인트를 이용해서 문제를 푼다. 이때 생각할 부분

    /**
      여기서 max랑 height[left]랑 빼면 비를 받을 수 있는 볼륨이 나온다.
     그래서 left, right 두개의 point를 이동하면서 각각의 max를 비교하여 만약에 높으면 이동하는 형식으로 작성
     */
    private static int solution(int[] height) {
        int volume = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];

        while (left < right) {
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);

            if (leftMax <= rightMax) {
                volume += leftMax - height[left];
                left += 1;
            }else{
                volume += rightMax - height[right];
                right -=1;
            }
        }


        return volume;
    }
}
