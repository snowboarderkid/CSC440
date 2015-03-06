import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class ResponseThread extends Thread
{
	private Socket s;
	
	public ResponseThread(Socket s)
	{
		this.s = s;
	}
	
	public void run()
	{
		
		try 
		{
			//Scanner input = new Scanner(this.s.getInputStream());
			//String req = input.nextLine();
			//System.out.println(req);
			PrintWriter output = new PrintWriter(s.getOutputStream());
			output.println(s.getInputStream());
			output.flush();
			output.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
