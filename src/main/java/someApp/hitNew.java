package someApp;

import java.util.Random;

/**
 * Created by hanjiangyu on 2017/3/29.
 */
public class hitNew {
    public static void main(String[] args){

        Random random = new Random();
        int r;
        int times = 0;
        int hittimes = 0;
        int totaltimes = 0;
        while (true){
            while (true){
                times++;
                totaltimes++;
                r = random.nextInt(99);
                if(r == 3){
                    hittimes++;
                    System.out.println("congratulations!after "+ times +" times try,You hit a new.");
                    break;
                }
            }
            times = 0;
            if(hittimes == 50)
                break;
        }
        System.out.println("after 50 time hit new, need " + totaltimes/50 + "time on average.");
    }
}
