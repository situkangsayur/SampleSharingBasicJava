package com.rumaysho.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Segitiga implements BangunRuang {
	private int alas;
	private int tinggi;

	@Override
	public int getAxisA() {
		// TODO Auto-generated method stub
		return this.alas;
	}

	@Override
	public int getAxixB() {
		return this.tinggi;
	}
}
