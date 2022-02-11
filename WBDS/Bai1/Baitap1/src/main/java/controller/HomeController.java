package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Controller
public class HomeController {
    @GetMapping(value = {"/","/index"})
    public String index() {
        return  "index";
    }

    @GetMapping("/calculate")
    public String calculate(HttpServletRequest request, Model model) {
        String text = request.getParameter("first");
        String result= "";
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello","xin chao");
        dictionary.put("dog","con cho");
        dictionary.put("cat","con meo");
        dictionary.put("birth","con chim");
        if (dictionary.containsKey(text.toLowerCase())) {
            result = dictionary.get(text.toLowerCase());
        } else {
            result =  "Khong tim thay tu trong tu dien";
        }

        model.addAttribute("display",text);
        model.addAttribute("result",result);
        return "calculate";
    }
}
