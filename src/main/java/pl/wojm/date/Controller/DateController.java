package pl.wojm.date.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.wojm.date.DateModel;

@Controller
public class DateController {


    @GetMapping("/")
    public String home(){return "home";}

    @PostMapping("/calculate")
    public String calculate(@ModelAttribute DateModel dateModel, ModelMap modelMap){
        modelMap.addAttribute("result", dateModel.dateCalc(dateModel.getDay(), dateModel.getMonth(), dateModel.getYear()));
        return "result";
    }

}
