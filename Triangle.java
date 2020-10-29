public class Triangle{
  private Point v1,v2,v3;

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v2 = c;
  }

  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
    Point p1 = new Point(x1,y1);
    Point p2 = new Point(x2,y2);
    Point p3 = new Point(x3,y3);
    v1 = p1;
    v2 = p2;
    v3 = p3;
  }

  public double getPerimeter(){
    double side1 = v1.distanceTo(v2);
    double side2 = v2.distanceTo(v3);
    double side3 = v3.distanceTo(v1);
    double P = side1 + side2 + side3;
    return P;
  }

  //Quick test
  /* public static void main(String[]args){
    Triangle T1 = new Triangle(0,1,1,3,-2,5);
    System.out.println(T1.getPerimeter());
  }
  */

}
