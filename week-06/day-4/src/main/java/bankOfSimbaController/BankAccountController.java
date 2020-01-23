package bankOfSimbaController;

import com.greenfoxacademy.bankofsimba.AnimalType;
import com.greenfoxacademy.bankofsimba.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class BankAccountController {

    @GetMapping("/")
    public String accountInformation(Model model) {
        BankAccount bankAccount1 = new BankAccount("Simba", 2000, AnimalType.LION);
        model.addAttribute("bankAccount", bankAccount1);

        return "index";
    }

    @GetMapping("/show")
    @ResponseBody
    public String accountInformatio2() {
        return "lofasz a seggedbe";
    }


}
