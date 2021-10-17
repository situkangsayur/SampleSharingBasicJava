package com.rumaysho.services;

import com.rumaysho.models.BangunRuang;

public class HitungBangunRuang<T> {

	private T propSample;

	public double hitung(BangunRuangService service, BangunRuang properties) {
		return service.getLuas(properties);
	}

	public void getValueT(T value) {
		System.out.println(value);
	}
}
