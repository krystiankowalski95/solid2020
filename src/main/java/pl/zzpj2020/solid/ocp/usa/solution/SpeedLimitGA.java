package pl.zzpj2020.solid.ocp.usa.solution;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SpeedLimitGA implements SpeedLimit {
    private static final int maxSpeed = 150;

    @Override
    public double calcualateSpeedLimitFine(int speed) {
        if ( speed > maxSpeed ){
            return 1.5 * speed;
        }else{
            return 0.0;
        }
    }
}
