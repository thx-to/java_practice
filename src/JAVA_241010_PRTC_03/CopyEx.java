package JAVA_241010_PRTC_03;

public class CopyEx {
    public static void main(String[] args) {

        // 배열 기본 복사
        String[] array1 = {"김민지", "팜하니", "모다니", "강해린", "이혜인"};
        String[] array2 = {"카리나", "지젤", "윈터", "닝닝"};

        // Arrays1의 1번 인덱스를 Array2의 1번 인덱스부터 3개 요소만큼 복사
        System.arraycopy(array1, 1, array2, 1, 3);

        // 배열의 출력은 for문, 향상된 for문, Arrays.toString을 이용
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }


        // 얕은 복사
        Idol[] array3 = new Idol[3];
        Idol[] array4 = new Idol[3];

        // Array3의 인덱스 0, 1, 2 요소 넣기
        array3[0] = new Idol("IVE", "JANG WONYOUNG");
        array3[1] = new Idol("AESPA", "KARINA");
        array3[2] = new Idol("NewJeans", "PHAM HANNI");

        // Array3의 0번 인덱스를 Array4의 0번 인덱스부터 3개 요소만큼 복사
        System.arraycopy(array3, 0, array4, 0, 3);

        System.out.println("== 복사 직후 array3 ==");
        for (int i = 0; i < array3.length; i++) {
            array3[i].showIdolInfo();
        }

        System.out.println("== 복사 직후 array4 ==");
        for (int i = 0; i < array4.length; i++) {
            array4[i].showIdolInfo();
        }

        // Array3의 0번 인덱스 요소 변경
        array3[0].setGroupName("DAY6");
        array3[0].setMemberName("YOUNG K");

        System.out.println("== 변경 직후 array3 ==");
        for (int i = 0; i < array3.length; i++) {
            array3[i].showIdolInfo();
        }

        System.out.println("== 변경 직후 array4 ==");
        for (int i = 0; i < array4.length; i++) {
            array4[i].showIdolInfo();
        }


        // 깊은 복사
        Idol[] array5 = new Idol[3];
        Idol[] array6 = new Idol[3];

        // Array5의 인덱스 0, 1, 2 요소 넣기
        array5[0] = new Idol("IVE", "JANG WONYOUNG");
        array5[1] = new Idol("AESPA", "KARINA");
        array5[2] = new Idol("NewJeans", "PHAM HANNI");

        // Default 생성자로 Array6의 배열 인스턴스 생성
        array6[0] = new Idol();
        array6[1] = new Idol();
        array6[2] = new Idol();

        // Array5의 배열 요소를 새로 생성한 Array6 배열 인스턴스에 복사
        for (int i = 0; i < array5.length; i++) {
            array6[i].setGroupName(array5[i].getGroupName());
            array6[i].setMemberName(array5[i].getMemberName());
        }

        System.out.println("== 복사 직후 array5 ==");
        for (int i = 0; i < array5.length; i++) {
            array5[i].showIdolInfo();
        }

        System.out.println("== 복사 직후 array6 ==");
        for (int i = 0; i < array6.length; i++) {
            array6[i].showIdolInfo();
        }

        // Array5의 0번 인덱스 요소 변경
        array5[0].setGroupName("DAY6");
        array5[0].setMemberName("YOUNG K");

        System.out.println("== 변경 직후 array5 ==");
        for (int i = 0; i < array5.length; i++) {
            array5[i].showIdolInfo();
        }

        System.out.println("== 변경 직후 array6 ==");
        for (int i = 0; i < array6.length; i++) {
            array6[i].showIdolInfo();
        }


    }



}
