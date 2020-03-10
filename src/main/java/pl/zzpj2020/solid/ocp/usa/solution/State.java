package pl.zzpj2020.solid.ocp.usa.solution;

public class State {
    private SpeedLimit speedLimit;

    public State(SpeedLimit speedLimit){
        this.speedLimit = speedLimit;
    }

    public double calcualateSpeedLimitFine(int speed){
        return this.speedLimit.calcualateSpeedLimitFine(speed);
    }
}
