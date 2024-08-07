package com.designpattern.factory.dao.impl;

import java.util.function.Consumer;

import com.designpattern.factory.dao.Button;

public class WindowsButton implements Button {

	@Override
	public void render() {
		System.out.println("render button in Windows");
	}

	@Override
	public void onClick(Consumer<?> consumer) {
		System.out.println("onClick in Windows");
	}
}
