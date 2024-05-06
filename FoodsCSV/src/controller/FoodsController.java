package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoodsController implements IFoodsController {

	public FoodsController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void readFile(String path, String nome) throws IOException {
		File arq = new File(path, nome);
		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				if (linha.contains("Fruits")) {
					String name = linha.split(",")[0];
					String scientificName = linha.split(",")[1];
					String subGroup = linha.split(",")[3];
                System.out.println(name + "\t" + scientificName + "\t" + subGroup);
				}
                linha = buffer.readLine();
            }
			buffer.close();
			leitor.close();
			fluxo.close();
		}else {
            System.out.println("Arquivo Invalido");
        }

	}
}
