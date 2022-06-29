package socket_programming;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex4Client {
	
	public static void main(String[] args) {
		Socket socket =null;
		
		String host = "localhost";
		int port = 60000;
		
		
		try {
			socket = new Socket(host,port);
			System.out.println("서버 접속 완료!");
			
			// 서버로부터 전송되는 Person 객체를 수신하기 위해 입력스트림 필요
			// => 해당 입력스트림과 객체 입력에 사용될 ObjectInputStream 연결
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			
			Object o = ois.readObject();
			
			if(o instanceof Person) {
				Person p = (Person)o; // 다운캐스팅
				System.out.println("Person 객체주소:" + p.hashCode());
				System.out.println("이름 :" + p.name);
				System.out.println("나이 :" + p.age);
				System.out.println("주민번호 :" + p.jumin);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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
