package com.org.micro.insta.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.org.micro.insta.feeds.Feeds;

/*@ComponentScan*/
@Controller
@RequestMapping("/feeds")
public class InstaFeedController {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Feeds sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Feeds(counter.incrementAndGet(), String.format(template, name));
    }
}
