package view;

import java.io.IOException;

import controller.FoodsController;
import controller.IFoodsController;

public class Main {

	public static void main(String[] args) {
		IFoodsController arq = new FoodsController();
		String path = "C:\\temp";
		String nome = "generic_food.csv";
		
		try {
			arq.readFile(path,nome);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
