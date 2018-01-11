package com.jason;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b><code>GreetingController</code></b>
 * <p>
 * class_comment
 * <p>
 * <b>Creation Time:</b> 2018/1/11 14:27.
 *
 * @author yangjiangshui
 * @version ${Revision} 2018/1/11
 * @since spring-boot-web project_version
 */
@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
