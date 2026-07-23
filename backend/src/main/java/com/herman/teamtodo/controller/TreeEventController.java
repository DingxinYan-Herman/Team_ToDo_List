package com.herman.teamtodo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.herman.teamtodo.entity.Event;

@RestController
@RequestMapping("/tree")
public class TreeEventController {
    
    @GetMapping
    public List<Event> getAllEvent(){
        return null;
    }

    @PostMapping
    public Event addNewEvent(@RequestBody Event event){
        return null;
    }
}
