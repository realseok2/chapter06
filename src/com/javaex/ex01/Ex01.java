package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	// try{} catch(){}를 사용하여 코드를 짜야하지만 아직은 그렇게까지 하기엔 어려움이 있으므로
	// throws IOException을 사용하여 오류가 나면 던져버리는 방식으로 코드를 작성합니다.
	public static void main(String[] args) throws IOException {

		// <InputSteam>을 사용하여 파일 정보를 입력받습니다.
		// <OutputStream>을 사용하여 파일을 생성합니다.
		InputStream in = new FileInputStream("C:\\JavaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\JavaStudy\\file\\buff.jpg");

		byte[] buff = new byte[1024];

		System.out.println("Copy Start.");
		while (true) {
			int data = in.read(buff);

			// 데이터를 전송받아 저장하는 방식을 반복하여 모든 데이터를 전송 받으면 -1을 반환합니다.
			// data == -1 을 사용하여 모든 데이터를 전송 받았을 시 자동으로 break 합니다.
			if (data == -1) {
				System.out.println("Copy End." + data);
				break;
			}

			// 받아온 파일을 복사하여 사용자가 지정한 이름으로 생성합니다.
			out.write(buff);
		}

		out.close();
		in.close();

	}

}
