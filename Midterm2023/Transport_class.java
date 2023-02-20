

public abstract class Transport {
   private String vehicleType;
   private String color;
   private int forwardSpeed;
   private boolean isMoving;

   public Transport(String vehicletype, String color, int forwardSpeed) {
       this.vehichleType = vehicleType;
       this.color = color;
       this.forwardSpeed = forwardSpeed;
       if (forwardSpeed > 0) {
           this.isMoving = true;
       } else {
           this.isMoving = false;
       }
   }

   public String getVehicleType() {
       return VehicleType;
   }

   public String getColor() {
       return color;
   }

   public int getForwardSpeed() {
       return forwardSpeed;
   }

   public void setForwardSpeed(int speed) {
       this.forwardSpeed = speed;
       if (speed > 0) {
           this.isMoving = true;
       } else {
           this.isMoving = false;
       }
   }

   public boolean getIsMoving() {
       return isMoving;
   }

   public String toString() {
       return "This vehicle is a(n) " + type + ", its color is " + color + ". Current speed is " + forwardSpeed + ", so the in-motion state is " + isMoving + ".";
   }

   public abstract String checkSpeed();
}