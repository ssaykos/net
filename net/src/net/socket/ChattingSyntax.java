package net.socket;
/*
 	 다자간 채팅
 	 1. 서버
 	 - 병행 처리를 위한 client 객체 생성 ( 사용자 정의 클래스)
 	 - Vector 에 생성된 client 객체 추가 ( 객체 카운트)
 	 -각각의 client에 대한 thread 객체 생성
 	 - 스레드 시작
 	 - run() 메서드에서 호출명 을 읽어 txt에 출력 
 	 - 각각의 클라이언트 에게 접속된 사용자 이름을 보냄 : 브로드 케스트
 	 - 모든 사용자에게 대화 내용을 전송
 	 2. 클라이언트
 	 - 본인의 이름을 서버에 전송
 	 - 서버로부터 받은 호출명을 출력화면에 보여줌
 	 -input 창을 통해 대화전송
 */
public class ChattingSyntax {

}