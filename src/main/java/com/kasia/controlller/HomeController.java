package com.kasia.controlller;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.InMemoryProductRepository;
import com.packt.webstore.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public static String  home(){
        return "test";
    }


    private ProductRepository productRepository = new InMemoryProductRepository();

    @RequestMapping("/products")
    public String list(Model model){
        model.addAttribute("products",productRepository.getAllProduct());
        Product iphone = new Product("P1234", "iPhone 5s", new BigDecimal(500));
        iphone.setDescription("Apple iPhone 5s, smartfon z 4-calowym wyświetlaczem..");
        iphone.setCategory("Smart Phone");
        iphone.setManufacturer("Apple");
        iphone.setUnitsIntock(1000);
        model.addAttribute("product",iphone);
        return "products";
    }

}
