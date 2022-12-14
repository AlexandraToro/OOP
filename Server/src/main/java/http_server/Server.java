package http_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Server {
    private static final String www="C:\\Users\\Otomi\\Desktop\\Learning\\Programming\\courseJava\\seminarOOA\\www";

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)){
            for(;;) {
                try(Socket socket = serverSocket.accept()) {
                    System.out.println("Client connected");
                    BufferedReader reader = new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream(), StandardCharsets.UTF_8));

                    PrintWriter writer = new PrintWriter(
                            socket.getOutputStream());

                    while (!reader.ready()) ;

                    String[] str = {"","",""};
                    if(reader.ready()){
                        str = reader.readLine().split(" ");
                    }

                    while (reader.ready()){
                        System.out.println(reader.readLine());
                    }
                    Path path = Path.of(www, str[1]);
                    if (Files.exists(path) && !Files.isDirectory(path)) {
                        writer.println("HTTP/1.1 200 OK");
                        writer.println("Content-Type: text/html; charset=utf-8");
                        writer.println();
                        try (BufferedReader br = Files.newBufferedReader(path)){
                            br.transferTo(writer);
                        }
                        writer.flush();
                        continue;
                    }
                    writer.println("HTTP/1.1 404 OK");
                    writer.println("Content-Type: text/html; charset=utf-8");
                    writer.println();
                    writer.println("<h1> file not found </h1>");
                    writer.flush();
                    }
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
