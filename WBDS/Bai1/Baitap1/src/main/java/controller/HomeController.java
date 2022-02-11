package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @GetMapping(value = {"/","/index"})
    public String index() {
        return  "index";
    }

    @GetMapping("/calculate")
    public String calculate(HttpServletRequest request, Model model) {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String calculation = request.getParameter("calculation");
        String result = "";
        switch (calculation) {
            case "+":
                result = String.valueOf(Double.parseDouble(first) + Double.parseDouble(second)) ;
                break;
            case "-":
                result = String.valueOf(Double.parseDouble(first) - Double.parseDouble(second));
                break;
            case "*":
                result = String.valueOf(Double.parseDouble(first) * Double.parseDouble(second));
                break;
            case "/":
                if (Double.parseDouble(second) != 0) {
                    result = String.valueOf(Double.parseDouble(first) / Double.parseDouble(second));
                } else {
                    result = "Tham so thu 2 khong hop le";
                }
                break;
        }
        String display = first + " " + calculation + " " + second + " = ?";
        model.addAttribute("display",display);
        model.addAttribute("result",result);
        return "calculate";
    }
}
