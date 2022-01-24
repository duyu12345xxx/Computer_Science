// public class TestPlanet {
//     //Test Planet.java
    
//     public static void main(String[] args){
//         checkPlanet();
//     }

// /**
//  * Checks whether or not the fore between two planets are right
//  * @param expected  Expected double
//  * @param actual    Double received
//  * @param label     Label for the test case 
//  * @param eps       Tolerance for the double comparison
//  */

//  private static void checkEquals(double actual, double expected ,String label , double eps){
//      if (Math.abs(expected - actual) <= eps * Math.max(expected,actual)){
//          System.out.println("PASS: " + label + ": Expected " + expected + " and you gave " + actual);
//      }
//      else{
//          System.out.println("FAIL: " + label +": Expected " + expected + " and you gave " + actual);
//      }
//  }
    

//  /**
//   * Checks the Planet class to make sure Planet.java works
//   */
//   private static void checkPlanet(){
//       System.out.println("Checking Planet...");

//       Planet p1 = new Planet(1.0, 1.0, 3.0, 4.0, 5.0, "jupiter.gif");
//       Planet p2 = new Planet(2.0, 1.0, 3.0, 4.0, 5.0, "jupiter.gif");
//       Planet p3 = new Planet(4.0, 5.0, 3.0, 4.0, 5.0, "jupiter.gif"); 
  
//       Planet[] P_group = new Planet[]{p1,p2,p3};
//       checkEquals(p1.calcNetForceExertedByX(P_group), 0.0,"calcNetForceExertedByX()",0.01);
//       checkEquals(p2.calcNetForceExertedByX(P_group), 0.0,"calcNetForceExertedByX()",0.01);

//       checkEquals(p1.calcNetForceExertedByY(P_group), 0.0,"calcNetForceExertedByY()",0.01);
//       checkEquals(p2.calcNetForceExertedByY(P_group), 0.0,"calcNetForceExertedByY()",0.01);

      
      
//       double d_time = 10;
//       double Force_X = 200;
//       double Force_Y = 100;

//       p1.update(d_time, Force_X, Force_Y);
      
//       checkEquals(actual, p1.xxVel, "xxVel update()", 0.01);
    
  
  
//     }
// }





