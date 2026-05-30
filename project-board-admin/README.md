# 게시판 어드민 프로젝트

이 프로젝트는 게시판 서비스의 관리 도구를 개발해보는 프로젝트입니다. 2024년 8월 기준 가장 최신의 스프링 부트와 관련 기술들, 자바 17 기능들, 개발 도구들을 경험할 수 있도록 만들어졌습니다.

## 개발 환경

- **IDE**: IntelliJ IDEA Ultimate
- **JDK**: Java 17
- **빌드 도구**: Gradle 8.8
- **프레임워크**: Spring Boot 3.3.2

## 기술 세부 스택

### Spring Boot
- Spring Boot Actuator
- Spring Data JPA
- Spring Security OAuth 2 Client
- Spring Security
- Thymeleaf
- Spring Web
- Spring WebSocket
- Lombok
- Spring Boot DevTools
- H2 Database
- MySQL Driver
- Spring Configuration Processor
  
### 그 외
- AdminLTE 3.2
- webjars-locator-core
- sockjs-client
- stomp-websocket
- Heroku

## 프로젝트 주요 기능

### 1. 게시글 관리
- 게시글 목록 조회, 검색, 정렬 기능을 제공합니다.
- 게시글 조회, 삭제 기능을 통해 게시판을 관리할 수 있습니다.

### 2. 댓글 관리
- 특정 게시글에 달린 댓글들을 조회하고 관리할 수 있습니다.
- 댓글의 작성자, 내용, 작성일 등을 확인하며, 댓글을 삭제하거나 관리할 수 있습니다.

### 3. 회원 관리
- 회원 목록을 조회하며, 회원 정보 수정 및 삭제 기능을 제공합니다.
- 회원의 상태(활성, 비활성)를 설정하고, 권한을 관리할 수 있습니다.

### 4. 부가 기능

#### 4.1 다크 모드
- 관리자 페이지에서 다크 모드를 지원하여 사용자 경험을 향상시킵니다.

#### 4.2 TODO 리스트
- 작업 관리와 할 일 목록을 위한 간단한 TODO 리스트 기능을 제공합니다.
- 작업 항목을 추가, 수정, 삭제할 수 있으며, 순서를 변경할 수 있습니다.

#### 4.3 방문자 수 집계
- Actuator와 Metrics 기능을 활용하여 페이지 방문자 수를 집계하고, 이를 대시보드에 실시간으로 표시합니다.

#### 4.4 실시간 채팅
- WebSocket과 STOMP 프로토콜을 이용해 실시간 채팅 기능을 구현하였습니다.
- 관리자 간의 간단한 커뮤니케이션을 위한 채팅 기능을 제공합니다.
