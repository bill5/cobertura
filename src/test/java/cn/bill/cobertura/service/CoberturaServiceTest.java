package cn.bill.cobertura.service;

import org.junit.Test;

public class CoberturaServiceTest {
	
	@Test
	public void addTest(){
		CoberturaService service = new CoberturaService();
		System.out.println(service.add(1, 1));
	}
	
	@Test
	public void sumTest(){
		CoberturaService service = new CoberturaService();
		System.out.println(service.sum(1, 1));
	}

}
