package com.financeData.server.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class 行情数据Controller {

	public 行情数据Controller() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	// 行情数据下载
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@RequestMapping(value = "HangQing", method = RequestMethod.GET)
	public ModelAndView 行情信息(Locale locale, Model model) {
		//return "行情补全";
		return new ModelAndView("/行情补全");

	}
}
