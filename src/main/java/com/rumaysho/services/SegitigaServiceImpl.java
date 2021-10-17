package com.rumaysho.services;

import com.rumaysho.models.BangunRuang;

public class SegitigaServiceImpl implements BangunRuangService {

	@Override
	public double getLuas(BangunRuang properties) {
		return 0.5 * properties.getAxisA() * properties.getAxixB();
	}
}
