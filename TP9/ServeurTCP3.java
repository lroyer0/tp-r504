import java.net.*;
import java.io.*;

public class ServeurTCP3 {
    public static void main(String[] args) {
        try {
            ServerSocket socketserver = new ServerSocket(2016);
            
            while(true) {
                System.out.println("serveur en attente");
                Socket socket = socketserver.accept();
                System.out.println("Connexion d'un client");
                DataInputStream dIn = new DataInputStream(socket.getInputStream());
                DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
                String message = dIn.readUTF();
                System.out.println("Message reçu : " + message);
                String rev = new StringBuilder(message).reverse().toString();
                dOut.writeUTF(rev);
                
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
