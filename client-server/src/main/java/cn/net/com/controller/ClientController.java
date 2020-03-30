package cn.net.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.net.com.entity.Menu;
import cn.net.com.entity.MenuVO;
import cn.net.com.feign.MenuFeign;

@Controller
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
    private MenuFeign menuFeign;
	
	
    @GetMapping("/findAll")
    @ResponseBody
    public MenuVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
        return menuFeign.findAll(page, limit);
    }
    
	
//	@Value("${server.port}")
//	private String port;
	
	@GetMapping("/index")
	public String index() {
		
		return "index";
	}
}
