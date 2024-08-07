package com.designpattern.factory.dao;

import java.util.function.Consumer;

public interface Button {
	void render();
	void onClick(Consumer<?> consumer);
}
