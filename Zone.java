public class Zone {
    private String name;
    private double incrementPercent;

    public Zone(String name, int incrementPercent){
        this.name=name;
        if(incrementPercent>=0 && incrementPercent<=100) this.incrementPercent = 1 - incrementPercent/100;
    }

    public String getName() {
        return name;
    }

    public double getIncrementPercent() {
        return incrementPercent;
    }

}
