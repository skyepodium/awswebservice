package com.skyepodium.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    @SpringBootApplication으로 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성 모두 자동으로 설정
    항상 @SpringBootApplication 부터 컴포넌트 스캔을 진행한다.
    컴포넌트 스캔이란, annotation이 붙은 클래스들을 Bean에 등록하는것
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        /*
            SpringApplication.rund으로 내장 WAS 실행
            내장 WAS 사용하면 스프링 부트로 만들어진 Jar 파일로 실행
            WAS 설치 필요없고 언제 어디서나 같은 환경에서 스프링 부트 배포 가능
            성능이슈 없다.
         */
        SpringApplication.run(Application.class, args);
    }
}
