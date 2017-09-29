package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserFunction implements Serializable {

	public static List<Users> users = new ArrayList();

	public static void save_list() {

		File file = new File("user_data.ser");
		try {

			file.createNewFile();
			FileOutputStream fout = new FileOutputStream(file);
			ObjectOutputStream obj_fout = new ObjectOutputStream(fout);
			obj_fout.writeObject(users);
			obj_fout.close();

		} catch (Exception e)
		
		{

			e.printStackTrace();
		}

	}

	public static boolean add_user(String username, String password, String type) {
		try {
			
			users.add(new Users(username, password, type));

		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static boolean authenticate(String username, String password) {

		for (Users i : users) {
			if (i.username.equals(username) && i.password.equals(password)) {
				
				return true;

			}
		}

		return false;

	}

	@SuppressWarnings("unchecked")
	public static void load_list() {
		try {
			File temp = new File("user_data.ser");
			FileInputStream fin = new FileInputStream(temp);
			if (temp.exists())
			System.out.println(temp.getAbsolutePath());
			ObjectInputStream obj_fin = new ObjectInputStream(fin);
			users = (List<Users>) obj_fin.readObject();
			
			obj_fin.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
