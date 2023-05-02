### Quiz1

---

구구단을 형식에 맞게 출력하는 문제
- 문자열을 형식에 맞게 출력하기 위해선 `printf` 뿐 아니라 `String.format()`을 사용할 수도 있다는 것을 알게됨.
- printf와 String.format은 괄호 안에 들어가는 형식이 동일.
- 하지만 printf는 바로 출력을 하고 String.format은 String을 리턴한다는 점이 다르다.

### Quiz2

---

결제액을 입력받고 그에 따른 캐쉬백을 출력하는 문제

- Scanner로 입력 받는 것 잊고 있었는데 다시 상기시켜줌 
  - `import java.util.Scanner;` `Scanner scanner = new Scanner(System.in);` `String s = scanner.nextLine();`
- 정수를 100원 단위로 자르는 방법 : random int를 추출하는 방법과 유사
  - 내림하려는 자리수만큼 10의 지수승으로 나눈 다음, floor로 소숫점 아래를 자르고 다시 10의 지수승을 곱하는 방법
  - `double cashBack = Math.floor(cashBak*0.01)*100;` // floor은 double을 리턴