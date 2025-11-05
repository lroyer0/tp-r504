import java.io.*;
import java.net.*;

public class serveurUDP
{
	public static void main(String[] args) throws  Exception
	{
		DatagramSocket sock = new DatagramSocket(8080);
		System.out.println("Serveur UDP en écoute sur le port 8080...");
		byte[] buffer = new byte[1024];
		while (true)
		{
			System.out.println("-Waiting data" );
			DatagramPacket packet = new DatagramPacket(new byte [1024], 1024);
			sock.receive(packet);
			String str = new String(packet.getData() );
			byte[] responseData = str.getBytes();
			System.out.println( "str=" + str );
		}
	}
}
