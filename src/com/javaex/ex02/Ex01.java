package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	// 사용자가 작성한 내용을 토대로 .txt 파일을 지정된 장소에 생성하는 코드입니다.

	// try{} catch(){}를 사용하여 코드를 짜야하지만 아직은 그렇게까지 하기엔 어려움이 있으므로
	// throws IOException을 사용하여 오류가 나면 던져버리는 방식으로 코드를 작성합니다.
	public static void main(String[] args) throws IOException {

		// <BufferedWriter>를 사용하여 텍스트 파일을 생성하는 코드입니다.
		Writer fw = new FileWriter("C:\\JavaStudy\\file\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		// 빨대(주 스트림) 위에 BufferedWriter라는 필터(보조 스트림)을 사용하여 텍스트를 작성합니다.
		// [사용자지정이름].newline을 사용하여 줄바꿈을 실행합니다.
		// Witer는 새로운 문자를 계속하여 입력받아야 하기 떄문에 for문 등을 사용할 수 없습니다.
		// 따라서 .write와 .newline을 반복 사용하여 코드를 짜야합니다.
		bw.write("학교종이 땡땡땡");
		bw.newLine();
		bw.write("어서모이자~~");
		bw.newLine();
		bw.write("선생님이 우리들");
		bw.newLine();
		bw.write("기다리신드아아앙~");
		bw.newLine();

		// 주 스트림에 필터(보조스트림)을 장착하였기 때문에 보조 스트림을 close()하면 주스트림도 자동으로 close()가 적용됩니다.
		// 빨대 꽂은 그림을 그려서 눈으로 확인해보면 이해하기 수월합니다.

		bw.close();

	}

}
