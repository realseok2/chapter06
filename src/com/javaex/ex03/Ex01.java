package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex01 {

	// 사용자가 지정한 텍스트 파일을 불러와 출력하는 코드입니다.

	// try{} catch(){}를 사용하여 코드를 짜야하지만 아직은 그렇게까지 하기엔 어려움이 있으므로
	// throws IOException을 사용하여 오류가 나면 던져버리는 방식으로 코드를 작성합니다.
	public static void main(String[] args) throws IOException {

		// <BufferedReader>를 사용하여 텍스트 파일을 불러들여 출력하는 코드입니다.
		// "MS949"를 작성함으로써 해당 파일의 코드를 입력해줍니다.
		InputStream in = new FileInputStream("C:\\JavaStudy\\file\\MS949.txt");
		InputStreamReader ir = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(ir);

		// 빨대(주 스트림) 위에 BufferedReader라는 필터(보조 스트림)을 사용하여 텍스트를 출력합니다.
		// [사용자지정이름].readline을 사용하여 한 줄씩 읽어 실행합니다.
		// str == null --> 더 이상 읽어들일 문자가 없으면 null값을 출력합니다.
		// 따라서 null값을 출력하면 while문을 break합니다.
		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			System.out.println(str);
		}

		br.close();

	}

}
