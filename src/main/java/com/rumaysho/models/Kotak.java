package com.rumaysho.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Kotak implements BangunRuang {
	private int panjang;
	private int lebar;

	@Override
	public int getAxisA() {
		// TODO Auto-generated method stub
		return this.panjang;
	}

	@Override
	public int getAxixB() {
		return this.lebar;
	}
}
