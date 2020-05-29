package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	// InputStream에서 파일을 하나 지정하여 OutputStream을 통하여
	// 지정된 이름으로 파일을 복사하여 새로 생성합니다.

	// try{} catch(){}를 사용하여 코드를 짜야하지만 아직은 그렇게까지 하기엔 어려움이 있으므로
	// throws IOException을 사용하여 오류가 나면 던져버리는 방식으로 코드를 작성합니다.
	public static void main(String[] args) throws IOException {

		// <InputSteam>을 사용하여 파일 정보를 입력받습니다.
		// 빨대(주 스트림) 위에 BufferedInputStream이라는 필터(보조 스트림)을 사용하여 텍스트를 작성합니다.
		InputStream in = new FileInputStream("C:\\JavaStudy\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);

		// <OutputStream>을 사용하여 파일을 생성합니다.
		OutputStream out = new FileOutputStream("C:\\JavaStudy\\file\\bytebuff1.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);

		System.out.println("Copy start");

		// 데이터를 전송받아 저장하는 방식을 반복하여 모든 데이터를 전송 받으면 -1을 반환합니다.
		// data == -1 을 사용하여 모든 데이터를 전송 받았을 시 자동으로 break 합니다.
		while (true) {
			int data = bin.read();
			if (data == -1) {
				System.out.println("Copy End" + data);
				break;
			}

			// 받아온 파일을 복사하여 사용자가 지정한 이름으로 생성합니다.
			bout.write(data);
		}

		bout.close();
		bin.close();
	}

}
