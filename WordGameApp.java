import java.util.Scanner;

public class WordGameApp {
    static String word[] = {"아버지", ""};
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        num = sc.nextInt();
        Player player[] = new Player[num];

        for(int i=0; i<player.length; i++)
        {
            player[i] = new Player();
            System.out.print("참가자의 이름을 입력하세요>>");
            player[i].name = sc.next();
        }

        System.out.println("시작하는 단어는 "+word[0]+"입니다");

        boolean a = true;
        while(a) {
            for(int i=0; i<player.length; i++)
            {
                System.out.print(player[i].name+">>");
                word[1] = player[i].SayWord();
                a = player[i].Succeed();
                word[0] = word[1];
                if(a==false)
                {
                    System.out.print(player[i].name+"이(가) 졌습니다.");
                    break;
                }
            }
        }
    }
}

class Player{
    String name;
    String SayWord() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    boolean Succeed() {
        char lastChar = WordGameApp.word[0].charAt(WordGameApp.word[0].length()-1);
        char firstChar = WordGameApp.word[1].charAt(0);
        if(lastChar == firstChar)
            return true;
        else
            return false;
    }
}

