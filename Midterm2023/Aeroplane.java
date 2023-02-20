public class Aeroplane {
    private String model;
    private String maker;
    private int stallSpeed;
    private boolean isAirborne;

    
    public Aeroplane(String model, String maker) {
        this.model = model;
        this.maker = maker;
        this.stallSpeed = 0.0;
        this.isAirborne = false;
    }

    
    public Aeroplane(String model, String maker,  double stallSpeed) {
        this.model = model;
        this.maker = maker;
        this.stallSpeed = stallSpeed;
        this.isAirborne = false;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public String getMaker() {
        return maker;
    }

    public double getStallSpeed() {
        return stallSpeed;
    }

    public void setAirborne(boolean isAirborne) {
        this.isAirborne = isAirborne;
    }

    public boolean isAirborne() {
        return isAirborne;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + " This aeroplane is a " + model + " that is made by " + maker;
    }

}
