import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LuyenTapMang {
    public static void main(String[] args) {
        ArrayX();
    }

//    private static void RunningX() {
//        try {
//            ArrayX();
//        } catch (InputMismatchException e ) {
//            System.out.println("Lỗi kiểu dữ liệu. Thử lại");
//             RunningX();
//        } catch (Exception e) {
//            System.out.println("Có lỗi xảy ra thử lại:");
//            RunningX();
//        }
//    }

    private static void ArrayX() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int length = scanner.nextInt();
        int arr[] = new int[length];

        System.out.println("Nhập vào các phần tử của mảng (số nguyên): ");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        int lastValueArr = arr[arr.length - 1];
        System.out.println("Mảng sau khi nhập: " + Arrays.toString(arr));

        System.out.println("Nhập vị trí cần thay đổi (Từ 2 tới nhỏ hơn độ dài mảng - 1 (Length - 1): ");
        int index = scanner.nextInt();
        if (index <= 1  || index >= arr.length ) {
            System.out.println("Không chèn được phần tử vào mảng.");
            ArrayX();
        }
        System.out.println("Nhập giá trị cần thay đổi ở vị trí " + index);
        int value = scanner.nextInt();


        for (int k = 1 ; k < arr.length; k++) {
            if (arr[arr.length - k] == arr[index] ) {
                       break;
            }
            arr[arr.length - k] = arr[arr.length - (k+1)];
        }
        arr[index] = value;

        int newArr[] = new int[arr.length + 1];
        for (int h = 0 ; h < newArr.length ; h++) {
            if(h < (newArr.length-1)) {
                newArr[h] = arr[h];
            }
            if(h == (newArr.length - 1)) {
                newArr[h] = lastValueArr;
            }
        }

        System.out.printf("Mảng sau khi thay đổi: " + Arrays.toString(newArr));
    }
}

