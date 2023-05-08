## Mission1

---

### 컬렉션 프레임워크 복습
- 컬렉션 프레임워크를 선언할 때 `<T>`를 굳이 적지 않아도 된다.
- `.contains(Object)` : 컬렉션 프레임워크에 해당 Object가 있는지 boolean으로 리턴하는 함수
- `.indexOf(Object)` : 해당 Object가 있는 인덱스 중 가장 앞에 있는 인덱스를 리턴한다.
- Array to ArrayList : `ArrayList arrayList = new ArrayList(Arrays.asList(array));`
- ArrayList to Array : `Object[] arr1 = stack.toArray(new Object[stack.size()]);`
- 로또 문제를 Set을 이용하면 훨씬 간단히 구현할 수 있다. (중복되는 값은 add가 안되므로 & sort하기 위해선 다시 ArrayList로)
![img_1.png](img_1.png)

### Stack
- 주요 함수 : push, pop, peek(top 리턴)