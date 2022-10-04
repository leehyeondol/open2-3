import java.util.Scanner;

class Dictionary{
    private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String [] eng = {"love", "baby", "money", "future", "hope"};

    public static String kor2Eng(String word) {
        for(int i=0;i<kor.length;i++) {
            if (word.equals(kor[i]))
                return eng[i];
        }
        return null;
    }
}

public class num_10 {
    public num_10(){
        System.out.println("한영 단어 검색 프로그램입니다.");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        Dictionary dt = new Dictionary();

        while(true) {
            System.out.print("한글 단어?");
            String text = sc.next();

            if(text.equals("그만"))
                break;
            String text2 = dt.kor2Eng(text);

            if(text2!=null)
                System.out.println(text + "은 " + text2);
            else
                System.out.println(text + "는 저의 사전에 없습니다.");
        }
        sc.close();
    }

    public static void main(String[] args) {
        num_10 Num_10 = new num_10();
        Num_10.run();
    }
}
