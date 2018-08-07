package test;

public class Test02 {

    public static void main(String args[]){
        int score[] = {12,45,23,10,100};
        //冒泡排序:将数组中的元素数值进行比较最终像水泡一样大的先出栈，小的最后出栈的过程
        for (int i = 0;i<score.length;i++){
            for (int j = i+1;j<score.length;j++){
                if (score[i]<score[j]){
                    //将大的数值和前面的小数值交换位置
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }
        for (int s = 0;s<score.length;s++){
            System.out.println(score[s]);
        }
    }
}
