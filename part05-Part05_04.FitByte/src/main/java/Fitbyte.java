public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaxium) {
        
         
        double result = 0;
        double maxHeartRate = 0;
        maxHeartRate = 206.3 - (0.711 * age);

        result = (maxHeartRate - restingHeartRate) * (percentageOfMaxium) + restingHeartRate;

        return result;
    }

}