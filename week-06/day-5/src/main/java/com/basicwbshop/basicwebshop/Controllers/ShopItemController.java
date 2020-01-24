package com.basicwbshop.basicwebshop.Controllers;

import com.basicwbshop.basicwebshop.Models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShopItemController {
    private List<ShopItem> shopItemList = new ArrayList<>();
    private ShopItem item1;
    private ShopItem item2;
    private ShopItem item3;


    public ShopItemController() {
        shopItemList.add(item1 = new ShopItem("valami", "Ez a valami kurva jó. Vedd meg", "Szinte ingyé van", 100));
        shopItemList.add(item2 = new ShopItem("valami2", "Ez a valami még kurva jobb. Miért nem veszel meg?", "Kurva drága", 200));
        shopItemList.add(item3 = new ShopItem("valami3", "Ez szar. Ne vedd meg", "Ingyé", 1300));
    }


    @GetMapping("/webshop")
    public String accountList(Model model) {
        model.addAttribute("shopItems", shopItemList);

        return "index";
    }

    @GetMapping("/asd")
    @ResponseBody
    public String accountList2() {
        return "szia";
    }
}
