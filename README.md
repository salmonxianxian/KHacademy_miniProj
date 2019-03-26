# 4조 스터디 @ [KH](http://www.iei.or.kr/main/main.kh)

## 목차

- [Purpose](#purpose)
- [Proposal](#proposal)
- [Rule](#paragraph2)
- How to review codes
  1. [Fork repository](#fork-repository)
  2. [Clone repository](#clone-repository)
  3. [Sync with Eclipse](#review01)
  4. [Play with Java!](#play-with-java!)
  5. [Pull request](#pull-request)
  6. [Repositories](#repositories)

# Purpose

![](https://images.unsplash.com/photo-1483058712412-4245e9b90334?ixlib=rb-1.2.1&auto=format&fit=crop&w=2250&q=80)

우리가 지금까지 배웠던 자바 프로그래밍 과정을 다시 한 번 **복습**을 하고 싶다. 반복적으로 접하는 개념 또는 각자 멤버들이 직접 프로그래밍 하기를 필요로 하는 개념이 요구되는 문제를 우리가 직접 만들어서 풀어본다. 

각자 문제를 해결하고 어떻게 문제를 해결했는지 접근 방식과 해결 방법을 Github을 통해 서로 공유하고, 리뷰한다. 이를 통해 문제 해결과 협업을 함께 경험한다.

<br>

# Proposal

본 프로젝트는 시윤씨의 제안으로 스터디 4조에서 진행한 자바 프로젝트입니다. 프로젝트 초기 시윤시가 작성한 제안서를 첨부합니다.

```
----------------------------------------------------------------------
** main에서는 왠만하면 실행만 하고 대부분 메소드화 하여 만들기
** 배운 내용을 최대한 활용하여 제작하면 좋을 것 같음 (API, 상속, 오버라이딩 등)
KH정보교육원 Activity Program

---Main Menu---
1. 밥집 추천프로그램 
 방식1) 양식, 중식 등 원하는 종류의 카테고리 내에서 랜덤추천
 방식2) 이상형 월드컵 식으로 하나씩 지워나가는 식으로 최종결정

2. 밥값 몰아주기 게임 
 -둘이서 or 여럿이서 할 수 있는 게임으로 순위를 매겨 꼴찌가 식사값을 냄
 방식3) 숫자야구게임 

3. 메신저 프로그램
 -여러명 대화 가능하도록?

4. 집가고싶다
 - 현재시간을 입력하면 집에 갈때까지 남은 수업시간과 쉬는시간을 계산해줌

5. 시간표 출력
 - 외부 파일을 읽어와서 콘솔에 출력해주는 식으로?

```

<br>

# Rule

- 매주 화요일에 코드 리뷰
- 4월 12일 최종 리뷰
- proposal 내 5가지 과제 모든 멤버 수행한 이후, 해당 프로그램들이 서버에서 구동하도록 프로젝트 연장 진행

<br>

# How to review codes

## 1. Fork repository

![](http://i.imgur.com/ufBroYo.png)

위의 이미지처럼 오리지널 레파지토리에서 **Fork**를 하여 각자 Github 레파지토리로 가져온다. 

```
Fork는 Fork를 하는 그 시점까지의 프로젝트 버전을 Github 레파지토리로 복제하는 행동이다. Fork를 해온 오리지널 레파지토리에 업데이트가 있어도 반영되지 않는다.

Fork는 일반적으로 오픈소스에 참여(contribute)할 때 사용한다.
참여할 프로젝트의 레파지토리를 본인의 Github 레파지토리로 fork해서 버그를 고치거나 새로운 기능을 첨부하여 pull request 한다.
```

## 2. Clone repository

Eclipse로 작업하기 위해서는 Fork한 레파지토리를 **Clone**해서 로컬 레파지토리로 가져온다.

## 3. Sync with Eclipse

이제 로컬 레파지토리로 본 저장소를 가져왔으니 Eclipse로 작업경로를 동기화해준다.

![](https://lh3.googleusercontent.com/6pGq_cPkdtyPyq_Ki0w3N_i0iTV-IfOg96M0shuvdnlOSWlN3YATZplPjqEc3mZlF-saZWCXasLluFWaQgsVAF7D2pdlLJQ8D-wQf6aTNvL-vaic7tXfjJc4wVfnqMXsDb5jRh8ZNJiy9m0WY96OlY2xNvh92KcsS-TTCa9NFv13bHYE3HfHVZa9uleauJ1vzS5Ckcjg_mBkljTghqX0bBxjalyPZwMn0_P2WvQ7lb_pSzb4_tC2idKMFVni-HeBHbzKj2C8OANg58C44-85K8iElAhkKvU8fxEXv4T9gI3wLee3wApqCP2UiWfWfRBMSNRWONhRz-JGOkoDYWXpn3Ae81eEzXngmyxOqO0u48A0fafvaSgXBZYfyK4EAHG25f375pc3wj4yIuy0pIr9kdpi_TN0eFYieSGl4-pp9KbQaOz72G86Fjfo19iypN6R8mATYy9ZT1ObG6zPH1NeRWocI6SCRS-CSxcMtXUEhsdX6znKjYKaI3-5eaD1jxRReg1zsELkOvO2wiB3sWeYbVXLC6FRx328lAtrGUtYdMzTb4D3GdDXG7X9tnjCJouHAz-W3fgO_nObRv9ruK08LxTJTvyZLtg-BUfaKcvVKMalqkaWZRbyUyJfH9MX5-u1bzXT1yUumR9Dzw1ypg15HIMfZz5EnpQ1=w814-h424-no)

Eclipse에서 [Open Projects]로 [repos](/repos) 에 있는 각자의 폴더를 불러온다.

## 4. Play with Java!

![](https://www.dailydot.com/wp-content/uploads/951/c8/c223decf8fe8a7a0d1aadf96a7cd6556.jpg)

자바 언어를 이용하여 위의 [주어진 과제](#proposal)를 수행하고, 디렉토리에 저장한다.

## 4. Pull request

**한** 번에 문제를 다 수행하지 못한 경우도 있을 수 있으므로 그 때는 진행도를 **Commit message**에 남기고 commit하여 **버전 관리**를 경험 및 학습한다.

ex) 이상형 월드컵 프로그램 개발에서 엔트리까지 입력받고 아직 토너먼트를 구현하지 못했다.

```
$ git commit -m "completed by making entries"
$ git push
```

이후 [Github Web](https://github.com/youngjinmo/KHacademy_miniProj)에서 Pull Request를 보내면 된다.

![](http://i.imgur.com/F2d5N13.png)

pull request하는 전체적인 튜토리얼은 위 이미지의 [출처](https://wayhome25.github.io/git/2017/07/08/git-first-pull-request-story/)에서 학습가능하다.

<br>

## 5. Repositories

자바 소스코드 레파지토리.

- [시윤](/Siyun/src)
- [민지](/Minji/src)
- [영현](/Younghyeon/src)
- [현우](/Hyunwoo/src)
- [영진](/Youngjin/src)

<br>

# Now here we go

![](https://i.pinimg.com/originals/fe/3a/a9/fe3aa94af63ec0edccba2574081c2fe3.jpg)

