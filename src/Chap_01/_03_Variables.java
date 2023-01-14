package Chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        //char은 작은따옴표
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = false;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        //float은 3.1412346까지만 출력
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        //정수(int) 범위가 21억을 초과하면 long 자료형을 쓴다.
        long l = 1000000000000L;
        // 보기 편하도록 표기
        l = 1_000_000_000_000L;
        System.out.println(l);

    }
}
