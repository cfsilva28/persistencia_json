package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

public class LeitorJson {
	static Map<String, String> mapJson = new HashMap<String, String>(); // Criação do mapa
	static Gson gson = new Gson(); // biblioteca do google para manipular arquivos Json
	static Reader reader;

	public static void main(String[] args) throws IOException {
		gravaArquivoJson();
		lerArquivoJson();

	}

	public static void gravaArquivoJson() throws IOException {
		mapJson.put("url", "http://www.amazon.com");
		mapJson.put("product", "drone");
		mapJson.put("color", "black");
		mapJson.put("value", "expensive");

		FileWriter writer = new FileWriter("./src/main/resources/MassaTeste_writer.json");
		gson.toJson(mapJson, writer);
		writer.flush();

	}

	public static void lerArquivoJson() throws FileNotFoundException {
		reader = new FileReader("./src/main/resources/MassaTeste.json");
		mapJson = gson.fromJson(reader, Map.class);
		System.out.println(mapJson.get("nome"));
		System.out.println(mapJson.get("cor"));
		System.out.println(mapJson.get("produto"));

	}

}
