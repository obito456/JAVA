import java.util.Scanner ;

public class hello {
  public static void main(String[] args) {
    
    double x;
    double y;
    double z;

    Scanner scan=new Scanner(System.in);
    
    System.out.println("Enter side x: ");
    x=scan.nextDouble();
    System.out.println("Enter side y: ");
    y=scan.nextDouble();
    
    z=Math.sqrt((x*x)+(y*y));
    System.out.println("The hyotenuse is: "+z);

    scan.close();
   
  }
}
