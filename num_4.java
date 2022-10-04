class Rectangle2{
    private int x = 0;
    private int y = 0;
    private int width = 0;
    private int height = 0;

    public Rectangle2(){}
    public Rectangle2(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square() {
        return width * height;
    }

    public void show() {
        System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각형 \n", x, y, width, height);
    }

    public boolean contains (Rectangle2 r) {
        if ((x < r.x) && (y < r.y) && ( x + width > r.x + r.width && y + height > r.y + r.height ))
            return true;
        else
            return false;
    }
}

public class num_4 {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2(2, 2, 8, 7);
        Rectangle2 s = new Rectangle2(5, 5, 6, 6);
        Rectangle2 t = new Rectangle2(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s을 포함합니다.");
    }
}
