package kiosk;

import java.util.ArrayList;

import java.util.*;

public class NewScreen extends Screen{
	   static int number = 0;
	   static int num3;
	   Scanner sc = new Scanner(System.in);
	   Text   txt1 = new Text("Milk Tea");       Title tit1 = new Title("��ø� ��ٷ��ּ���.");
	   Text   txt2 = new Text("Drink");      Title tit2 = new Title("���ִ� ������ �ֹ��Ǿ����ϴ�.");
	   Text   txt3 = new Text("Bread");      Title txt4 = new Title("TOPPING�� �߰��ϰڽ��ϱ�?");
	   Bar      bar = new Bar();
	   Title tit = new Title("������");
	    
	   public NewScreen() {                    //�޴���,(�̸�,����)(�����̸�,����)
	      //         <MENU>                              <TOPPING'S MENU>
	      Array.add("mnu:����ũƼ:1500 => 0");         ArrayTopping.add("mnu: ��         =>500 =>   0");
	      Array.add("mnu:��׷��̹�ũƼ:3500 => 1");         ArrayTopping.add("mnu: ���ڳ�    =>500=>    1");
	      Array.add("mnu:�ڽ��� �׸���ũƼ  : 3500 => 2");         ArrayTopping.add("mnu: �˷ο�    =>500=>    2");
	      Array.add("mnu:Ÿ�ι�ũƼ: 2500 => 3");         ArrayTopping.add("mnu: ȭ��Ʈ�� =>500=>    3");
	      Array.add("mnu:���� �׸���ũƼ: 5500 => 4");         ArrayTopping.add("mnu: �߰� ����         =>    4");
	                                          //      <TOPPING'S Price>
	      Array.add("mnu:�ڸ��꽺   : 10000 => 5");         ArrayToppingPrice.add(500);
	      Array.add("mnu:�������꽺: 9000  => 6");         ArrayToppingPrice.add(500);
	      Array.add("mnu:���� �꽺  : 10000 => 7");         ArrayToppingPrice.add(500);
	      Array.add("mnu:�丶���꽺: 7000  => 8");         ArrayToppingPrice.add(500);
	      Array.add("mnu:���� �꽺  : 15000 => 9");         ArrayToppingPrice.add(0);
	      
	      Array.add("mnu:��ũ������: 30000 => 10");
	      Array.add("mnu:��������   : 35000 => 11");
	      Array.add("mnu:��������   : 37000 => 12");
	      Array.add("mnu:������ġ   : 25000 => 13");
	      Array.add("mnu:�� �� ġ    : 55000 => 14");
	   //  <MENU NAME>                   <MENU Price>
	      ArrayName.add("����ũƼ");      ArrayPrice.add(1500);
	      ArrayName.add("��׷��̹�ũƼ");      ArrayPrice.add(3500);
	      ArrayName.add("�ڽ��� �׸���ũƼ");      ArrayPrice.add(3500);
	      ArrayName.add("Ÿ�ι�ũƼ");      ArrayPrice.add(2500);
	      ArrayName.add("���� �׸���ũƼ");      ArrayPrice.add(5500);
	      
	      ArrayName.add("�ڸ��꽺");         ArrayPrice.add(10000);
	      ArrayName.add("�������꽺");      ArrayPrice.add(9000);
	      ArrayName.add("�����꽺");         ArrayPrice.add(10000);
	      ArrayName.add("�丶���꽺");      ArrayPrice.add(7000);
	      ArrayName.add("���� �꽺");      ArrayPrice.add(15000);

	      ArrayName.add("��ũ������");      ArrayPrice.add(30000);
	      ArrayName.add("��������");         ArrayPrice.add(35000);
	      ArrayName.add("��������");         ArrayPrice.add(37000);
	      ArrayName.add("������ġ");         ArrayPrice.add(25000);
	      ArrayName.add("�� �� ġ");         ArrayPrice.add(55000);
	         
	   }
	   
