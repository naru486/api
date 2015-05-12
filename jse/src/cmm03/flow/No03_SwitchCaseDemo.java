package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchCaseDemo {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int avg=0;
		do{
			System.out.print("평균 점수를 입력하세요 (0~100 점 사이) : ");
			avg=scanner.nextInt();
		}while((avg>100)||(avg<0));
		
		scanner.close();
		System.out.print("입력된 점수 : "+avg+" 점\n");
		String result="";
		if(avg>=70){
			result="합격";
		}
		if(avg>=70){
			result="합격";
		}
		else {
			result="메시지";
		}
		//평균 점수에 따라서 비교 학점구하기
		
		char grade='F';
		if(avg>=90){grade='A';}
		else if(avg>=80){grade='B';}
		else if(avg>=70){grade='C';}
		else if(avg>=60){grade='D';}
		else{grade='F';}
		
		// 위 if else # Switch # 바꾸시오
		switch (avg/10) {
			case 10:case 9:grade='A';break;
			case 8:grade='B';break;
			case 7:grade='C';break;
			case 6:grade='D';break;
			default:grade='F';break;
		}
		System.out.println("귀하는 "+result+" 이며, 학점은 "+grade+" 입니다.");
	}
}
