import java.util.*;

public class Bmi {
	public static void main( String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Height(cm)");
        double h = sc.nextInt();
            h = h / 100;
        System.out.println("Weight(kg)");
        double w = sc.nextInt();
        double a;

        a = w / ( h * h );
        a = ((double)Math.round(a * 10))/10;

        System.out.println( "Your BMI is:" + a + "!" );
        System.out.println( "Your BMI is:" + a + "!" );
    }
}