	   public void mat() {            //ī�װ� ---->�޴������� �Ѿ�ϴ�.
	      number = sc.nextInt();
	      if(number == 10)
	      {   
	         System.out.format(txt1.toString());System.out.println();
	         num3=0;
	         for(int i =0;i<5;i++) {
	         
	         System.out.format("%s\n",Array.get(i));
	         
	         }
	         showbar();
	         
	      }
	      else if(number ==20) {
	         System.out.format(txt2.toString());System.out.println();
	         num3=4; //Topping's price =0
	         for(int i=5;i<10;i++) {
	            
	         System.out.format("%s\n",Array.get(i));
	         }
	         showbar();
	      }
	      else if(number == 30){
	         System.out.format(txt3.toString());System.out.println();
	         num3=4;
	         for(int i=10;i<15;i++) {
	            
	         System.out.format("%s\n",Array.get(i));
	            
	         }
	         showbar();
	      }
	      else {
	         System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	         showbtn();
	         showbar();
	         mat();   
	      }
	   
	   }
	   
	   public void receipt() {         //�޴��ǿ��� ������ ������ �Է��� ������� �����մϴ�.
	      Scanner sc = new Scanner(System.in);
	      int sum =0;
	       

	      while(true) {
	          System.out.println("�޴� ��ȣ�� ���� �Է��ϼ���");
	          showbar();
	          int num1 = sc.nextInt();      //�޴�(0~14)��ư
	          int num2 = sc.nextInt();      //����
	         
	             if(number == 10 && (0<=num1)&&(num1<5)) {          //Milk Tea���ý�, Topping �߰��Ͻðڽ��ϱ�?
	                System.out.format(txt4.toString());System.out.println(""); 
	                for(int i =0;i<5;i++){
	               System.out.format("%s\n",ArrayTopping.get(i));  
	                }
	                showbar();
	                 num3 = sc.nextInt();
	                    
	             }
	                
	             if(number == 10 && !((0 <= num1) && (num1 < 5))) {
	             System.out.println("�޴���ȣ�� �߸� �Է��ϼ̽��ϴ�.");
	             continue;
	                }
	             else if(number == 20 && !((5 <= num1) && (num1 < 10))) {
	             System.out.println("�޴���ȣ�� �߸� �Է��ϼ̽��ϴ�.");
	             continue;
	                }
	             else if (number == 30 && !((10 <= num1) && (num1 < 15))) {
	             System.out.println("�޴���ȣ�� �߸� �Է��ϼ̽��ϴ�.");
	             continue;
	                }
	         
	             
	          int price = (num2 *(int)ArrayPrice.get(num1))+((int)ArrayToppingPrice.get(num3)*(int)num2);
	          sum += price;
	          Integer.toString(num1);
	          Integer.toString(num2);
	          ArrayOrder.add("ord:"+(String)ArrayName.get(num1)+"�� ������ "+ num2 + "�� �̰� ������ "+ price + "�� �Դϴ�.\n");
	      
	          System.out.println("�ٸ��޴����� '1',�ֹ��Ϸ�'2' �Է��ϼ���. ");
	          showbar();
	          int word1 = sc.nextInt();

	          if(word1 == 1) {
	             showbtn();
	             mat();                    //(1)���ý�, �ٽ� ī�װ��� ���ư��ϴ�.
	          }
	          else if(word1 == 2) 
	             break;                  //�ֹ��Ϸ��ϰڽ��ϱ�?

	      }    
	          for(int i=0;i<ArrayOrder.size();i++) {       //�ֹ�����
	            System.out.format("%s",ArrayOrder.get(i));
	      }
	      Value  val = new Value("�հ�", sum);
	      System.out.format(val.toString()); System.out.println("");
	      
	}
	   
	   public void Buy()  {                   //������ �Ϸ�����,������� �����մϴ�.
	      showbar();
	      
	      System.out.println("������ ���ϸ� �ƹ���ư Ŭ���ϼ���!");
	      System.out.println("�ֹ���� : 99");
	      int cancel = sc.nextInt();
	      if(cancel==99){
	         System.out.println("ó��ȭ������ ���ư��ϴ�!");
	         }
	      else {
	         System.out.format(tit.toString());System.out.println("");
	     	try {	
	            
				Thread.sleep(2000); // ���� ������
	            
			} catch (InterruptedException e) {
	        
	      }
	     	 System.out.format(tit1.toString());System.out.println("");
	         System.out.format(tit2.toString());System.out.println("");
	        
	   }
	      
	   }
	}
    