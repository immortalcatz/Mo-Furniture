package util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


import main.mofurniture;

public class Update_Checker {

	private static final String UPDATE_URL = "https://www.dropbox.com/s/2t7mmtmhq99qyc7/Update_MoFurniture.txt?dl=1";

	private static boolean newVersionAvailable = false;

	
	public static void checkForUpdates() {
		new Thread("Update-Checker") {
			
			public void run() {
				try {
					URL url = new URL(UPDATE_URL);
					Scanner scanner = new Scanner (url.openStream());
					String latestVersion = scanner.nextLine();
					scanner.close();
					
					if (!mofurniture.VERSION.equals(latestVersion)) {
						setNewVersionAvailable();
					}
				} catch (MalformedURLException e) {
					System.err.println("Url falsch");
				} catch (IOException e) {
					e.printStackTrace();
				}
			};
			
		}.start();
		
	}
	
	private static synchronized void setNewVersionAvailable() {
		newVersionAvailable = true;
		
		
	}
	
	public static synchronized boolean isNewVersionAvailable() {
		return newVersionAvailable;
		
	}
	
}
