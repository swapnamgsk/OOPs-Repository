public class MountainPeak {
    String peakName;
    int altitude; // Changed data type to int for altitude


    public MountainPeak(String peakName, int altitude) {
        this.peakName = peakName;
        this.altitude = altitude;
    }


    public static void main(String[] args) {
        MountainPeak mountain = new MountainPeak("Everest", 8848); // Changed altitude to 8848 meters
        System.out.println("Peak Name: " + mountain.peakName);
        System.out.println("Altitude: " + mountain.altitude + " meters");
    }
}
