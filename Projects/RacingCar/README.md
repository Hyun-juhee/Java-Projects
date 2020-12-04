# Racing Car (자동차 경주 게임)
### 📝 기능 요구 사항 
- 경주할 자동차 이름과 시행 횟수를 입력받는다.
- 자동차 이름은 ,를 기준으로 구분하고 이름은 5자 이하여야 한다. 
- 0 ~ 9 사이에서 난수를 추출해 값이 4 이상일 경우에만 전진한다.
- 시행 횟수 만큼 반복하며, 매번 실행 결과를 출력한다. 
- 한 명 이상의 최종 우승자를 출력한다. 

### 🗂 폴더 구조
```
├─domain
│  ├─Car
│  └─PlayGame
├─utils
│  └─InputValidator
├─view
│  ├─InputView
│  └─OutputView
├─RacingCarGame
└─Application
```
### ✅ 프로그래밍 규칙
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
- 3항 연산자를 쓰지 않는다.
- 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.

### 💻 실행 결과 예시
```
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
juhi,jimi,hazz
시도할 회수는 몇회인가요?
5

juhi : 
jimi : -
hazz : -

juhi : -
jimi : --
hazz : --

juhi : --
jimi : --
hazz : ---

juhi : ---
jimi : ---
hazz : ----

juhi : ---
jimi : ----
hazz : -----

최종 우승자 : juhi
```
