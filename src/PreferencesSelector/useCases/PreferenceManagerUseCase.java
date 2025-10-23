package PreferencesSelector.useCases;

import java.util.ArrayList;
import java.util.List;

import PreferencesSelector.models.Preference;

// Contenedor de metodos y atributos
public class PreferenceManagerUseCase {

    // Propiedad
    private final List<Preference> preferences; // Definicion Lista en memoria
    

    // Constructor
    public PreferenceManagerUseCase() {
        this.preferences = new ArrayList<>(); // Inicializacion - Preparar el uso de la lista.
    }

    // CREATE
    public String addPreference(String studentName, String subject, int priority) {
        try {
            Preference preference = new Preference(studentName, subject, priority);
            this.preferences.add(preference); // Uso de la lista
            return "Preferencia Creada: Estudiante:" + preference.getStudentName() + " Materia:" + preference.getSubject() + " Prioridad:" + preference.getPriority();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }

    // Read
    public String showAllPreferences(){
        try {
            StringBuilder result = new StringBuilder(); // preparando la concatenacion de los strings.
            for (int i = 0; i < preferences.size(); i++) { 
               Preference preference = preferences.get(i); // Se crea preferencia.
                result.append("Preferencia ")
                .append(i)
                .append(": Estudiante: ")
                .append(preference.getStudentName())
                .append(" Materia: ")
                .append(preference.getSubject())
                .append(" Prioridad: ")
                .append(preference.getPriority())
                .append("\n"); 
            }

            return result.toString(); // Retornando la concatenacion de las preferencias
            
        } catch (Exception e) {
           return "No ha sido posible listar las preferencias.";
        }
    }

    // Read by index
    public String findByIndex(int index){
        try {
             Preference preferenceFound = new Preference(); // Todavia no se ha encontrado
            for (int i = 0; i < preferences.size(); i++) { // Se procede a buscar
                if(index == i){ // Se aplica el filtro o condicional
                    preferenceFound = preferences.get(index); // Se obtiene la preferencia encontrada
                }
            }
            // Se imprime la preferencia encontrada.
            return "Preferencia Encontrada: Estudiante:" + preferenceFound.getStudentName() + " Materia:" + preferenceFound.getSubject() + " Prioridad:" + preferenceFound.getPriority();
        }
        catch (Exception e) {
            return "no ha sido posible encontrar la preferencia.";
        }
    }

 // Update
    public String updatePreference(int index, String studentName, String subject, int priority) {
        try {
            Preference preferenceFound = new Preference();
            for (int i = 0; i < preferences.size(); i++) {
               if(index == i){
                Preference preference = preferences.get(index);
                preferenceFound = preferences.get(i);
                preference.setStudentName(studentName);
                preferenceFound.setSubject(subject);
                preferenceFound.setPriority(priority);
                preferenceFound = preference;
               }
            }
            return "Preferencia Actualizada: Estudiante:" + preferenceFound.getStudentName() + " Materia:" + preferenceFound.getSubject() + " Prioridad:" + preferenceFound.getPriority();
        }
        catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }

 // Delete
    public String deletePreference(int index){
       try {
            preferences.remove(index);
            return "Se ha eliminado la preferencia correctamente.";
       } catch (Exception e) {
            return "no ha sido posible eliminar la preferencia.";
       }
    }
}