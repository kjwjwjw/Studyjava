package kiosk;


import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Program {

   public static void main(String[] args) {
      while(true) {
         
         
         Screen sc = new Screen();
         sc.showtit();    //tit ����
         sc.showbtn();    //btn Ŀ�� ���� ��
       
         
         NewScreen ns = new NewScreen();
         ns.mat();       //�޴���
         ns.receipt();    //�ֹ�����
         ns.Buy();       // ���� or�ֹ����
         
   
      }
      
   }   
}   
