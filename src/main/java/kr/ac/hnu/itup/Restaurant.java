package kr.ac.hnu.itup;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Restaurant {
    private String name;
    private String address;
    private String phone;

    private Chef chef;
    // 단축키 cmd + N -> getter, setter -> Boilerplate code (재사용 가능한 코드)
    // -> lombok 사용 @Getter @Setter
    // -> @Data 어노테이션 사용 : Java 에서 class 를 만들 때 필요한 파일들을 자동으로 생성
    // get 메서드, set 메서드, equals, canEqual, hashCode, toString
    // build - classes - java - main - kr - ac - hnu - itup - 해당 클래스 (read-only 파일)
    // -> build 파일이란?
}
