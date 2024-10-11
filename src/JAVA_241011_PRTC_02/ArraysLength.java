package JAVA_241011_PRTC_02;

public class ArraysLength {
    public static void main(String[] args) {

        // 2행 3열의 2차원 정수형 배열 선언
        int[][] arr = new int[2][3];

        // i(첫번째 열)는 0부터 배열의 행 길이만큼 1씩 증가하면서 반복
        // arr.length는 행의 길이
        for (int i = 0; i < arr.length; i++) {

            // j(두번째 열)는 0부터 배열의 열 길이만큼 1씩 증가하면서 반복
            // arr[i].length는 열의 길이 (i행의 길이)
            for (int j = 0; j < arr[i].length; j++) {

                // 배열 출력 (1행 1열 ~ 1행 3열 / 개행 / 2행 1열 ~ 2행 3열)
                System.out.println(arr[i][j]);
            }
            // 1행, 2행 사이의 개행
            System.out.println();
        }

        // 행 길이
        System.out.println(arr.length);

        // 열 길이
        System.out.println(arr[0].length);
    }
}
