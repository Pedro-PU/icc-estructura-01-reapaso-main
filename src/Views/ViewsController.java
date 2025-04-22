package Views;
import Controllers.PersonaController;
import Models.Persona;
import java.util.Scanner;

public class ViewsController {
    PersonaController pC = new PersonaController();
    Scanner lector = new Scanner(System.in);
    public void printPersonaArray(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public void printMessage(String message){
        System.out.println(message);
    }
    
}
