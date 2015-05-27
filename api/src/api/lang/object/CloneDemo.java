package api.lang.object;

import java.util.Arrays;

/*
 * java.lang.Object 의 메소드
 * clone() 은 객체를 복제한다.
 * */

public class CloneDemo {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		// 배열은 한 번 공간을 생성시키면 추가 할당이 되지 않는다.
		// 동적으로 할당 하고자 한다면 ArrayList를 사용한다.
		
		int[] arr2=arr.clone();
		/* arr 배열을 복제한 값을 arr2 에 그대로 할당 한다.*/
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+"\t");	// \t는 이스케이프 문자로 tab을 뜻 한다.
		}
		System.out.println();
		System.out.println("==================================");
		System.out.println("Arrays 로 출력");
		System.out.println("arr 의 요소 출력 "+Arrays.toString(arr));
		System.out.println("arr2 의 요소 출력 "+Arrays.toString(arr2));	
	}
}
