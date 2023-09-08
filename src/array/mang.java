//package array;
//
//import java.sql.SQLOutput;
//import java.util.Arrays;
//
//public class mang {
//    public static void main(String[] args) {
//        int[] arr = new int[5];
//        int size = 0;
//        size = push(arr,5,size);
//        size = push(arr,10,size);
//        size = push(arr,15,size);
//        size = push(arr,20,size);
//        System.out.println(Arrays.toString(arr));
////        System.out.println("vị trí phần tử cần tìm là: "+search(arr,10,size));
//        size = delete(arr,10,size);
//        System.out.println("mảng cần xóa là: "+ Arrays.toString(arr));
//        System.out.println("size: " + size);
//
//
//    }
//    public static int push(int[] arr, int element, int size) {
//        arr[size] = element;
//        size++;
//        return size;
//    }
//    public static int search(int[]arr, int element, int size) {
//        for (int i = 0; i < size; i++) {
//            if (arr[i] == element) {
//                return i;
//            }
//
//        }
//        return -1;
//
//    }
//    public static int delete(int[]arr, int element, int size){
//        int index = search(arr, element, size);
//        for (int i = index; i < size ; i++) {
//            arr[i] = arr[i+1];
//
//        }
//        size--;
//        return size;
//    }

    // bài 1
//    public static void main(String[] args) {
//        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
//        int size = 6;
//        System.out.println(Arrays.toString(array));
//        System.out.println("vị trí phần tử cần tìm là: " + search(array, 7, size));
//        size = delete(array,7,size);
//        System.out.println("mảng cần xóa là: "+ Arrays.toString(array));
//       System.out.println("size: " + size);
//    }
//
//    public static int search(int[] array, int element, int size) {
//        for (int i = 0; i < size; i++) {
//            if (array[i] == element) {
//                return i;
//            }
//
//        }
//        return -1;
//
//
//    }
//    public static int delete(int[]array, int element, int size){
//        int index = search(array, element, size);
//        for (int i = index; i < size ; i++) {
//           array[i] = array[i+1];
//       }
//        size--;
//        return size;
//    }



//}
