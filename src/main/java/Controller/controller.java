package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/**
 * Created by moonsunghyun on 2018. 3. 29..
 */
public class controller {

    @RequestMapping(value = "/")
    public String test(){
        return "index";
    }
}
