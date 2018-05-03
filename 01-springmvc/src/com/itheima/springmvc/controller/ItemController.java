package com.itheima.springmvc.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.springmvc.pojo.Item;

@Controller
public class ItemController {
	@RequestMapping("itemList")
	public ModelAndView itemList() {

		ModelAndView mav = new ModelAndView();
		List<Item> list = Arrays.asList(new Item(1, "冰箱1", (double) 199, "冰箱好冰", new Date()), new Item(2, "冰箱2", (double) 299, "冰箱好热", new Date()));
		mav.addObject("itemList", list);
//		mav.setViewName("/WEB-INF/jsp/itemList.jsp");
		mav.setViewName("itemList");
		return mav;

	}
}
