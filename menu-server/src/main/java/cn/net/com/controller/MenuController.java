package cn.net.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.net.com.entity.Menu;
import cn.net.com.entity.MenuVO;
import cn.net.com.entity.Type;
import cn.net.com.mapper.MenuMapper;
import cn.net.com.mapper.TypeMapper;

@RestController
@RequestMapping("/menu")
public class MenuController {

	@Autowired
    private MenuMapper menuMapper;
    @Autowired
    private TypeMapper typeMapper;
    

	@Value("${server.port}")
	private String port;
	
	@GetMapping("/index")
	public String index() {
		
		return "当前端口menu："+this.port;
	}
	

    @GetMapping("/findAll/{index}/{limit}")
    public MenuVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit){
        MenuVO menuVO = new MenuVO();
        menuVO.setCode(0);
        menuVO.setMsg("");
        menuVO.setCount(menuMapper.count());
        List<Menu> findAll = menuMapper.findAll(index,limit);
        menuVO.setData(findAll);
        return menuVO;
    }

    @GetMapping("/findAll")
    public List<Type> findAll(){
        return typeMapper.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Menu menu){
    	menuMapper.save(menu);
    }

    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") long id){
        return menuMapper.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Menu menu){
    	menuMapper.update(menu);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
    	menuMapper.deleteById(id);
    }
	
}
