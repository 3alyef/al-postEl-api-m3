package com._3alyef.alpostelm3.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com._3alyef.alpostelm3.previous_msgs.PreviousMsgs;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/previousMsgs")
public class PreviousMsgsController {

    @PostMapping
    public void postMethodName(@RequestBody PreviousMsgs data) {   
        String userA = data.userA();
        String userB = data.userB();

        System.out.println(userA + "-" + userB);
    }
    
}
