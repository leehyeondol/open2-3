import java.util.Scanner;

class Phone {
    private String name = null;
    private String tel = null;

    public Phone() {}
    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public String getName() {return name;}
    public String getTel() {return tel;}
}

public class num_8 {
    Scanner sc = new Scanner(System.in);
    Phone phone[];
    int number = 0;

    public num_8(){
        System.out.print("인원수>>");
        number = sc.nextInt();
        phone = new Phone[number];
    }

    public void input() {
        for(int i=0; i<phone.length;i++) {
            System.out.print("이름과 번호는 빈 칸없이 입력)>>");
            String text = sc.next();
            String tel = sc.next();
            phone[i] = new Phone(text, tel);
        }
        System.out.println("저장되었습니다...");
    }

    public void search() {
        while(true) {
            boolean op = false;
            boolean op2 = false;
            System.out.print("검색할 이름>>");
            String name = sc.next();

            if(name.equals("그만"))
                break;

            for(int i=0; i<phone.length; i++) {
                if(name.equals(phone[i].getName())) {
                    System.out.println(name + "의 번호는 " + phone[i].getTel() + "입니다.");
                    op = true;
                }
            }

            if(op == false) {
                System.out.println(name + " 이 없습니다.");
            }
        }
    }

    public static void main(String[] args) {
        num_8 Num_8 = new num_8();
        Num_8.input();
        Num_8.search();
    }
}
