import java.io.BufferedReader;
import java.io.FileReader;

public class OpenFile {

	private BufferedReader br;

	public OpenFile(String filename) {

		try {

			FileReader fr =
				new FileReader(filename);

			br =
				new BufferedReader(fr);

		}
		catch(Exception e) {

			e.printStackTrace();

		}

	}

	public BufferedReader getReader() {

		return br;

	}
}