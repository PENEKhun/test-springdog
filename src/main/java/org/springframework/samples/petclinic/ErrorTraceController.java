package org.springframework.samples.petclinic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorTraceController {

  @GetMapping("/test/error")
  public String test() {
    throw new IllegalArgumentException("접속할 수 없는 URL입니다.");
  }
}
