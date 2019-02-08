import java.util.Arrays;

public class Bankomat {
    private int num_20;
    private int num_50;
    private int num_100;
    private boolean isSuccess=true;

    protected Bankomat(int num_20, int num_50, int num_100) {
        this.num_20 = num_20;
        this.num_50 = num_50;
        this.num_100 = num_100;
    }

    protected boolean inputMoney (int sum){
        int [] array = this.countNum(sum);
        num_20 += array[0];
        num_50 += array[1];
        num_100 += array[2];
        if (isSuccess){
            System.out.println("Операция прошла успешно");
            System.out.println("В банкомате купюр: 20: "+num_20+" 50: "+num_50+" 100: "+num_100);
        }
        return isSuccess;
    }
    public void outputMoney (int sum){
        int [] array = this.countNum(sum);
        System.out.println("Выдано купюр: 20: "+array[0]+" 50: "+array[1]+" 100: "+array[2]);
        num_20 -= array[0];
        num_50 -= array[1];
        num_100 -= array[2];
        System.out.println("В банкомате купюр: 20: "+num_20+" 50: "+num_50+" 100: "+num_100);
    }
    private int [] countNum (int sum){
        int count_20 = 0, count_50 = 0,count_100=0;
        if (sum/100>=1) {
            count_100 = sum/100;
            if(sum%100>=50){
                count_50 = 1;
                count_20 = (sum%100-50)/20;
            } else if (sum%100<50){
                count_20 = sum%100/20;
            }
        } else if (sum/50==1){
            count_50 = 1;
            count_20 = sum%50/20;
        } else if (sum/50<1){
            count_20 = sum/20;
        }
        int [] numArray = {count_20, count_50, count_100};
        return numArray;
    }
}
