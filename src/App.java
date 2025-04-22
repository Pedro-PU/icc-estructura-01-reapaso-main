import Models.Persona;
import Views.ViewsController;
import Controllers.PersonaController;

import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofía", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),

        };
        
        ViewsController views = new ViewsController();
        PersonaController pC = new PersonaController();
        views.printPersonaArray(personas);
        System.out.println("--------------------------------------");
        pC.ordenarPorEdad(personas);
        views.printPersonaArray(personas);
        System.out.println("--------------------------------------");
        
        Persona indexPersona = pC.buscarPorEdad(personas, 40);
        if(indexPersona == null){
            views.printMessage("No hay persona con esa edad");
        }else{
            views.printMessage("La persona con la edad de 40 es: "+"-- "+indexPersona+" --");
        }

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}
