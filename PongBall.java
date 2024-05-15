public class PongBall {
    private int xCord;
    private int yCord;
    private int velocityX;
    private int velocityY ;
    public PongBall(int x, int y, int bX, int bY ){
        xCord = x;
        yCord = y;
        velocityX = bX;
        velocityY = bY;
    }
    public double getX(){
        return xCord;
    }
    public double getY(){
        return yCord;
    }
    public void bounceX(){
        velocityX = -velocityX;
    }
    public void bounceY(){
        velocityY = -velocityY;

    }
    public void move(){
        xCord = velocityX;
        yCord = velocityY;
    }
    
    
    
}
