import java.util.*;



public class Method1 extends Hacker{

  private String myCombinaison = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHJKLMNOPQRSTUVWXYZ0123456789@$#&*-");
  private char[] currentPassword = new char[8];
  private boolean foundLogin= false;
  public String vLogin;
  private Date beginDate;
  private Date finalDate;
  
  Auth user = new Auth();
  Scanner sc = new Scanner(System.in);
  
  public void searchPassword(){

     if(foundLogin == false){
      System.out.print("Saisir le login de l'utilisateur > ");
      vLogin = sc.nextLine();
      foundLogin=true;
     }
      
      boolean foundPassword= false;
      System.out.println("En recherche .....");
      beginDate = new Date();
      for(int i=0; i<myCombinaison.length(); i++){
          if(foundPassword)
            break;
          
           currentPassword[0] = myCombinaison.charAt(i);

          for(int ii=0; ii<myCombinaison.length(); ii++){
              if(foundPassword)
              break;

            currentPassword[1] = myCombinaison.charAt(ii);

            String str2 = new String(currentPassword, 0, 2);

            foundPassword = user.authentificate(vLogin, str2);

            if(foundPassword){
              break;
            }
              
              
              for(int iii=0; iii<myCombinaison.length(); iii++){
                  if(foundPassword)
                  break;

                  currentPassword[2] = myCombinaison.charAt(iii);

                  String str3 = new String(currentPassword, 0, 3);
   
                  foundPassword = user.authentificate(vLogin, str3);

                    if(foundPassword){
                    break;
                    }

                  for(int k=0; k<myCombinaison.length(); k++){
                      if(foundPassword)
                      break;


                      currentPassword[3] = myCombinaison.charAt(k);

                      String str4 = new String(currentPassword, 0, 4);
                      
                      
                      foundPassword = user.authentificate(vLogin, str4);

                        if(foundPassword){
                        break;
                        }

                      for(int kk=0;  kk<myCombinaison.length(); kk++){
                          if(foundPassword)
                          break;

                          currentPassword[4] = myCombinaison.charAt(kk);

                          String str5 = new String(currentPassword, 0, 5);
          
                          foundPassword = user.authentificate(vLogin, str5);

                            if(foundPassword){
                            break;
                            }

                          for(int kkk=0; kkk<myCombinaison.length(); kkk++){
                              if(foundPassword)
                              break;

                              currentPassword[5] = myCombinaison.charAt(kkk);

                              String str6 = new String(currentPassword, 0, 6);
              
                              foundPassword = user.authentificate(vLogin, str6);

                              if(foundPassword){
                                break;
                              }

                            
                          }
                      }
                  }
                }

          }
      }
      if(foundPassword){
        finalDate = new Date();
        long duree = finalDate.getTime() - beginDate.getTime();
          timer(duree);
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