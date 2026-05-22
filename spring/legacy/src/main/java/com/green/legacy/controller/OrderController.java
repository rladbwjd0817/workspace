package com.green.legacy.controller;

import com.green.legacy.dto.DeliveryDTO;
import com.green.legacy.dto.OrderDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class OrderController {

  // 주문 페이지로 이동
  @RequestMapping("/order")
  public String goOrder(){
    return "order";
  };

  // 배달 정보 쓰기 페이지로 이동
  @RequestMapping("/delivery")
  public String delivery(@ModelAttribute OrderDTO orderDTO, Model model){
    System.out.println(orderDTO);

    model.addAttribute("order", orderDTO);

    return "delivery";
  }

  @RequestMapping("/show")
  public String show(@ModelAttribute DeliveryDTO deliveryDTO
                    , @ModelAttribute OrderDTO orderDTO
                    , Model model){
    System.out.println(deliveryDTO);
    System.out.println(orderDTO);

    model.addAttribute("order", orderDTO);
    model.addAttribute("delivery", deliveryDTO);

    return "order_info";
  };
}
