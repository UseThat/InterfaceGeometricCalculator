
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeLogic {
    private Scanner scan = new Scanner(System.in);
    private Shape shape;

    public ShapeLogic() {
        choiseList();

        switchLogic(scanOption());
    }

    private void switchLogic(int scanOption) {

        switch (scanOption) {
            case 1:
                System.out.print("Let's count rectangle! Give me one number: ");
                shape = new Rectangle(scan.nextDouble());
                System.out.println(shape.calculateArea());
                System.out.println(shape.calculatePerimeter());
                break;
            case 2:
                System.out.print("Let's count circle! Give me one number: ");
                shape = new Circle(scan.nextDouble());
                System.out.println(shape.calculateArea());
                System.out.println(shape.calculatePerimeter());
                break;
            case 3:
                System.out.print("Let's count triangle! Give me side: ");
                double a = scan.nextDouble();
                System.out.println("Give me height: ");
                shape = new Triangle(a, scan.nextDouble());
                System.out.println(shape.calculateArea());
                System.out.println(shape.calculatePerimeter());
                break;
            case 0:
                System.out.println("Exit and nothing to do :(");
                break;
            default:
                System.out.println("Nothing choose bye bye!");
        }
        scan.close();
    }

    private int scanOption() {
        try {
            int a = scan.nextInt();
            return a;
        } catch (InputMismatchException ex) {
            System.out.println("Error incorrect choose close program");
        }
        return 0;
    }


    public void choiseList() {

        for (int i = 0; i < ChoiseList.values().length; i++) {
            System.out.println(ChoiseList.values()[i].getAction() + ". " + ChoiseList.values()[i]);
        }
        System.out.print("Choose option: ");
    }


}
