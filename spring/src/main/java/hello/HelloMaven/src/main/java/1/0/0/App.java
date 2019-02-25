package 1.0.0;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello world!
 *
 */
@RestController
public class App 
{
    @RequestMapping("/")
   public String index(){
    return "Hello Spring boot";
}
}
