package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

public class LeitorJson {
	static Map<String, String> mapJson = new HashMap<String, String>(); // Criação do mapa
	static Gson gson = new Gson(); // biblioteca do google para manipular arquivos Json
	static Reader reader;

	public static void main(String[] args) throws FileNotFoundException {
		reader = new FileReader("./src/main/resources/MassaTeste.json");
		mapJson = gson.fromJson(reader, Map.class);
		System.out.println(mapJson.get("nome"));
		System.out.println(mapJson.get("cor"));
		System.out.println(mapJson.get("produto"));

		// TODO Auto-generated method stub

	}

}
