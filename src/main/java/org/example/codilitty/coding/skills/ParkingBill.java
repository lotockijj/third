package org.example.codilitty.coding.skills;

public class ParkingBill {
    private static final int ENTRANCE_FEE = 2;
    private static final int FIRST_FULL_OR_PARTIAL_HOURS_COSTS= 3;
    private static final int SUCCESSIVE_FULL_OR_PARTIAL_HOURS_COSTS= 4;

    public int solution(String E, String L){
        // Implement your solution here
        int result = ENTRANCE_FEE;
        String[] entranceTime = E.split(":");
        String[] leavingTime = L.split(":");
        int timeOfHoursOfStay = Integer.parseInt(leavingTime[0]) - Integer.parseInt(entranceTime[0]);
        int timeOfMinutesOfStay = Integer.parseInt(leavingTime[1]) - Integer.parseInt(entranceTime[1]);
        if(timeOfMinutesOfStay > 0){
            timeOfHoursOfStay++;
        }
        if(timeOfHoursOfStay == 0 && timeOfMinutesOfStay == 0) return 0;
        result += timeOfHoursOfStay > 1 ?
                FIRST_FULL_OR_PARTIAL_HOURS_COSTS + (timeOfHoursOfStay - 1) * SUCCESSIVE_FULL_OR_PARTIAL_HOURS_COSTS :
                FIRST_FULL_OR_PARTIAL_HOURS_COSTS;

        return result;
    }
}
