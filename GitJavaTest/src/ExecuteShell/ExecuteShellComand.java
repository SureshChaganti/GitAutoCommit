package ExecuteShell;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExecuteShellComand {

	public static void main(String[] args) {

		ExecuteShellComand obj = new ExecuteShellComand();

		// in mac oxs

		String pwd="pwd";
		String add_command = "git add .";
		String commit_command = "git commit -m py.png";
		String push_command = "git push";

		// in windows
		// String command = "ping -n 3 " + domainName;

	//	obj.executeCommand(git_dir);
		obj.executeCommand(pwd);
		 String add_output =
		obj.executeCommand(add_command);
		 String commit_output =
		obj.executeCommand(commit_command);
		 String push_output =
		obj.executeCommand(push_command);

		 System.out.println(add_output);
		 System.out.println(commit_output);
		System.out.println("Commit Completed");
		 System.out.println(push_output);

	}

	private String executeCommand(String command) {

		StringBuffer output = new StringBuffer();

		System.out.println(command);
		
		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			Thread.sleep(1000);
			 BufferedReader reader =
			 new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			 String line = "";
			 while ((line = reader.readLine())!= null) {
			 output.append(line + "\n");
			 }
			 
			 

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception caught");
		}
		System.out.println(output);
		return output.toString();

	}

}