package kiosk;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Screen {
	
   Title tit = new Title("����");
   Button cof = new Button("MilkTea=>",10);
   Button drk = new Button("Drink =>",20);
   Button brd = new Button("Bread =>",30);
   
   Bar  bar = new Bar();
   Text txt1 = new Text("��ũƼ");
   Text txt2 = new Text("����");
   Text  txt3 = new Text("��");
   Text txt4 = new Text("�ֹ�����");

   
   
   List<Object> Array = new ArrayList<Object>();
   List<Object> ArrayName = new ArrayList<Object>();
   List<Object> ArrayPrice = new ArrayList<Object>();
   List<Object> ArrayOrder = new ArrayList<Object>(); //�޴� �ֹ��հ�
   List<Object> ArrayTopping = new ArrayList<Object>();
   List<Object> ArrayToppingPrice = new ArrayList<Object>();
   
   public void showtxt() {
      
   }
   
   public void showbtn() {
   System.out.format(cof.toString());System.out.println();
   System.out.format(drk.toString());System.out.println();
   System.out.format(brd.toString());System.out.println();
   showbar();
   
}
   
   public void showbar() {
   System.out.format(bar.toString());System.out.println();
}
   
   
   public void showtit() {
   System.out.format(tit.toString());
   System.out.println();
   
}
 
      
   public void show(){
         {for(int i=0;i<Array.size();i++)
      System.out.format( "%s\n",Array.get(i));
         }
    
} 
     
         
   
   
   }

	


