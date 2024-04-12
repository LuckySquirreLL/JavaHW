public class Car {
    String carModel;
    private int carMaxSpeed;
    private int carHorsePower;
  public String carColor;


 public void setCarMaxSpeed(int carMaxSpeed){
      this.carMaxSpeed=carMaxSpeed;

    }
    public void setCarHorsePower(int carHorsePower){
      this.carHorsePower=carHorsePower;
    }
    public int getCarMaxSpeed(){
      return carMaxSpeed;
    }
    public  int getCarHorsePower(){
     return  carHorsePower;
    }


    public void carColor(String carColor) {
     this.carColor=carColor;
    }
}




