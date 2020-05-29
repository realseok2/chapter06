package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Homework {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\JavaStudy\\file\\PhoneDB.txt");
		InputStreamReader ir = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(ir);

		while (true) {
			String str = br.readLine();

			if (str == null) {
				break;
			}

			String[] info = str.split(",");
			String name = info[0];
			String hp = info[1];
			String company = info[2];

			System.out.println("Name - " + name);
			System.out.println("Hp - " + hp);
			System.out.println("Company - " + company);

			System.out.println("----------------------------------");

		}

		br.close();

	}

}
