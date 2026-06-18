class Solution {
    public double angleClock(int hour, int minutes) {
        hour=hour%12;
        double hrangle=(30*hour)+0.5*(minutes);
        double minangle =6*minutes;
        double angle=Math.abs(hrangle-minangle);
        return Math.min(angle,360-angle);
        
    }
}