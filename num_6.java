import java.util.Scanner;

class Circle3 {
    private double x=0;
    private double y=0;
    private int radius=0;

    public Circle3(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public int getR(){
        return radius;
    }

    public void show() {
        System.out.printf("가장 면적이 큰 원은 (%.1f,%.1f)%d\n", x, y, radius);
    }
}

public class num_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle3 c[] = new Circle3[3];
        int max =0;

        for(int i=0 ; i<c.length ; i++) {
            System.out.print("x, y, radius >>");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new Circle3(x, y, radius);
        }

        for(int i=0; i<c.length;i++) {
            if(c[max].getR()<c[i].getR())
                max = i;
        }

        c[max].show();
        sc.close();
    }
}
