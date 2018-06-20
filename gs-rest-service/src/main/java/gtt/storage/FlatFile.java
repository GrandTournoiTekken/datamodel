package gtt.storage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlatFile {

	public static final String fileSeparator = System.getProperty("file.separator");
	public static final String filePath = System.getProperty("user.dir") + fileSeparator + "storage" + fileSeparator + "data.txt";
	public static final File file = new File(filePath);
	private static final Logger log = LoggerFactory.getLogger(FlatFile.class);

	protected FlatFile() {
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Erreur: impossible de créer le fichier");
			System.out.println(e);
		}
	}

	public void save(Object obj) {
		try {
			log.info("Ecriture sur : " + filePath);
			FileWriter writer = new FileWriter(file);
			writer.write(obj.toString());
			writer.flush();
			writer.close();
			writer = null;
		} catch (IOException e) {
			log.error("Erreur: impossible d'écrire dans le fichier");
			e.printStackTrace();
		}
	}
}