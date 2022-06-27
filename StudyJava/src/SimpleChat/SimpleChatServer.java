package SimpleChat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SimpleChatServer extends JFrame {
	private JLabel lblStatus;
	private JTextArea ta;
	private JTextField tf;
	
	private Socket socket;
	private ServerSocket serverSocket;
	
	private DataInputStream dis;
	private DataOutputStream dos;
	
	private boolean stopSignal; // 멀티쓰레드 종료 여부 저장

	
	public SimpleChatServer() {
		showFrame();
	}
	
	public void showFrame() {
		setTitle("1:1 채팅 서버"); // 프레임 제목표시줄 텍스트 설정
		setBounds(400, 400, 500, 300); // x좌표, y좌표, 가로크기, 세로크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼 기본 기능 설정(프로그램 종료)
		
		// 채팅창(프레임)의 상단(BorderLayout 의 NORTH 영역)에 상태표시창 표시
		lblStatus = new JLabel("클라이언트 연결 상태 : 없음");
		lblStatus.setFont(new Font("맑은 고딕", Font.ITALIC, 14));
		add(lblStatus, BorderLayout.NORTH);
		
		// 채팅 메세지를 표시할 JTextArea 생성 및 CENTER 영역에 표시
		ta = new JTextArea();
		ta.setEditable(false); // 텍스트 입력 금지
		ta.setBackground(Color.LIGHT_GRAY);
		add(ta, BorderLayout.CENTER);
		
		// 채팅 메세지를 입력할 JTextField 생성 및 SOUTH 영역에 표시
		tf = new JTextField();
		tf.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		add(tf, BorderLayout.SOUTH);
		
		// 텍스트필드에서 엔터키 입력 시 동작하는 이벤트 처리 - ActionListener 인터페이스 활용
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 입력받은 메세지 전송을 수행할 sendMessage() 메서드 호출
				sendMessage();
			}
		});
		
		setVisible(true); // 프레임 화면에 표시
		
		tf.requestFocus(); // 텍스트필드에 커서 요청
		
		startService();
	}
	
	// 채팅 서비스를 수행하는 startService() 메서드 정의
	public void startService() {
		
		try {
			ta.append("채팅 서비스 준비중...\n");
			
			int port = 60000;
			serverSocket = new ServerSocket(port);
			ta.append("서비스 준비 완료!\n");
			
			ta.append("클라이언트 접속 대기중...!\n");
			socket = serverSocket.accept();
			ta.append("클라이언트가 접속하였습니다.(" + socket.getInetAddress() + ")\n");
			
			lblStatus = new JLabel("클라이언트 연결 상태 : 연결됨(" + socket.getInetAddress() + ")");
			
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			
			receiveMessage();
			
			
//			new Thread(new Runnable() {
//				@Override
//				public void run() {
//					receiveMessage();
//				}
//			}).start();
		} catch (EOFException | SocketException e) {
			ta.append("클라이언트로부터 접속이 해제되었습니다!");
			try {
				dis.close();
				dos.close();
				socket.close();
				
				stopSignal =true;
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void receiveMessage() {
			new Thread(new Runnable() {
				@Override
				public void run() {
				
					try {
						while (true) {
							String msg = dis.readUTF();
							ta.append("클라이언트 :" + msg + "\n");
						}
					}catch (EOFException | SocketException e) {
							ta.append("클라이언트로부터 접속이 해제되었습니다!");
							try {
								dis.close();
								dos.close();
								socket.close();
								
								stopSignal =true;
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}).start();
	}
	
	// 입력받은 메세지 전송을 수행하는 sendMessage() 메서드 정의
	public void sendMessage() {
		    // 입력받은 메세지(JTextField 객체의 입력값)를 가져오기
		try {
			String msg = tf.getText();
			//System.out.println("서버 : " + msg);
			// 입력받은 메세지를 텍스트에어리어에 출력
			ta.append(msg + "\n");
			
			
			dos.writeUTF(msg);
			// 입력된 메세지를 클라이언트에게 전송
			
			// 텍스트필드 입력값 초기화 및 커서 요청
			tf.setText("");
			tf.requestFocus();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new SimpleChatServer();
	}

}













