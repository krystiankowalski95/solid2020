public class Fine {
    private int MAX_SEED;
    private int FINE;


    public Fine(int MAX_SEED, int FINE){
        this.MAX_SEED = MAX_SEED;
        this.FINE = FINE;
    }

    public int calculate(int speed){
        if(speed>this.MAX_SEED){
            return FINE;
        }else{
            return 0;
        }
    }


}