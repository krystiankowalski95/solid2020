package pl.zzpj2020.solid.ocp.usa.violation;

public class USASpeedLimitFineCalculator {

	
	public static double calcualateSpeedLimitFine(StateFine stateFine, float speed) {

		double fine = 0;
		if(speed>stateFine.getMAX_SPEED() ){
			fine= stateFine.getFINE_VALUE();
		}
		return fine;

}
