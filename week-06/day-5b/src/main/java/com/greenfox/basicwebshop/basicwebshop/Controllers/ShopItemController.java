package com.greenfox.basicwebshop.basicwebshop.Controllers;

import com.greenfox.basicwebshop.basicwebshop.Models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShopItemController {
    private List<ShopItem> shopItemList = new ArrayList<>();
    private ShopItem item1;
    private ShopItem item2;
    private ShopItem item3;

    public ShopItemController() {
        shopItemList.add(item1 = new ShopItem("Valami", "Valamik", "10000", 1000));
        shopItemList.add(item2 = new ShopItem("Valami", "Valamik", "10000", 1000));
        shopItemList.add(item3 = new ShopItem("Valami", "Valamik", "10000", 1000));
    }

    @GetMapping("/webshop")
    public String accountList(Model model) {
        model.addAttribute("itemList", shopItemList);

        return "index";
    }

    @GetMapping("/available")
    public String onlyAvailable(Model model) {
        model.addAttribute("itemList", shopItemList);

        return "";
    }

    /*private String getOnlyAvailable(List<ShopItem> items) {
        return items
                .stream()
                .
    }*/
}
