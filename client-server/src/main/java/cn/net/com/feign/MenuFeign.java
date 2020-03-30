package cn.net.com.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cn.net.com.entity.MenuVO;


@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/menu/findAll/{page}/{limit}")
    public MenuVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit);

   

}
