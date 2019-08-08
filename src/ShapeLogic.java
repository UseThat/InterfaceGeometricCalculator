import java.util.Scanner;

public class ShapeLogic {
    private Scanner scan = new Scanner(System.in);

    public ShapeLogic(){
        choiseList();
    }





    public void choiseList(){

        for(int i = 0 ; i<ChoiseList.values().length;i++){
            System.out.println(ChoiseList.values()[i].getAction()+". "+ChoiseList.values()[i]);
        }
    }


}
