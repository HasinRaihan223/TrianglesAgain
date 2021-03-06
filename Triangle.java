public class Triangle{
  private Point v1,v2,v3;

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
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

  public double getArea(){
    double side1 = v1.distanceTo(v2);
    double side2 = v2.distanceTo(v3);
    double side3 = v3.distanceTo(v1);
    double s = (getPerimeter())/2.0;
    double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    return area;
  }

  public String classify(){
    double side1 = Math.round(v1.distanceTo(v2)*10000)/10000.0;
    double side2 = Math.round(v2.distanceTo(v3)*10000)/10000.0;
    double side3 = Math.round(v3.distanceTo(v1)*10000)/10000.0;
    if ((side1 == side2) && (side1 == side3))
      return "equilateral";
    else if (((side1 == side2) && (side1 != side3)) || ((side1 == side3) && (side1 != side2)) || ((side2 == side3) && (side2 != side1)))
        return "isosceles";
    else
      return "scalene";
  }

  public String toString(){
    return "v1" + "(" + v1.getX() + ", " + v1.getY() + ") " +
    "v2" + "(" + v2.getX() + ", " + v2.getY() + ") " +
    "v3" + "(" + v3.getX() + ", " + v3.getY() + ")";
  }

  public void setVertex(int index, Point newP){
    if (index == 0){
      v1 = newP;
    }
    if (index == 1){
      v2 = newP;
    }
    if (index == 2){
      v3 = newP;
    }
  }

  /*
  //Quick Tester
  public static void main(String[]args){
    Triangle T1 = new Triangle(0,1,0,2,1,1);
    System.out.println(T1.getPerimeter());
    System.out.println(T1.getArea());
    System.out.println(T1.classify());
    System.out.println(T1.toString());
    Point k = new Point(15, 15);
    T1.setVertex(0,k);
    System.out.println(k.getX() + "," + k.getY());
  }
  */

}
