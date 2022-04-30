package ch7;

import java.util.Scanner;
public class StandardOfJava5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Loop:
        while (true) {
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    Ex1();
                    break;
                case 2:
                    Ex2();
                    break;
                case 3:
                    Ex3();
                    break;
                case 4:
                    Ex4();
                    break;
                case 5:
                    Ex5();
                    break;

                case 6:
                    Ex6();
                    break;

                case 7:
                    Ex7();
                    break;

                case 8:
                    Ex8();
                    break;

                case 9:
                    Ex9();
                    break;

                case 10:
                    Ex10();
                    break;

                case 11:
                    Ex11();
                    break;

                case 12:
                    Ex12();
                    break;

                case 13:
                    Ex13();
                    break;



                default:
                    break Loop;
            }
        }
    }


    public static void Ex1() {
//        a. int[] arr[];
//        b. int[] arr = {1,2,3,};
//        c. int[] arr = new int[5];
//        d. int[] arr = new int[5]{1,2,3,4,5};  <-
//        e. int arr[5];
//        f. int[] arr[] = new int[3][];
    }


    public static void Ex2() {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10},
                {20, 20, 20, 20},
                {30, 30}
        };
        System.out.println(arr[3].length); // 2
    }


    public static void Ex3() {
//        배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum=" + sum);
    }


    public static void Ex4() {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };
        int total = 0;
        float average = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }

        }
        average = (float) Math.round(100 * total / (arr.length * arr[0].length)) / 100;

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    }


    public static void Ex5() {
//        다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];
        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0;
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
        for (int i = 0; i < 3; i++) {
            ball3[i] = ballArr[i];
        }


        for (int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }


    }


    public static void Ex6() {
        // 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
        int[] coinUnit = {500, 100, 50, 10};
        int money = 2680;
        System.out.println("money=" + money);
        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원: " + money / coinUnit[i]);
            money %= coinUnit[i];
        }
    }

    public static void Ex7() {
//        문제 5-6에 동전의 개수를 추가한 프로그램이다.
//        커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다.
//        보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름 돈이 부족합니다.’라고 출력하고 종료한다.
//        지불할 돈이 충분히 있으면, 거스름돈을 지불 한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다.
        Scanner sc = new Scanner(System.in);

        System.out.println("USAGE: java Exercise5_7 3120");
// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
        int money = Integer.parseInt(sc.nextLine());
        System.out.println("money=" + money);
        int[] coinUnit = {500, 100, 50, 10}; // 동전의 단위
        int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
        for (int i = 0; i < coinUnit.length; i++) {
            int coinNum = 0;
            /* (1) 아래의 로직에 맞게 코드를 작성하시오.
            1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
            2. 배열 coin에서 coinNum만큼의 동전을 뺀다.(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
            3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
            */
            coinNum = money / coinUnit[i];
            if (coinNum > 5) {
                coinNum = 5;
            }
            if (coin[i] - coinNum > 0) {
                coin[i] = 0;
                money %= (5 * coinUnit[i]);
            } else {
                coin[i] -= coinNum;
                money %= (coinNum * coinUnit[i]);
            }
            System.out.println(coinUnit[i] + "원: " + coinNum);
        }

        if (money > 0) {
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0); // 프로그램을 종료한다.
        }
        System.out.println("=남은 동전의 개수 =");
        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원:" + coin[i]);
        }
    }


    public static void Ex8() {

//        다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’ 을 찍어서 그래프를 그리는 프로그램이다.
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];

        for (int i = 0; i < answer.length; i++) {
            counter[answer[i] - 1]++;
        }
        for (int i = 0; i < counter.length; i++) {

            System.out.print(counter[i] + 1);
            for (int j = 0; j < counter[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public static void Ex9() {
//        주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.

        char[][] star = {{'*', '*', ' ', ' ', ' '},
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'}};

        char[][] result = new char[star[0].length][star.length];
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                result[j][3 - i] = star[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }


    public static void Ex10() {
        char[] abcCode =
                {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                        '(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}', ';', ':', ',', '.', '/'};

        // 0   1   2   3   4   5   6   7   8   9
        char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        String src = "abc123";
        String result = "";
        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            Loop:
            for (int j = 0; j < abcCode.length; j++) {

                if (ch < 97) {
                    for (int k = 0; k < numCode.length; k++) {
                        if (k == ch - 48) {
                            result += numCode[k];
                            break Loop;

                        }
                    }
                } else {
                    if (j == ch - 97) {
                        result += abcCode[j];
                        break Loop;
                    }
                }
            }

        }
        System.out.println("src:" + src);
        System.out.println("result:" + result);
    }


    public static void Ex11() {
//        주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열 의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다.
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };

        int[][] result = new int[score.length + 1][score[0].length + 1];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {

                result[i][j] = score[i][j];
                result[i][3] += score[i][j];
                result[5][j] += score[i][j];
                if (j + 1 == score[0].length) {
                    result[5][3] += result[i][3];
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }
    }


    public static void Ex12() {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };
        int count = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);
            String tmp = sc.nextLine();

            if (tmp.equals(words[i][1])) {
                System.out.printf("정답입니다.\n\n");
                count++;
            } else {
                System.out.printf("틀렸습니다. 정답은 %s 입니다.\n\n", words[i][1]);
            }
        }
        System.out.println("전체 " + words.length + "문제 중 " + count + "문제 맞추셨습니다.");
    }


    public static void Ex13() {
        String[] words = { "television", "computer", "mouse", "phone" };
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<words.length;i++) {
            char[] question = words[i].toCharArray(); // String을 char[]로 변환

            /* (1) 알맞은 코드를 넣어 완성하시오.
            char배열 question에 담긴 문자의 위치를 임의로 바꾼다.
             */
            for(int j = 0; j<words[i].length(); j++){
                char tmp;
                int randomIndex = (int)(Math.random()*words[i].length());
                tmp = question[j];
                question[j] = question[randomIndex];
                question[randomIndex] = tmp;

            }


            System.out.printf("Q%d. %s의 정답을 입력하세요.>",i+1, new String(question));
            String answer = scanner.nextLine();

            // trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
            if(words[i].equals(answer.trim()))
                System.out.printf("맞았습니다.%n%n");
            else
            System.out.printf("틀렸습니다.%n%n");
        }
    }
}