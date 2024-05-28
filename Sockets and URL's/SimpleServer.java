import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        try {
            // Create a server socket on port 12345
            serverSocket = new ServerSocket(12345);
            System.out.println("Server started. Waiting for clients...");

            // Accept a client connection
            clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            // Create input and output streams to communicate with the client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read and echo messages from the client
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Received from client: " + message);
                out.println("Echo: " + message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (clientSocket != null) clientSocket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
