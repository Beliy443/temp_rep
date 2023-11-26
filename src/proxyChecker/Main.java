package proxyChecker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("ip.txt");
            int i;
            String socket = "";
            while ((i=fis.read()) != -1){
                if(i == 13) continue;
                else if (i == 10) {
                    String ip = socket.split("\t")[0];
                    int port = Integer.parseInt(socket.split("\t")[1]);
                    System.out.println("Проверяю - "+ip+":"+port);
                    checkProxy(ip, port);
                    socket = "";
                }else{
                    socket += (char) i;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkProxy(String ip, int port){
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://google.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);
            int responseCode = connection.getResponseCode();
            System.out.println(responseCode);
        } catch (Exception e) {
            System.out.println("Не работает");
        }
    }
}