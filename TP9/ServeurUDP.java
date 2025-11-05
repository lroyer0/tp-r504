import java.io.*;
import java.net.*;

public class ServeurUDP {
	public static void main(String[] args) throws  Exception
	{

		DatagramSocket sock = new DatagramSocket(8080);
		System.out.println("Serveur UDP en écoute sur le port 8080...");
		byte[] buffer = new byte[1024];
		while (true)
		{
			System.out.println("-Waiting data" );
			DatagramPacket packet = new DatagramPacket(new byte [1024];




			socket.receive(receivePacket);
			String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
			byte[] responseData = message.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(
				responseData, 
				responseData.length, 
				receivePacket.getAddress(), 
				receivePacket.getPort()
			);
			socket.send(sendPacket);

			e.printStackTrace();
		}
	}
}
