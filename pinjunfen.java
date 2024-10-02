public class pinjunfen {
    public static void main(String[] args) {
        //已知某班男生有20位，女生有15位，男生平均分为87，女生平均分为85，问全体同学的平均分
        int total = 20*87+15*85;//总分
        int sum = 20+15;//总人数
        double avg = total*1.0/sum;//平均分=总分/总人数
        //String.format 对小数位数进行控制，但是返回结果为字符串类型
        String result = String.format("%.2f",avg);
        System.out.println("平均分为："+ result);//输出平均分
    }
}
