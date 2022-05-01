package ch7;

import java.util.Scanner;

class SutdaCard{
    private int num;
    private boolean isKwang;


    public  SutdaCard(){
        num = 1;
        isKwang = true;
    }

    public SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public int getNum() {
        return num;
    }

    public boolean isKwang() {
        return isKwang;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setKwang(boolean kwang) {
        isKwang = kwang;
    }

    public String info(){

        if(isKwang == true){
            return num + "K";
        } else{
            return Integer.toString(num);
        }
    }
}

// 3번
class Student{
    public String name;
    public int ban;
    public int no;
    public int kor;
    public int eng;
    public int math;

    public Student(){

    }

    public  Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }
    public int getTotal(){
        return kor + eng + math;
    }

    public double getAverage(){
        return Math.round(getTotal()/3.0*10)/10.0;
    }

//    Student s = new Student("홍길동",1,1,100,60,76); System.out.println(s.info());

    public String info(){
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
    }
}


class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x, int y) {
        return Math.sqrt((x - this.x)*(x - this.x) + (y - this.y)*(y - this.y));
    }
}

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        // (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
        if(isPowerOn){
            isPowerOn = false;
        } else{
            isPowerOn = true;
        }
    }

    void volumeUp(){
        // (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
        if(volume < MAX_VOLUME){
            volume++;
        }
    }

    void volumeDown(){
        // (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
        if(volume > MIN_VOLUME){
            volume--;
        }

    }

    void channelUp(){
        // (4) channel의 값을 1증가시킨다.
        // 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
        if(channel == MAX_CHANNEL){
            channel = MIN_CHANNEL;
        } else{
            channel++;
        }

    }

    void channelDown(){
        // (5) channel의 값을 1감소시킨다.
        // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
        if(channel == MIN_CHANNEL){
            channel = MAX_CHANNEL;
        } else{
            channel--;
        }
    }
}

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
                    Ex19();
                    break;

                case 9:
                    Ex20();
                    break;

                case 10:
                    Ex21();
                    break;

                case 11:
                    Ex22();
                    break;

                case 12:
                    Ex23();
                    break;

                case 13:
                    Ex24();
                    break;



                default:
                    break Loop;
            }
        }
    }


    public static void Ex1() {
        SutdaCard sC = new SutdaCard();
    }


    public static void Ex2() {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info());
        System.out.println(card2.info());
    }


    public static void Ex3() {

    }


    public static void Ex4() {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100; s.eng = 60; s.math = 76;
        System.out.println("이름:"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("평균:"+s.getAverage());
    }


    public static void Ex5() {

        Student s = new Student("홍길동",1,1,100,60,76);
        System.out.println(s.info());

    }

    //6번
    static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt((x1 - x)*(x1 - x) + (y1 - y)*(y1 - y));
    }

    public static void Ex6() {
        System.out.println(getDistance(1,1,2,2));
    }

    public static void Ex7() {

        MyPoint p = new MyPoint(1,1);
        // p와 (2,2)의 거리를 구한다.
        System.out.println(p.getDistance(2,2));
    }

    //19번
    public static void change(String str) {
        str += "456";
    }

    public static void Ex19() {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:"+str);
        // 지역변수에 += 연산을 적용했으므로, 출력값은 변하지 않는다
    }

    public static int[] shuffle(int[] original){
        int[] arr = new int[original.length];
        for(int i = 0; i<arr.length; i++){
            arr[i] = original[i];
        }

        for(int i = 0; i<arr.length; i++){
            int j = (int)(Math.random()*arr.length);
            int tmp = arr[i];
            arr[i] = original[j];
            original[j] = tmp;

        }
        return arr;
    }
    public static void Ex20() {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }


    public static void Ex21() {
        MyTv t = new MyTv();
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
    }


    //22번
    static boolean isNumber(String str){
//        주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
//        모두 숫자로만 이루어져 있으면 true를 반환하고,
//        그렇지 않으면 false를 반환한다.
//        만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다.
        try{
            Double.parseDouble(str);
        } catch (Exception e){
            return false;
        }
        return true;
    }

    public static void Ex22() {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }

    //23번
    static int max(int[] arr){
//        주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
//        만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
        int max = -999999;
        if(arr == null || arr.length == 0){
            return -999999;
        } else{
            for(int i = 0; i< arr.length; i++){
                if(max<=arr[i]){
                    max = arr[i];
                }
            }
            
            return max;
        }
    }
    public static void Ex23() {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
    }

    
    //24번
    static int abs(int value){
        return Math.abs(value);
    }

    public static void Ex24() {
        int value = 5;
        System.out.println(value+"의 절대값:"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값:"+abs(value));
    }



}