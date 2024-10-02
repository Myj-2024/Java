public class mianji {
    public static void main(String[] args) {
        //求圆的面积和周长
        //圆周率为3.14  半径为r=1.5
        final double PI = 3.14;
        double r = 1.5;
        //周长公式为 double c = 2*PI*r
        double c = 2*PI*r;
        //面积公式为 double area = PI*r*r
        double area = PI*r*r;
        System.out.println("圆的周长为："+ c + ",圆的面积为："+ area);
    }
}
