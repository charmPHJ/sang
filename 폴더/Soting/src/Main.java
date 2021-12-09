import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*정렬 프로그램,
		 * 
		 * 
		 * 1. 유저한테 물어보기 user에게 몇개의 숫자를 정렬할것이냐,
		 * 2. 숫자만큼 입력받기(갯수결정)
		 * 3. 숫자 입력받기 
		 * 4. 오름차순이냐 내림차순 묻기
		 * 5. soting 정렬처리하기
		 * 6. 결과출력
		 */
		// 유저한테 물어보기 user에게 몇개의 숫자를 정렬할것이냐,
		
		int count = 0; // 입력받을 숫자 갯수
		int[] numArr;
		Scanner sc = new Scanner(System.in);//숫자 입력받고 저장하기
		System.out.println("몇개의 숫자를 입력하시겠습니까 : ");
		
		count = sc.nextInt(); // 입력받을 숫자 갯수
		numArr = new int[count]; // 입력받은 숫자 담았다.
		System.out.println("숫자를 쓰세요");
		
		for (int i = 0; i < numArr.length; i++) {  // for문으로 입력할 숫자갯수를 갯수만큼 숫자넣기
			numArr[i]= sc.nextInt();
		} System.out.println(Arrays.toString(numArr));
		
		System.out.println("선택하세요. 오름차순(1) / 내림차순(2)");
		int countSoting = sc.nextInt();
		/*내가 힘들어하는부분,ㅡ 두번을 물었을때 두번째는 모르겠다. 숫자갯수입력-숫자들입력-오름차순내림 묻기 (이게 불가)*/
		
		int temp; // 오름차순 내림차순 변환해줄 매개	  // 강사님 수정사항 temp 밖으로뺴라 더깔끔하다
		switch(countSoting) {
			case 1: //오름차순 해주는 문구
				for (int i = 0; i < numArr.length-1; i++) {
					for (int j = i+1; j < numArr.length; j++) {
						if(numArr[i] > numArr[j]) {
							temp = numArr[i];
							numArr[i] = numArr[j];
							numArr[j] = temp;
						}
					}
				}
				System.out.println(Arrays.toString(numArr));
				break;		
			case 2: //내림차순 해주는 문구
				for (int i = 0; i < numArr.length-1; i++) {
					for (int j = i+1; j < numArr.length; j++) {
						if(numArr[i] < numArr[j]) {
							temp = numArr[i];
							numArr[i] = numArr[j];
							numArr[j] = temp;
						}
					}
				}
				System.out.println(Arrays.toString(numArr));
				break;
		}

		
//		 2. 숫자만큼 입력받기(갯수결정)
//		 3. 숫자 입력받기 
//		4. 오름차순이냐 내림차순 묻기
//		 5. soting 정렬처리하기
//		6. 결과출력
		/*
		int number[] = {5,8,9,7,2};
						// 선택정렬 = 하나하나씨  번호 비교
		
		int temp; // 이건 각각 바꿔줄때 사용하는 변수, 그냥 바꿔주는 기계라고 생각해라 임의로 만들어서
		for (int i = 0; i < number.length-1; i++) { //0부터 훝어본다 //마지막은 비교할게 없다. 그렇기떄문에 -1
			for(int j = i + 1; j <number.length; j++) { // 0번째 자리는 자기 자리뺴니까 +1을 붙인다 1번쨰는 2번째와 비교한다
				if(number[i] > number[j]) {// 교환 처리 큰숫자는 뒤로 보내야한다 앞의 숫자가 컷을때 바꿔라 // 오름차순 내림차순으로 체크됨
					temp = number[i];
					number[i]=number[j];
					number[j]= temp;
				}
				
			}
			
		}System.out.println(Arrays.toString(number));
		*/
	}

}
