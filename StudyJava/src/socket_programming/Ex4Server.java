package socket_programming;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex4Server {

	public static void main(String[] args) {
		Socket socket = null;
		ServerSocket serverSocket = null;
		
		Person p = new Person("홍길동", 20, "901010-1234567");
		System.out.println("Person 객체 =" + p.hashCode());
		
		// 서버측에서 60000번 포트를 사용하여 서버소켓 객체생성
		
		int port = 60000;
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("소켓 생성 완료 -"+ port );
			
			socket = serverSocket.accept();
			System.out.println("클라이언트와 소켓 연결 완료 -" + socket.getInetAddress());
			
			// 1. 출력을 위한 출력스트림 가져오기
//			OutputStream os = socket.getOutputStream();
			
			// 2. ObjectOutputStream 객체 생성
			// = 출력스트림에 객체를 출력할 ObjectOutputStream 연결
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			
			oos.writeObject(p);
			
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
