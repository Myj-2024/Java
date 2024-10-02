public class chigutou {
    // 格莱尔买来30根骨头，第一天吃掉一半后又吃了一根，第二天将剩下的骨头吃了一半后又吃了一根，第三天仍然如此
    // 问第三天吃完后还剩下多少根骨头？
    public static void main(String[] args) {
        int sum = 30;
        sum = sum / 2 - 1;// 第一天吃完后剩下的骨头
        sum = sum / 2 - 1;// 第二天
        sum = sum / 2 - 1;// 第三天
        System.out.println("还剩下：" + sum);

    }
}
