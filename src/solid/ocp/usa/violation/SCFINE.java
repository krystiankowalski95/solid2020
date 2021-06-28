public class SCFINE implements FineCalculator {
    private final int MAX_SEED=40;
    private final int FINE = 100;


    public static int calculate(int speed){
        if(speed>MAX_SEED){
            return FINE;
        }else{
            return 0;
        }
    }


}