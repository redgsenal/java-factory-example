package com.designpattern.factory.dao;

import java.util.function.Consumer;

public abstract class Dialog {

	abstract Button createButton();
	
	public void render() {
		System.out.println("render super");
		Button btnOk = createButton();
		btnOk.onClick(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("closing this dialog");				
			}			
		});
	}
}
