import PreferencesSelector.useCases.PreferenceManagerUseCase;
import feedback.controllers.FeedbackController;//Mario
import listGames.controllers.ListGamesController; //albani
import score.controllers.ScoreController; //ROQUE
import PreferencesSelector.models.Preference; //Julio
//importe su controlador aqui


public class App {
  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    ListGamesController listGamesController = new ListGamesController(); 
    ScoreController scoreController = new ScoreController(); // Instanciar el controlador de puntajes = ROQUE
    FeedbackController feedbackController = new FeedbackController();
     PreferenceManagerUseCase preferenceManagerUseCase = new PreferenceManagerUseCase(); 
    //Aqui instanciar su propio objeto controller

    //######################################################### ALBANY #########################################################
    // CREATE - Crear un Juego
    System.out.println("Se procede a crear un juego:");
    String gameOne = listGamesController.create("1", "Juego Ranita", "Codigos Flex- Css", true);
    System.out.println(gameOne);

    // CONSULT - Consultar Juego
    System.out.println("Se ha consultado el Juego con el primer indice");
    String listGameByIndex = listGamesController.findByIndex(0);
    System.out.println(listGameByIndex);
    System.out.println("\n");

    // UPDATE - Actualizar Juego
    System.out.println("Se actualiza Juego");
    String updateGame = listGamesController.update(0, "1", "Juego Ranita", "Prácticas Css", false);
    System.out.println(updateGame);

    // DELETE - Eliminar Juego
    System.out.println("Eliminar el puntaje con el primer indice.");
    String deleteListGame = listGamesController.delete(0);
    System.out.println(deleteListGame);
    System.out.println("\n");

    //######################################################### ROQUE #########################################################
    System.out.println("\n GESTION DE PUNTAJES\n");

    // CREATE - Crear puntajes para estudiantes
    System.out.println("Se procede a crear puntajes para estudiantes...");
    String scoreOne = scoreController.create(1010, 85);
    System.out.println(scoreOne);
    
    // READ ALL - Consultar todos los puntajes
    System.out.println("Consultar todos los puntajes...");
    String allScores = scoreController.all();
    System.out.println(allScores);
    System.out.println("\n");
    // READ BY INDEX - Consultar puntaje por índice
    System.out.println("Se ha consultado el puntaje con el indice 1");
    String scoreByIndex = scoreController.findByIndex(1);
    System.out.println(scoreByIndex);
    System.out.println("\n");
    
    // UPDATE - Actualizar puntaje del estudiante en índice 0
    System.out.println("Actualizamos el puntaje del estudiante con indice 0 (sumamos 10 puntos).");
    String updateScore = scoreController.update(0, 1010, 10);
    System.out.println(updateScore);
    System.out.println("\n");
    // Verificar el cambio
    System.out.println("Verificamos todos los puntajes despues de la actualizacion:");
    String allScoresAfterUpdate = scoreController.all();
    System.out.println(allScoresAfterUpdate);
    System.out.println("\n");
    // DELETE - Eliminar puntaje
    System.out.println("Eliminamos el puntaje con indice 2.");
    String deleteScore = scoreController.delete(2);
    System.out.println(deleteScore);
    System.out.println("\n");
    // Verificar lista final
    System.out.println("Lista final de puntajes:");
    String finalScores = scoreController.all();
    System.out.println(finalScores);

    //######################################################### MARIO #########################################################
    System.out.println("Se procede a crear un Comentario:");
    String feedbackOne = feedbackController.create("Mario munera","La pagina esta muy buena",true);
    System.out.println(feedbackOne);
    //######################################################### SERGIO #########################################################
    //######################################################### JULIO #########################################################
     System.out.println("Selecciona la Preferencia de tu Materias!");
      
        // Create
        System.out.println("Se procede a crear la preferencia...");
        String preferenceOne = preferenceManagerUseCase.addPreference("Andres Felipe", "Matematicas", 8);
        System.out.println(preferenceOne);
        System.out.println("\n");

        String preferenceTwo = preferenceManagerUseCase.addPreference("Maria Gomez", "Programacion", 10);
        System.out.println(preferenceTwo);
        System.out.println("\n");

        String preferenceThree = preferenceManagerUseCase.addPreference("Carlos Ruiz", "Base de Datos", 7);
        System.out.println(preferenceThree);
        System.out.println("\n\n");


        System.out.println("Consultar todas las preferencias...");
        // Read
        String read = preferenceManagerUseCase.showAllPreferences();
        System.out.println(read);
        System.out.println("\n\n");


        System.out.println("Se ha consultado la preferencia con el indice 1");
         // Read find by index
        String read2 = preferenceManagerUseCase.findByIndex(1);
        System.out.println(read2);
        System.out.println("\n\n");


        System.out.println("Actualizamos la preferencia con indice 0.");
        // Update
        String update = preferenceManagerUseCase.updatePreference(0, "Andres Felipe", "Calculo Avanzado", 9);
        System.out.println(update);
        System.out.println("\n\n");


        System.out.println("Eliminamos la preferencia con indice 2.");
        // Delete
        String delete = preferenceManagerUseCase.deletePreference(2);
        System.out.println(delete);
        System.out.println("\n\n");


        System.out.println("Lista final de preferencias:");
        String finalList = preferenceManagerUseCase.showAllPreferences();
        System.out.println(finalList);
    }
}
  