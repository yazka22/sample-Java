import java.net.*;
import java.io.*;

public class DataClient {
    public static void main(String[] args) throws IOException {
        InetAddress adresa = InetAddress.getByName("127.0.0.1");
        int port = 8000;
        DatagramSocket socket = null;
        DatagramPacket packet = null;
        byte buf[];
        try {
            socket = new DatagramSocket();
            buf = "Test".getBytes();
            packet = new DatagramPacket(buf, buf.length, adresa, port);
            socket.send(packet);
            buf = new byte [256];
            packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            System.out.println(new String(packet.getData()));
        } finally {
            if(socket !=null) socket.close();
        }
    }
}