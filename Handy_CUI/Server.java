import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Server{
    static List<String> a = new ArrayList<>();
    public static List<String> server_handy(List<String> menu_name){
	try{
	    ServerSocket serverSocket = new ServerSocket(---);//5000番ポートでソケットを作成する
	    while(true){
		Socket socket = serverSocket.accept();//クライアントから接続要求を待つ
		PrintWriter writer = new PrintWriter(socket.getOutputStream());//ストリーム作成
		writer.println(menu_name);//ストリームに送信する
		writer.close();
	    }
	}catch(IOException e){
	    System.out.println(e);
	}
	return a;
    }
}
		
