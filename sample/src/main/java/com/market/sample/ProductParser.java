package com.market.sample;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.market.sample.model.Product;

public class ProductParser {

	private static final String RESOURCES = "src/main/resources/";
	
	public void analyze(final String fileName) {
		final Path path = Paths.get(RESOURCES + fileName);
		System.out.println(path);
		ProductCSVParser csvParser = new ProductCSVParser();
		
		try {
			Charset cs = StandardCharsets.UTF_8;
			List<String> lines = Files.readAllLines(path, cs);
			List<Product> products = csvParser.parseLinesFrom(lines);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 1. 첫 번째 관심사 - 주어진 입출금 내역 파일 읽기
//		List<String> lines = new ArrayList<>();
		
//		try (InputStream inputStream = MainApplication.class.getResourceAsStream(RESOURCES + fileName);
//				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
//				String line;
//			while ((line = reader.readLine()) != null) {
//				lines.add(line);
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		ProductCSVParser parser = null;
//		if (fileName.contains(".csv")) {
//			parser = new ProductCSVParser();
//			System.out.println(parser);
//		} else {
//			System.out.println("올바른 파일 확장자를 선택하세요.");
//			return;
//		}

		// 1.월별 수익
		
		}
}