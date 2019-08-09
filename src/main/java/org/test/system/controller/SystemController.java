package org.test.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author panjie
 * @Description:org.test
 * @date 2019/7/24 17:14
 */

@Controller
public class SystemController {

    @GetMapping("/index")
    public String index(){

        return "index";
    }
}
