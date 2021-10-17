package com.rumaysho.services;

import com.rumaysho.models.BangunRuang;

public class KotakServiceImpl implements BangunRuangService {

	@Override
	public double getLuas(BangunRuang properties) {
		return properties.getAxisA() * properties.getAxixB();
	}
}
