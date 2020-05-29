package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		// System.in
		InputStreamReader ir = new InputStreamReader(System.in, "UTF-8");
		BufferedReader br = new BufferedReader(ir);

		String str = br.readLine();
		// Scanner sc =new Scanner(System.in);
		// String str =sc.nextLine();

////////////////////////////////////////////////////////////////////////////////////////////

//		System.out.println(str);

		// System.out
		OutputStreamWriter ow = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(ow);

		bw.write(str);

		br.close();
		bw.close();

	}

}
