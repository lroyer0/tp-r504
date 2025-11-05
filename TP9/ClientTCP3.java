import java.net.*;
import java.io.*;

public class ClientTCP3 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 2016);
            DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
            DataInputStream dIn = new DataInputStream(socket.getInputStream());
            dOut.writeUTF(args[0]);
            String response = dIn.readUTF();
            System.out.println("Réponse du serveur : " + response);
            
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
