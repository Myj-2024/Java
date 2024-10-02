public class leixingzhuanhuan {
    public static void main(String[] args) {
        //类型转换
        //小明准备实现一个数字加密器，加密规则是：
        //加密结果=（整数*8+3）/2+2.6
        //加密结果仍为一个整数
        //int sum1 = 8*8+3;
        //double sum2 = 2+2.6;
        //double sum3 = sum1/sum2;
        //int sum4 = (int)sum3;
       // System.out.println(sum4);
       int num = 5;
       int result = (int)((num*8+3)/2+2.6);
       System.out.println(result);
    }
}
