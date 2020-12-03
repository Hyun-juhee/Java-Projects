# 숫자야구 
## 기능 정리
#### 1. 3자리 난수 생성  
- 0 ~ 9 서로 다른 수 
#### 2. 사용자가 3자리 수 입력
- 0 ~ 8 서로 다른 수 
#### 3. 사용자가 입력한 수 판단 
- strike
- ball
- win
- out

## 폴더 구조

```sh
├─domain
│  ├─NumberBaseball
│  ├─TargetList
│  └─UserList
└─NumberBaseballApplication
```
## 실행 화면
```
0~9 사이의 3가지 정수를 입력하시오 : 
1 2 3
1 Ball / 1 Strike
0~9 사이의 3가지 정수를 입력하시오 : 
1 2 6
1 Ball / 1 Strike
0~9 사이의 3가지 정수를 입력하시오 : 
9 2 1
0 Ball / 2 Strike
0~9 사이의 3가지 정수를 입력하시오 : 
8 2 1
Win!
게임이 종료됐습니다. 다시 하려면 1, 종료하려면 0을 입력하세요.
```
