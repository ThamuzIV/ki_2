package block2.day2.exercise6_3;

public class MovablePoint implements Movable{
    protected int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint(int x, int y,int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toStringg() {
        return " x : " + this.x + " y : " + this.y + " xSpeed : " + xSpeed + " ySpeed : " + ySpeed;
    }

    @Override
    public void moveUp() {
        this.y -= this.ySpeed;
    }
    @Override
    public void moveDown() {
        this.y += this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
    }
}