## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

---
4. 구현 기능 목록

- [x] 1.상대방(컴퓨터)의 세 자리 숫자를 임의로(randomly) 생성하는 로직 추가
- [ ] 2.나의 숫자를 입력받는 로직 추가
  - 별도 횟수 제한 없음
  - 맞출 때까지 진행하기
- [ ] 3.결과가 맞았는지 틀렸는지 판별하는 로직 추가 
  - [ ] 3-1.맞았으면, 새로운 게임을 시작(=1입력)할지 게임을 종료(=2입력)할지 선택
    - 1번 로직 재사용 가능할 듯
  - [ ] 3-2.틀렸으면, 스트라이크, 볼, 포볼(낫싱)의 개수 판별하여 출력