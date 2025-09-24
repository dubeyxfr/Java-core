package in.kgcoding.PassBy;

public class PassByReference {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        System.out.println("Before move: x = " + p.x + ", y = " + p.y);

        move(p);

        System.out.println("After move: x = " + p.x + ", y = " + p.y);
    }

    public static void move(Point p) {
        p.x++;
        p.y++;
    }

    // Custom Point class
    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

