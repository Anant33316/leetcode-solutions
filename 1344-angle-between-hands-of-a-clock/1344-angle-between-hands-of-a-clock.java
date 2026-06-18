class Solution {
    public double angleClock(int hour, int minutes) {
        double hourang = hour*30 + minutes*0.5;
        double minuteang = minutes*6;
        double diff = Math.abs(hourang - minuteang);
        return Math.min(diff, 360 - diff);
    }
}