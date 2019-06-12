package cn.itcast.controller;


import cn.itcast.domain.Items;
import cn.itcast.service.itemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/controller")
public class SpringController {

    @Autowired
   private itemsService service;

    @RequestMapping(path = "/ItemsController")
    public String ItemsController(Model model){
        Items byId = service.findById(9);
        model.addAttribute("item",byId);
        return "success";
    }

}
