package com.rumaysho.app;

import java.util.ArrayList;
import java.util.List;

import com.rumaysho.models.Kotak;
import com.rumaysho.models.Segitiga;
import com.rumaysho.models.Siswa;
import com.rumaysho.services.BangunRuangService;
import com.rumaysho.services.HitungBangunRuang;
import com.rumaysho.services.KotakServiceImpl;
import com.rumaysho.services.SegitigaServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Siswa siswa = new Siswa();
		siswa.setId("123123");
		siswa.setFirstName("Tono");
		siswa.setLastName("Sutono");
		siswa.setAddress("Bogor");
		System.out.println(siswa);

		/**
		 * sample bangun ruang
		 */
		Segitiga segitiga = new Segitiga();
		segitiga.setAlas(10);
		segitiga.setTinggi(10);

		BangunRuangService service = null;

		service = new SegitigaServiceImpl();

		double result = service.getLuas(segitiga);

		System.out.println(result);

		Kotak kotak = new Kotak();
		kotak.setLebar(5);
		kotak.setPanjang(5);

		service = new KotakServiceImpl();

		result = service.getLuas(kotak);

		System.out.println(result);

		HitungBangunRuang hitungService = new HitungBangunRuang<Segitiga>();

		System.out.println(hitungService.hitung(service, kotak));

		hitungService.getValueT("test");

		List<Integer> sampleList = new ArrayList<>();

		sampleList.add(1);
		sampleList.add(2);

		System.out.println(sampleList);

		List<Segitiga> listSegitigas = new ArrayList<>();

	}
}
