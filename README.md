# BookHub

## 목차
* [소개](#소개)
* [사용 기술](#사용-기술)
* [구현 기능](#구현-기능)
* [기술적 경험 및 개선사항](#기술적-경험-및-개선사항)

## 소개
* BookHub 쇼핑몰 프로젝트
* 프로젝트 기간 : 2024.04.08~2024.05.16 (39일간 468시간)
* 벤치마킹 사이트 : 교보문고, 알라딘, 예스24, 네이버 판매자 스토어



## 사용 기술
<img src="https://img.shields.io/badge/Java_17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"> &nbsp;
<img src="https://img.shields.io/badge/Spring Boot-6DB33F.svg?style=for-the-badge&logo=Spring boot&logoColor=white" /> &nbsp;
<img src="https://img.shields.io/badge/My Batis-색상?style=for-the-badge&logo=My Batis&logoColor=white"/> &nbsp;
<img src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white"> &nbsp;
<img src="https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white"/> &nbsp;

<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=Javascript&logoColor=white"> &nbsp;
<img src="https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white"/> &nbsp;
<img src="https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white"> &nbsp;

<img src="https://img.shields.io/badge/draw.io-F08705?style=for-the-badge&logo=diagramsdotnet&logoColor=white"> &nbsp;
<img src="https://img.shields.io/badge/fontawesome-528DD7?style=for-the-badge&logo=fontawesome&logoColor=white"> &nbsp;
<img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white">


<br>

## 구현 기능 

- 관리자 로그인 / 로그아웃
  - Session을 활용한 로그인/로그아웃


- 관리자 회원가입
  - 정규표현식 사용
  - @Valid 유효성 검사
  - 중복체크 사용자예외처리 클래스(ID, 이메일)
  - 회원가입 완료시 이메일 전송


- 관리자 대시보드
  - 최근 1주일 매출액 표시
    - @Scheduled를 사용한 데이터 자동저장
  - 총 물건 수, 회원 수, 최근 5개의 리뷰 및 별점, 1:1 문의 답변률/미답변률 표시
  - 해당하는 날짜 선택시 매출액 및 세부내역
  - 해당하는 범위의 날짜 매출액 및 세부내역


- 1:1 문의 답변 및 조회
  - 1:1 답변 등록 및 수정


<br>

<br>

## 기술적 경험 및 개선사항

- 회원가입 완료시 비동기 이메일 전송
  - 비동기처리 이후 소요시간 : 3620ms -> 290ms
   
- @ShedLock을 활용한 @Scheduled 중복 실행 방지
  
- 관리자 대시보드에 Caffeine Cache 적용을 통한 성능개선
