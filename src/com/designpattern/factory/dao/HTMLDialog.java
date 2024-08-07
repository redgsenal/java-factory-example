package com.designpattern.factory.dao;

import com.designpattern.factory.dao.impl.HTMLButton;

public class HTMLDialog extends Dialog {

	@Override
	public void render() {
		// TODO Auto-generated method stub
		super.render();
		System.out.println("render HTML");
	}

	@Override
	Button createButton() {
		return new HTMLButton();
	}

}
