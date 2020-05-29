package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Homework {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\JavaStudy\\file\\PhoneDB01.txt");
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

		OutputStreamWriter ow = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(ow);

		String self = "김태석, 010-7117-7350,02-1234-5678";
		String[] me = self.split(",");
		String myname = me[0];
		String myhp = me[1];
		String mycompany = me[2];

		System.out.println("Name - " + myname);
		System.out.println("Hp - " + myhp);
		System.out.println("Company - " + mycompany);

		System.out.println("----------------------------------");

		bw.close();
	}

}
