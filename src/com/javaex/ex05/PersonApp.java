package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class PersonApp {

	public static void main(String[] args) throws IOException {
		List<Person> personList = new ArrayList<Person>();
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
			personList.add(new Person(name, hp, company));

			System.out.println("Name - " + name);
			System.out.println("Hp - " + hp);
			System.out.println("Company - " + company);

			System.out.println("----------------------------------");
		}

		br.close();

//////////////////////////////////////////////////////////////////////////////////////

		OutputStream out = new FileOutputStream("C:\\JavaStudy\\file\\PhoneDB01.txt");
		OutputStreamWriter ow = new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(ow);

		for (Person p : personList) {
			bw.write(p.showInfo());
		}

		String self = "김태석, 010-7117-7350,02-1234-5678";
		String[] me = self.split(",");
		String myname = me[0];
		String myhp = me[1];
		String mycompany = me[2];

		System.out.println("Name - " + myname);
		System.out.println("Hp - " + myhp);
		System.out.println("Company - " + mycompany);

		System.out.println("----------------------------------");

		bw.write(self);

		bw.close();

	}

}