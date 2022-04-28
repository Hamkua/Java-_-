import java.util.Scanner;
public class StandardOfJava3 {
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

                default:
                    break Loop;
            }
        }
    }

    public static void Ex1(){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65
        System.out.println(1 + x << 33);    //6
        System.out.println(y >= 5 || x < 0 && x > 2);   //true
        System.out.println(y += 10 - x++);    //13
        System.out.println(x+=2);    //5
        System.out.println( !('A' <= c && c <='Z') );    //false
        System.out.println('C'-c);    //2
        System.out.println('5'-'0');    //5
        System.out.println(c+1);    //66
        System.out.println(++c);    //B
        System.out.println(c++);    //B
        System.out.println(c);    //C
    }

    public static void Ex2(){
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        int numOfBucket = (Math.round(numOfApples/(float)sizeOfBucket)); // 모든 사과를 담는데 필요한 바구니의 수

        System.out.println("필요한 바구니의 수 :"+numOfBucket);    //13
    }

    public static void Ex3(){
        int num = 10;
        System.out.println(num>=0?(num==0?"0":"양수"):"음수");
    }

    public static void Ex4(){
        int num = 456;
        System.out.println(num-=num%100);
    }

    public static void Ex5(){
        int num = 333;
        System.out.println(num-=(num%10-1));
    }

    public static void Ex6(){
        int num = 24;
        System.out.println(Math.round((num+10)/10.0) * 10 - num);
    }

    public static void Ex7() {
        int fahrenheit = 100;
        float celcius = ((int)(5/9.0f * (fahrenheit - 32)*100 + 0.5)/ 100.0f);

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }

    public static void Ex8() {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);

        char ch = 'A';
        ch = (char)(ch + 2);

        float f = 3 / 2.0f;
        long l = 3000L * 3000 * 3000;

        float f2 = 0.1f;
        double d = 0.1;

        boolean result = (float)d==f2;

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);
    }

    public static void Ex9() {
        char ch = 'z';
        boolean b = ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9'));

        System.out.println(b);
    }


    public static void Ex10() {
        char ch = 'A';
        char lowerCase = (ch<97) ? (char)(ch+32) : ch;
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
