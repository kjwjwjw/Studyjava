package Lambda;

import java.util.Arrays;
import java.util.List;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * < 람다식 사용의 장점 >
		 * 
		 * 1. 코드의 간결성
		 * - 기본적으로 "익명의 내부클래스" 형태보다 간결함
		 * - 실행문이 간단할 경우 그 효과가 더욱 부각됨
		 *   => 어떤 로직인지 바로바로 알아보기 편하다. (가독성이 좋다)
		 *   
		 * 2. "지연 연산" (Lazy Evaluation)을 이용하여 향상된 퍼포먼스를 보여줄 수 있다.
		 * - 연산은 나중으로 미루어 두었다가 한꺼번에 연산하는 방식
		 * - 메모리상의 효율성 및 불필요한 연산은 배제가 가능  
		 * 
		 * -------------------------------------------------------------------------------------------
		 * < 람다식 사용의 단점 >
		 * 
		 * 1. 모든 원소를 순회하는 경우 어떤방법으로 작성하더라도 람다식이 조금 느릴 수 밖에 없다.
		 *    (최종 출력되는 bytecode는 단순 반복문 보다 몇 단계를 더 거칠수 밖에 없다.)
		 *    
		 * 2. 디버깅 시 추적이 극도로 어렵다.
		 *    (거의 불가능에 가깝다
		 *    -> 람다식으로 작성한 로직은 실수없이 완벽해야한다.
		 *    -> 간단한 로직이어야한다.)
		 *    
		 * 3. 람다식이 남용되면 오히려 코드를 이해하기 어려울 수 있다. (가독성이 떨어진다.)      
		 * 
		 * < 최종 결론 >
		 * - 단순하고 간결한 로직이 그때 그때(일회성) 사용될 경우 람다식 O
		 *   => 어떠한 경우에서만 로직이 조금 수정될 경우 메서드로 호출하면 호출하고 있는 포인트를 전부 찾아
		 *      일일이 수정하거나 수정된 부분만 새로운 메서드를 만들어서 호출하도록 변경해야한다.
		 *      (결국, 메서드를 재사용하지 않고 상황별 메서드가 따로 생기게 됨)
		 * 
		 * - 로직이 조금 복잡하거나(실행문이 많을 경우) 가독성이 떨어지는 경우 람다식 X
		 *   => 복잡한 로직 = 가독성이 안좋음
		 *   => 실행문이 많다 = 디버깅할 일이 생긴다!
		 * */
		
		// 지연 연산 예
		// 잘못 해석)
		// - 6보다 작은 수를 모두 filter
		// - filter된 결과에서 짝수인것들만 filter
		// - filter된 결과 모두 10을 곱한다.
		// - 그중 제일 첫번째 요소를 return 한다.
		
		// 실제동작)
		// - 6보다 작은지 판단
		// - 짝수인지 판단
		// - 10을 곱한다.
		// - 위모든 판단들을 만족하는 첫번째요소에다가 10을 곱하는 연산을 한 후 더이상 연산하지 않는다.
		//   즉, 불필요한 연산을 하지 않는다.
		
		// 6보다 작은값 -> 짝수인 것만 -> 결과에 모두 10을 곱한후 -> 제일 첫번째 요소
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// 람다식
		int n = list.stream().filter(i -> i<6)		// 6보다 작은것만
							 .filter(i -> i%2 == 0)	// 짝수인것만
							 .map(i -> i*10)		// 10을 곱하고
							 .findFirst().get();
		System.out.println(n);
		
		// 일반적인 for문으로 구현
		int result = 0;
		for(Integer i : list) {
			if(i < 6) {
				if(i % 2 == 0) {
					i *= 10;
					result = i;
					break;
				}
			}
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
	}

}
