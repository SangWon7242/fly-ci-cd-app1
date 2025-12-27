package com.backend.domain.home.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController // @ResponseBody + @Controller
public class HomeController {
  @GetMapping("/")
  public String main() {
    InetAddress localhost = null;

    try {
      localhost = InetAddress.getLocalHost();
    } catch (UnknownHostException e) {
      throw new RuntimeException(e);
    }

    return "main1, hostname : %s".formatted(localhost.getHostName());
  }
}
