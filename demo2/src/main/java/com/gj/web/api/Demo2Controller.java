package com.gj.web.api;

import cn.gjing.result.PageResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gjing
 **/
@RestController
public class Demo2Controller {

    @GetMapping("/test")
    public PageResult test() {
        return PageResult.of("Demo2", 1);
    }
}
