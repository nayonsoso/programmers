# 외워둘 함수

---

- String to int : `Integer.parseInt("String");`
- String to long : `Long.parseLong("String");`
- String to char : `string.charAt(0);`
- String을 한 글자씩 split : `String[] s_array = s.split("");`
- char to int : `int i = char - '0';` // 아스키코드의 차이를 구한 다음, int로 자동 형변환
- int to String : `Integer.toString(int);`
- float to int : `Math.round(float)`;
- double to int : `(int)Math.round(double);` // Math.round에 double을 넣으면 int가 아니라 long을 반환하므로 이를 다시 int로 변환해줘야한다.
- 지수승 : `Math.pow(a,b);`



# 문자열 처리

---





# 숫자

---

- 자릿수 확인 : 4byte(=2^32)인 int는 10자리, 8byte(=2^64)인 long은 19자리까지 표현할 수 있다. (\#L147355)

- 