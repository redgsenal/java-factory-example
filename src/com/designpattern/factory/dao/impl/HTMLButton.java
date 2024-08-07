package com.designpattern.factory.dao.impl;

import java.util.function.Consumer;
import java.util.function.Predicate;

import com.designpattern.factory.dao.Button;

public class HTMLButton implements Button {

	@Override
	public void render() {
		System.out.println("render button in HTML");
	}

	@Override
	public void onClick(Consumer<?> consumer) {
		System.out.println("onClick event in HTML");
	}
}
