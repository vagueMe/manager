package com.springboot.manager;

import com.alibaba.fastjson.JSONObject;
import com.springboot.manager.model.dto.JsonSt;
import com.springboot.manager.model.dto.PermissionDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagerApplicationTests {


	@Test
	public void contextLoads() {
	}

	@Test
	public  void test(){
		JsonSt jsonSt = new JsonSt();
		jsonSt.setOption(0);
		String a = JSONObject.toJSONString(jsonSt);
		System.out.println(a);
	}

	@Autowired
	private TestUrl testUrl;


	@Test
	public  void test2(){
		System.out.println(testUrl.checkUrl(1,"/sefsfgrgr"));

	}


	@Test
	public  void test3(){
		List<Integer> list =  new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		System.out.println(list.toString());

	}

	@Test
	public  void test4(){
		List<Lin> list =  new ArrayList<Lin>();
		for(int i = 0; i < 3; i++){
			Lin lin = new Lin();
			lin.setA(i+"");
			lin.setB(i);
			list.add(lin);
		}
		System.out.println(list);
		for(Lin lin : list){
			lin.setA("hahah");
			lin.setB(888);
			for(int i = 0; i < list.size(); i++ ){
				System.out.println(lin == list.get(i));
			}
		}

		System.out.println(list);
	}

	class Lin{
		private String a;
		private int b;

		public String getA() {
			return a;
		}

		public void setA(String a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}
	}

}
