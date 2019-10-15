package com.idat.Semana_02.utilidades;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Instant;

public class utilidades {

	public String uploadImage(InputStream iStream, String extension) {
		long startTime = Instant.now().toEpochMilli();
		String path = "C:\\imagen\\" +startTime + "." + extension;
		System.out.println(path);
		if(saveImageInDirectory(iStream, path)) {
			return startTime + "." + extension;
		}
		return null;
	}
	
	private boolean saveImageInDirectory(InputStream in, String path) {
		OutputStream os;
		try {
			os = new FileOutputStream(new File(path));
			byte[] buffer = new byte[1024];
			int bytes = 0;
			while ((bytes = in.read(buffer)) != -1) {
				os.write(buffer, 0, bytes);
			}
			os.close();
			in.close();
			return true;
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
			return false;
		}
	}
	
}
