public class zuidazhi {
    public static void main(String[] args) {
        int x = 33, y = 44, z = 55, max = 0;
        if (x > y) {
            if (x > z)
                max = x;
            else
                max = z;
        } else {
            if (y > z) {
                max = y;
            } else
                max = z;
            System.out.println("最大值是：" + max);
        }

    }
}
