//package practice.etc.beak.sort;
//
//public class QuickSort {
//    public static void main(String[] args) {
//
//    }
//
//    private static void quickSort(int[] arr) {
//        quickSort(arr, 0, arr.length - 1);
//    }
//
//    private static void quickSort(int[] arr, int start, int end) {
//
//        int part2 = partition(arr, start, end); //오른쪽 방 첫번째
//        if (start < part2 - 1) { //오른쪽 파티션이 왼쪽과 1개 이상 차이가 나야지
//            quickSort(arr, start, part2 - 1);
//        }
//        if (part2 < end) {
//            quickSort(arr, part2, end);
//        }
//    }
//}
