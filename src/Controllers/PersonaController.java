package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {
        for(int i = 1; i<personas.length;i++){
            Persona key = personas[i];
            int j = i-1;
            while(j>=0 && personas[j].getEdad()>key.getEdad()){
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1] = key;
        }
    }


    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int left = 0;
        int right = personas.length - 1;
        while (left<=right){
            int mid = left+(right - left) / 2;
            if (personas[mid].getEdad() == edad) {
                return personas[mid];
            } 
            if (personas[mid].getEdad() < edad) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;

    }
}
