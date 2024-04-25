// package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

public class Main extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Read data from the request body
        StringBuilder dataBuilder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            dataBuilder.append(line);
        }
        reader.close();

        String data = dataBuilder.toString();
        System.out.println("Received data from client: " + data);

        // Send a simple response (optional)
        response.setContentType("text/plain");
        response.getWriter().println("Data received successfully!");
    }
}
