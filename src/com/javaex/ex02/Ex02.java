package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	// 사용자가 지정한 텍스트 파일을 불러와 출력하는 코드입니다.

	// try{} catch(){}를 사용하여 코드를 짜야하지만 아직은 그렇게까지 하기엔 어려움이 있으므로
	// throws IOException을 사용하여 오류가 나면 던져버리는 방식으로 코드를 작성합니다.
	public static void main(String[] args) throws IOException {

		// <BufferedReader>를 사용하여 텍스트 파일을 불러들여 출력하는 코드입니다.
		Reader fr = new FileReader("C:\\JavaStudy\\file\\MS949.txt");
		BufferedReader br = new BufferedReader(fr);

		// 빨대(주 스트림) 위에 BufferedReader라는 필터(보조 스트림)을 사용하여 텍스트를 출력합니다.
		// [사용자지정이름].readline을 사용하여 한 줄씩 읽어 실행합니다.
		// str == null --> 더 이상 읽어들일 문자가 없으면 null값을 출력합니다.
		// 따라서 null값을 출력하면 while문을 break합니다.
		System.out.println("읽기를 시작합니다.");
		while (true) {
			String str = br.readLine();
			if (str == null) {
				System.out.println("읽기를 종료합니다. [ " + str + " ]");
				break;
			}

			System.out.println(str);
		}

		// 주 스트림에 필터(보조스트림)을 장착하였기 때문에 보조 스트림을 close()하면 주 스트림도 자동으로 close()가 적용됩니다.
		// 빨대 꽂은 그림을 그려서 눈으로 확인해보면 이해하기 수월합니다.
		br.close();

	}

}
