import java.util.Scanner;

public class Client{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int method = 1;
        //Récupération de l'instance corresppondante
        Hacker myInstance = Factory.getInstance(method);

        //Appel de la fonction qui permet de pirater le mot de passe de l'utilisateur.
        myInstance.searchPassword(); 
        sc.close();
    }
}