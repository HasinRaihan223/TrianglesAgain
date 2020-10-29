public class Point{
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p){
    x= p.x;  //private access in the same file is allowed!
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other){
    double y1 = this.getY();
    double x1 = this.getX();
    double y2 = other.getY();
    double x2 = other.getX();
    return Math.sqrt( ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)) );
  }

  public boolean equals(Point other){
    double y1 = this.getY();
    double x1 = this.getX();
    double y2 = other.getY();
    double x2 = other.getX();
    return ((x2 == x1) && (y1 == y2));
  }

}
