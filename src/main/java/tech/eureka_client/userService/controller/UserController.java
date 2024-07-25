package tech.eureka_client.userService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

  @GetMapping ("/health")
  public ResponseEntity<String> getApplicationStatus(){
      return ResponseEntity.ok ("Service is up and running");
  }

}
