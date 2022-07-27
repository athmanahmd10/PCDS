import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Method2 extends Hacker{

    FileReader fileReader;
    boolean foundPassword = false;
    Date beginDate;
    Date finalDate;
    
    Auth user = new Auth();
 


    public void searchPassword(){
            // Création d’un fileReader pour lire le fichier
    
        try {
            fileReader = new FileReader("./password.txt");
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        
         // Création d’un bufferedReader qui utilise le fileReader 
         BufferedReader reader = new BufferedReader (fileReader);
            try { 
            
                // une fonction à essayer pouvant générer une erreur
                String line = reader.readLine();
                
                System.out.println("Recherche ...");
                beginDate = new Date();
                while(line != null) {
                    
                    // Comparaison des mots de passe genérés lors de l'authentification
                    // foundPassword = user.authentificate(line);

                    if(foundPassword){
                      break;
                    }
        
                    // lecture de la prochaine ligne
                    line = reader.readLine();
            } 

            if(foundPassword){
                finalDate = new Date();
                long duree = finalDate.getTime() - beginDate.getTime();
                  timer(duree);
            }else{
                System.out.println("Ce mot de passe n'éxiste pas dans le dictionnaire !!!");
            }
        }
        
        catch (IOException e) {
        
            e.printStackTrace();
        
        
        }
        
        try {
            reader.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
    }

    public void timer(long duree){
        long milliseconds, seconds, minutes;
    
        milliseconds = duree%1000;
        duree /=1000;
        seconds = duree%60;
        minutes = duree/60;
    
        System.out.println(minutes+" minutes "+seconds+" secondes "+ milliseconds+" millisecondes");
      }
}