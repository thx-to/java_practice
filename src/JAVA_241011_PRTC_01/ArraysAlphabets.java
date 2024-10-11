package JAVA_241011_PRTC_01;

public class ArraysAlphabets {
    public static void main(String[] args) {

        // 13행 2열의 2차원 문자 자료형 배열 선언
        char[][] alphabets = new char[13][2];

        // 문자는 알파벳 소문자로 (ASCII)
        char ch = 'a';

        // i(첫번째 열)는 0부터 배열의 행 길이만큼 1씩 증가하면서 반복
        // arr.length는 행의 길이
        for (int i = 0; i < alphabets.length; i++) {

            // j(두번째 열)는 0부터 배열의 열 길이만큼 1씩 증가하면서 반복
            // arr[i].length는 열의 길이 (i행의 길이)
            for (int j = 0; j < alphabets[i].length; j++) {

                // 배열 [i][j]는 ch 변수로 선언 (카운팅)
                alphabets[i][j] = ch;

                // 공백을 기준으로 출력
                System.out.print(alphabets[i][j] + " ");

                // 카운팅 증가
                ch++;
            }

            // 2열씩 개행
            System.out.println();

        }
    }
}
