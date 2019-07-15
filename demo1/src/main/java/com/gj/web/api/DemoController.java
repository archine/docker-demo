package com.gj.web.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gjing
 **/
@RestController
public class DemoController {

    @PostMapping("/test")
    public String test() {
        return "ok";
    }
}
