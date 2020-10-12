import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Client{
    public static void main(String[] args){
	try{
	    Socket socket = new Socket("--------",-----);//サーバー側のIPアドレスとポート番号を指定してソケット接続します
	    BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//ストリーム作成
	    String message = reader.readLine();
	    System.out.println("頼まれたメニューは" + message);
	    reader.close();
	}catch(IOException e){
	    System.out.println(e);
	}
    }
}
