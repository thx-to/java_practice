package PRTC;
// 백준 JAVA 입력시 public class 이름은 Main으로 바꿔서 제출, 범위는 Public class 전체
// 백준 입출력과 사칙연산

public class JAVA_241004_PRTC {
    public static void main(String[] args) {

        /*
        // 10926 ??!
        // 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다.
        // 준하는 놀람을 ??!로 표현한다.
        // 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때,
        // 놀람을 표현하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        System.out.print("ID를 입력하세요 : ");
        String id = sc.next();
        System.out.print(id + "??!");
        */

        /*
        // 18108 1998년생인 내가 태국에서는 2541년생?!
        // ICPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은
        // 눈을 믿을 수 없었다. 공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.
        // 불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다.
        // 반면, 우리나라는 서기 연도를 사용하고 있다.
        // 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num - 543);
        */

        /*
        // 10430 나머지
        // (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
        // (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
        // 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
        */

        /*
        // 2588 곱셈
        // (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때
        // (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a * (b%10));
        System.out.println(a * ((b%100)/10));
        System.out.println(a * (b/100));
        System.out.println(a * b);
        */

        /*
        // 11382 꼬마 정민
        // 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.print(a + b + c);
         */

        /*
        // 10171 고양이
        // 아래 예제와 같이 고양이를 출력하시오.
        // \    /\
        //  )  ( ')
        // (  /  )
        //  \(__)|
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
        */

        /*
        // 10172 개
        // 아래 예제와 같이 개를 출력하시오.
        // |\_/|
        // |q p|   /}
        // ( 0 )"""\
        // |"^"`    |
        // ||_/=\\__|
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
        */

        /*
        // 구구단출력
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i*j);
            }
            System.out.println();
        }
        */

        /*
        // Do it 자바프로그래밍입문 p.123
        // Q2. 구구단을 짝수 단만 출력하도록 프로그램을 만들어 보시오
        for (int i = 2; i < 10; i++) {
            if (i % 2 != 0) continue;
            for (int j = 2; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i*j);
            }
            System.out.println();
        }
        */

        /*
        // Do it 자바프로그래밍입문 p.123
        // Q3. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요.
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j <= i; j++) {

                System.out.println(i + " X " + j + " = " + i*j);
            }
            System.out.println();
        }
        */

        /*
        // Do it 자바프로그래밍입문 p.123
        // Q4. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
        //    *
        //   ***
        //  *****
        // *******

        int lineCount = 4;
        int spaceCount = lineCount/2 + 1;
        int starCount = 1;

        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            spaceCount -= 1;
            starCount += 2;
            System.out.println();
        }
        */

        /*
        // Do it 자바프로그래밍입문 p.123
        // Q4. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *

        int lineCount  = 7;
        int spaceCount = lineCount / 2 + 1;
        int starCount = 1;

        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }

            if (i < lineCount / 2) {
                spaceCount -= 1;
                starCount += 2;
            } else {
                spaceCount += 1;
                starCount -= 2;
            }
            System.out.println();
        }
        */


    }
}

