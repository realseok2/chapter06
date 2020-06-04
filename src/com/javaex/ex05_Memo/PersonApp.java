package com.javaex.ex05_Memo;

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
		}

		br.close();

		// 출력
		for (Person p : personList) {
			System.out.println("Name-" + p.getName() + ",  Hp-" + p.getHp() + ",  Company-" + p.getCompany());
		}

//////////////////////////////////////////////////////////////////////////////////////

		OutputStream out = new FileOutputStream("C:\\JavaStudy\\file\\PhoneDB01.txt");
		OutputStreamWriter ow = new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(ow);

		personList.add(new Person("유재석", "01-1123", "324-2342"));

		for (Person p : personList) {
			System.out.println(p.getName() + "," + p.getHp() + "," + p.getCompany());
			
			bw.write(p.getName() + "," + p.getHp() + "," + p.getCompany());
			bw.newLine();
			bw.flush();
		}
		bw.close();

	}

}