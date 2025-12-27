package com.backend.domain.home.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController // @ResponseBody + @Controller
@Slf4j
public class HomeController {
  @GetMapping("/")
  public String main() {
    InetAddress localhost = null;

    try {
      localhost = InetAddress.getLocalHost();
    } catch (UnknownHostException e) {
      throw new RuntimeException(e);
    }

    System.out.println("모든 환경에서 출력");
    log.info("개발/운영 환경에서만 출력");
    // log.debug("개발/테스트 환경에서만 출력");

    return "main1, hostname : %s".formatted(localhost.getHostName());
  }
}
