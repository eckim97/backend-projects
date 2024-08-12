# 게시판 프로젝트

이 프로젝트는 Spring Boot와 다양한 기술 스택을 활용하여 구현된 게시판 애플리케이션입니다. 사용자 인증, 게시글 작성, 댓글 작성, 데이터베이스 관리 등 다양한 기능을 제공합니다.

## 개발 환경

- **IDE**: Intellij IDEA Ultimate
- **JDK**: Java 17
- **빌드 도구**: Gradle 7.4.1
- **프레임워크**: Spring Boot 2.7.0

## 기술 세부 스택

### Spring Boot 기반
- Spring Boot: 애플리케이션의 기본 프레임워크
- Spring Boot Actuator: 애플리케이션의 모니터링과 관리 기능 제공
- Spring Web: 웹 애플리케이션 개발을 위한 필수 모듈
- Spring Data JPA: JPA(Java Persistence API)를 통한 데이터베이스 접근
- Rest Repositories: RESTful 웹 서비스를 쉽게 구현할 수 있는 리포지토리
- Rest Repositories HAL Explorer: HAL 포맷의 RESTful 웹 서비스 탐색 도구
- Thymeleaf: 서버사이드 템플릿 엔진으로, HTML을 동적으로 생성
- Spring Security: 인증과 권한 부여 기능

### 데이터베이스
- H2 Database: 인메모리 데이터베이스로, 개발과 테스트 환경에서 사용
- MySQL Driver: MySQL 데이터베이스 연결을 위한 드라이버

### 유틸리티
- Lombok: 반복되는 코드를 줄이기 위한 어노테이션 라이브러리
- Spring Boot DevTools: 개발 편의성을 위한 도구 모음
- Spring Configuration Processor: Spring Boot 설정 파일 자동 완성 지원

### 그 외
- QueryDSL 5.0.0: 타입 안전한 SQL 쿼리 생성을 위한 라이브러리
- Bootstrap 5.2.0-Beta1: 프론트엔드 스타일링을 위한 CSS 프레임워크
- Heroku: 애플리케이션 배포 플랫폼

## 프로젝트 주요 기능

이 프로젝트는 사용자 인증 및 권한 관리, CRUD(생성, 읽기, 업데이트, 삭제) 기능이 포함된 게시판 애플리케이션입니다. 다음과 같은 주요 기능을 제공합니다:

1. **사용자 인증**: Spring Security를 사용한 로그인 및 로그아웃 기능
2. **게시글 관리**: 사용자는 게시글을 작성, 수정, 삭제할 수 있으며, 본인이 작성한 글만 관리할 수 있음
3. **댓글 관리**: 게시글에 대한 댓글 작성 및 관리 기능을 제공하며, 본인이 작성한 댓글만 삭제할 수 있음
4. **RESTful API**: Spring Data REST와 HATEOAS를 활용하여 RESTful 서비스를 제공
5. **템플릿 엔진**: Thymeleaf를 사용하여 서버사이드에서 동적으로 HTML 생성
6. **데이터베이스 관리**: H2 데이터베이스를 사용한 개발과 테스트 환경 지원 및 MySQL을 사용한 운영 환경 지원

## 프로젝트 구조

### ERD(Entity Relationship Diagram)
아래는 프로젝트에서 사용된 데이터베이스의 ERD입니다. 이를 통해 데이터베이스의 구조와 테이블 간의 관계를 쉽게 이해할 수 있습니다.

![ERD](./project-board-erd.svg)

### Use Case 다이어그램
아래는 프로젝트의 주요 기능과 사용자가 상호작용하는 방법을 보여주는 Use Case 다이어그램입니다.

![Use Case](./use-case.svg)
