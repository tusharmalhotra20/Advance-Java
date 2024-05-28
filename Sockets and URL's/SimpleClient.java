import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            // Connect to the server on localhost at port 12345
            socket = new Socket("localhost", 12345);
            System.out.println("Connected to server.");

            // Create input and output streams to communicate with the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Send a message to the server
            out.println("Hello, Server!");

            // Read and print the server's response
            String response = in.readLine();
            System.out.println("Received from server: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
