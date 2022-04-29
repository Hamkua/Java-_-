import java.util.Scanner;
public class StandardOfJava4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Loop : while(true) {
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

                case 14:
                    Ex14();
                    break;

                case 15:
                    Ex15();
                    break;

                default:
                    break Loop;
            }
        }
    }

    public static void Ex1(){
//        1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 == if((10<x)&&(x<20))
//        2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식 == if(ch == ' ')
//        3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식 == if((ch == 'x')||(ch == 'X'))
//        4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식 == if('0' <= ch) && (ch <= '9'))
//        5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식 == if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
//        6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
//        않을 때 true인 조건식 == if((year%400==0)||(year%4==0)&&(year%100!=100))
//        7. boolean형 변수 powerOn가 false일 때 true인 조건식 == if(!powerOn)
//        8. 문자열 참조변수 str이 “yes”일 때 true인 조건식 == if(str.equals("yes")
    }

    public static void Ex2(){
        // 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
        int result = 0;
        for(int i = 1; i<=20; i++){
            if((i%2!=0)&&(i%3!=0)){
                result += i;
                System.out.println(i);
            }
        }
        System.out.println(result);
    }


    public static void Ex3(){
        // 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
        int result = 0;
        for(int i = 1; i<=10; i++){
            int temp = result;
            result = temp + i;
        }
        System.out.println(result);
    }

    public static void Ex4(){
        // 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
        int i = 1;
        int sum = 0;
        while(true){
            if(i%2 == 0){
                sum += -i;
            } else{
                sum += i;
            }
            if(sum >= 100){
                System.out.println(i);
                break;
            }
            i++;
        }
    }

    public static void Ex5(){
        // 다음의 for문을 while문으로 변경하시오.
        // public class Exercise4_5 {
        //   public static void main(String[] args) {
        //     for(int i=0; i<=10; i++) {
        //       for(int j=0; j<=i; j++)
        //         System.out.print("*");
        //       System.out.println();
        //     }
        //   } end of main
        // } end of class

        int i = 0;
        int j = 0;
        while(i<=10){
            while(j<=i){
                System.out.print("*");
                j++;
            }
            j = 0;
            System.out.println();
            i++;
        }
    }

    public static void Ex6(){
//        두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프 로그램을 작성하시오.
        for(int i = 1; i<=6; i++){
            for(int j = 1; j<=6; j++){
                if(i + j == 6){
                    System.out.println("주사위 1: " + i + ", 주사위 2: " + j);
                }
            }
        }
    }

    public static void Ex7() {
//        Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.
        int value = (int)(Math.random()*6) + 1;
        System.out.println("value:"+value);
    }

    public static void Ex8() {
//        방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
        for(int x=0; x<=10; x++){
            for(int y=0; y<=10; y++){
                if(2*x + 4*y == 10){
                    System.out.println("x=" + x + ", y=" + y);
                }
            }
        }
    }

    public static void Ex9() {
//        숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코 드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되 어야 한다.
        String str = "12345";
        int sum = 0;

        for(int i=0; i < str.length(); i++) {
            sum += (int)(str.charAt(i)) - 48;
        }
        System.out.println("sum="+sum);
    }


    public static void Ex10() {
//        문자열로 변환하지 말고 숫자로만 처리해야 한다.
        int num = 12345;
        int sum = 0;
        int i = 10000;

        while(true){
            if(i<1){
                break;
            }
            sum += num/i;
            num %= i;
            i/=10;
        }
        System.out.println("sum="+sum);
    }

    public static void Ex11() {
//        피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가 는 수열이다.
//        예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고
//        그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다.
//        1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
        int num1 = 1;
        int num2 = 1;
        int num3=0; //세번째값
        System.out.print(num1+","+num2);
        for (int i = 0 ; i < 8 ; i++ ) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print("," + num3);
        }
    }

    public static void Ex12() {
        for(int i = 1; i<=3; i++){
            int tmp = 3*i -1;
            for(int j = 1; j<=3; j++){

                for(int k = 0; k<3; k++){
                    if(tmp+k >9){
                        continue;
                    }
                    System.out.print(tmp+k+ "*" + j + "=" + (tmp+k)*j + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void Ex13() {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;
        // 반복문과 charAt(int i)를 이용해서 문자열의 문자를
        // 하나씩 읽어서 검사한다.
        for(int i=0; i < value.length() ;i++) {
            if(value.charAt(i)<48 || value.charAt(i)>57){
                isNumber = false;
            }
        }
        if (isNumber) {
            System.out.println(value+"는 숫자입니다.");
        } else {
            System.out.println(value+"는 숫자가 아닙니다.");
        }
    }

    public static void Ex14() {
        // 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
        int answer = (int)(Math.random()*99) + 1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기위한 변수

        // 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
        java.util.Scanner s = new java.util.Scanner(System.in);
        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 :");
            input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
            if(input == answer){
                System.out.println("맞췄습니다.\n시도횟수는 " + count + "번입니다.");
                break;
            } else if(input > answer){
                System.out.println("더 작은 수를 입력하세요.");
            } else{
                System.out.println("더 큰 수를 입력하세요.");
            }

        } while(true); // 무한반복문
    }

    public static void Ex15() {
//        다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란,
//        숫자를 거꾸로 읽 어도 앞으로 읽는 것과 같은 수를 말한다.
//        예를 들면 ‘12321’이나 ‘13531’같은 수를 말한다.

        int number = 12321;
        int tmp = number;

        int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
        while(tmp !=0) {
            int front = 10000;

            while(front>=1){
                result += (tmp%10)*front;
                front/=10;
                tmp/=10;
            }
        }
        if(number == result)
            System.out.println( number + "는 회문수 입니다.");
        else
            System.out.println( number + "는 회문수가 아닙니다.");
    }
}
