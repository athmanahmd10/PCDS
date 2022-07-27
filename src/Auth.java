import java.net.HttpURLConnection;
import java.net.URL;
import java.io.DataOutputStream;


public class Auth {
    private boolean found= false;
    
    public boolean authentificate(String vLogin,String vPassword){
        try {
            URL url = new URL("http://localhost:8080/page0.php");
            String postData = "foo1="+vPassword+"&foo2="+vLogin;
 
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            // conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
             conn.setRequestProperty("Content-Length", Integer.toString(postData.length()));
            // conn.setUseCaches(false);

            try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
                dos.writeBytes(postData);
            }

            int myResponse = conn.getResponseCode();
            // System.out.println("Password > "+ myResponse);
            if(myResponse == 308){
                System.out.println("Les identifiants de connexion");
                System.out.println("Login > "+ vLogin);
                System.out.println("Password > "+ vPassword);
                found =true;
            }else{
                found =false;
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return found;
    }
        
    }
    