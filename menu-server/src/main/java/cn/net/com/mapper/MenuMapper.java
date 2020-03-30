package cn.net.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.net.com.entity.Menu;
/**
 * 2020年03月27日
 * @author clq
 *
 */
public interface MenuMapper {

	
	public List<Menu> findAll(int index,int limit);
    public int count();
    public void save(Menu menu);
    public Menu findById(long id);
    public void update(Menu menu);
    public void deleteById(long id);
	
	
	
	
}
