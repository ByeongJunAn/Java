package Day27;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutput {

	public static void main(String[] args) {

		SBox box1 = new SBox("ROBOT", "1234");
		SBox box2 = new SBox("APPLE", "5678");

		try (ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("Object.bin"))) {
			oo.writeObject(box1);
			oo.writeObject(box2);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
