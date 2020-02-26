public class DotView implements RobotView{
    int j = 5;
    public void turn(double oldHeading, double newHeading){};
    public void move(double oldX, double oldY,
                     double newX, double newY){
                        double kankakuX = (newX - oldX)/j;
                        double kankakuY = (newY - oldY)/j;
                        
                         for(int i = 0;i < j;i++ ){ 
                         System.out.println(oldX + " " + oldY);
                         oldX = oldX + kankakuX;
                         oldY = oldY + kankakuY;
                         }
                     }
}