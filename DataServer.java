import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DataServer {
    public static final int srvPort = 8000;
    private DatagramSocket socket = null;
    DatagramPacket cerere, raspuns = null;

    public void start() throws IOException{
        socket = new DatagramSocket(srvPort);
        try {
            while(true) {
                byte[] buf = new byte[256];
                cerere = new DatagramPacket(buf, buf.length);
                
                System.out.println(" Listening on port "+srvPort);
                socket.receive(cerere);
                InetAddress adresa = cerere.getAddress();
                int port = cerere.getPort();

                String mesaj = "Hai " + new String (cerere.getData());
                buf = mesaj.getBytes();
                System.out.println(new String(buf));
                raspuns = new DatagramPacket(buf, buf.length, port);
                socket.send(raspuns);
            }
        } finally {
            if(socket!=null) socket.close();
        }
    }

    public static void main(String[] args) throws IOException {
        new DataServer().start();
    }
}