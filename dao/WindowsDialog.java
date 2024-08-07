package com.designpattern.factory.dao;

import com.designpattern.factory.dao.impl.WindowsButton;

public class WindowsDialog extends Dialog {

	@Override
	public void render() {
		// TODO Auto-generated method stub
		super.render();
		System.out.println("render Windows");
	}

	@Override
	Button createButton() {
		return new WindowsButton();
	}

}
