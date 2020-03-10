package pl.zzpj2020.solid.ocp.usa.solution;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SpeedLimitSC implements SpeedLimit {
    private static final int maxSpeed = 55;

    @Override
    public double calcualateSpeedLimitFine(int speed) {
        if ( speed > maxSpeed ){
            return 0.5 * speed;
        }else{
            return 0.0;
        }
    }
}
