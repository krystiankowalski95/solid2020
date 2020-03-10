package pl.zzpj2020.solid.ocp.usa.solution;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SpeedLimitAL implements SpeedLimit {
    private static final int maxSpeed = 60;

    @Override
    public double calcualateSpeedLimitFine(int speed) {
        if ( speed > maxSpeed ){
            return 0.25 * speed;
        }else{
            return 0.0;
        }
    }
}
