import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//172.31.238.44

public class Driver 
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(1234);
		while(true)
		{
			System.out.println("Waiting....");
			Socket connection = ss.accept();
			ResponseThread rt = new ResponseThread(connection);
			System.out.println("Connected!");
			rt.start();
		}
	}
}
