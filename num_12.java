import java.util.*;

class Seat {
    String seat[] = new String[10];

    public Seat() {
        for(int i=0; i<seat.length;i++) {
            seat[i] = " ---";
        }
    }
    public void setData(String name, int countNum) {
        if(countNum>0 && countNum<10)
            seat[countNum-1] = name;
        else
            System.out.println("10개 이내로 입력해주세요.");
    }
    public void oneShow() {
        for(int i=0; i<seat.length;i++) {
            System.out.print(seat[i] + " ");
        }
        System.out.println();
    }

    public boolean check(String name) {
        for(int i=0;i<seat[i].length();i++) {
            if(seat[i].equals(name)){
                seat[i] ="---";
                return true;
            }
        }
        return false;
    }
}

class Reservation {
    Scanner sc_sub = new Scanner(System.in);
    private String Grade[] = {"S", "A", "B"};
    private Seat seat[] = new Seat[3];

    public Reservation() {
        for(int i=0; i<seat.length;i++) {
            seat[i] = new Seat();
        }
    }

    public void Reserve() {
        try{
            System.out.print("좌석구분 S(1), A(2), B(3)>>");
            int seatGrade = sc_sub.nextInt();
            System.out.print(Grade[seatGrade-1]+">>");
            seat[seatGrade-1].oneShow();

            System.out.print("이름>>");
            String name = sc_sub.next();
            System.out.print("번호>>");
            int countNum = sc_sub.nextInt();

            seat[seatGrade-1].setData(name, countNum);
        }
        catch(InputMismatchException e) {
            System.out.println("잘못입력했습니다.");
        }
    }

    public void SeeAll() {
        for(int i=0;i<Grade.length;i++) {
            System.out.print(Grade[i] +">> ");
            seat[i].oneShow();
        }
        System.out.println("<<조회를 완료하였습니다.>>");
    }


    public void Cancel() {
        System.out.print("좌석 S:1, A:2, B:3>>");
        int seatGrade = sc_sub.nextInt();
        System.out.print(Grade[seatGrade-1] + ">> ");
        seat[seatGrade-1].oneShow();
        System.out.print("이름>>");
        String name = sc_sub.next();

        boolean result =seat[seatGrade-1].check(name);
        if(result ==false)
            System.out.println("예약되지 않은 이름입니다.");
    }
}

public class num_12 {
    Scanner sc_main = new Scanner(System.in);
    Reservation rs = new Reservation();

    public num_12() {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
    }
    public void run() {
        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int num = sc_main.nextInt();

            switch(num){
                case 1:
                    rs.Reserve();
                    break;
                case 2:
                    rs.SeeAll();
                    break;
                case 3:
                    rs.Cancel();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("1~4중에서 다시 입력해주세요.");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        num_12 Num_12 = new num_12();
        Num_12.run();
    }
}
