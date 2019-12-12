package com.godxvincent.db2services;

public class Things {
	private Long id;
	private String name;

	public Things() {
	}

	public Things(long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Things[id=%d, name='%s']", id, name);
	}
}
