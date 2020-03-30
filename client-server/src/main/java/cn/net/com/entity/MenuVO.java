package cn.net.com.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


public class MenuVO implements Serializable{
	
	
    private int code;
    private String msg;
    private int count;
    public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "MenuVO [code=" + code + ", msg=" + msg + ", count=" + count + ", data=" + data + "]";
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Menu> getData() {
		return data;
	}
	public void setData(List<Menu> data) {
		this.data = data;
	}
	private List<Menu> data;
}
