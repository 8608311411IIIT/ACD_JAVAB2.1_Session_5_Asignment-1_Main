/*A simple program which clculates the area and perimeter of circle,rectangle and triangle..all these classes extend Figure class which is a abstract 
class.*/
import java.util.*;
import java.lang.*;

abstract class Figure{
      double dim1;
      abstract void findArea();
      abstract void findPerimeter();
}

class Circle extends Figure{
      private float r;
      public  Circle(){//constructor of the class Circle
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the radius of the circle");
           r=sc.nextInt();
      }
     
          public void findArea(){//overrides method findArea() of class Figure
                  System.out.println("Area of circle is"+(float)(3.14*r*r));
          }
      
              public void findPerimeter(){//overrides method findPerimeter() of class Figure
                     System.out.println("Perimeter of circle is"+(float)(2*3.14*r));
              }
}

class Rectangle extends Figure{
       private float l,b;
       Scanner sc=new Scanner(System.in);
       public Rectangle(){//constructor of the class Triangle
            System.out.println("Enter the length and breadth of rectangle");
            l=sc.nextInt();
            b=sc.nextInt();
      }
       
          public void findArea(){//overrides method findArea() of class Figure
                System.out.println("Area of rectangle is"+(l*b));
          }
      
              public void findPerimeter(){//overrides method findPerimeter() of class Figure
                     System.out.println("Perimeter of rectangle is"+(2*(l+b)));
              }
}
class Triangle extends Figure{
       float a,b,c;
       Scanner sc=new Scanner(System.in);
       public Triangle(){//constructor of the class triangle
             System.out.println("Enter the sides of triangle");
             a=sc.nextInt();
             b=sc.nextInt();
             c=sc.nextInt();
      }
       
          public void findArea(){//overrides method findArea() of class Figure
                double s=.5 * ( a + b + c);
                double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.println("Area of triangle is"+(float)area);
          }
      
              public void findPerimeter(){//overrides method findPerimeter() of class Figure
                     System.out.println("Perimeter of triangle is"+(a + b + c));
              }

}
public class Geometry{
      
      public static void main(String [] args){
         
               int choice;
               Circle c1=new Circle();//c1 is object of class Circle
               Rectangle r1=new Rectangle();//r1 is object of class rectangle
               Triangle t1=new Triangle();//t1 is object of class triangle
               c1.findArea();
               c1.findPerimeter();
               r1.findArea();
               r1.findPerimeter();
               t1.findArea();
               t1.findPerimeter();               
               
      }
}



