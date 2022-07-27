public class Factory{
    
    public static Hacker getInstance(int method){
        Hacker usedMethod;

        // Instanciation de la mthode brute force
       if(method == 1){
           usedMethod = new Method1();
           //On pourrait également appler Method3, elle fait la même chose.
       }else if(method ==2){
           //Instanciation de la méthode dictionnaire
           usedMethod = new Method2();
       }else{
           System.out.println("Cette méthode n'éxiste pas !!!");
           return null;
       }
    return usedMethod;

    }
}