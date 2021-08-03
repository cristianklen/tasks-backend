package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;
import org.junit.Test;
import org.junit.Assert;

public class DateUtilsTest {

	@Test
	public void deveRetornarTrueParaDataFutura() {
		//Arrange
		LocalDate date = LocalDate.now().plusDays(1);
		//Act
		Boolean result = DateUtils.isEqualOrFutureDate(date);
		//Assert
		Assert.assertTrue(result);
	}

	@Test
	public void deveRetornarFalseParaDataPassada() {
		//Arrange
		LocalDate date = LocalDate.now().minusDays(1);
		//Act
		Boolean result = DateUtils.isEqualOrFutureDate(date);
		//Assert
		Assert.assertFalse(result);
	}	

	@Test
	public void deveRetornarTrueParaDataAtual() {
		//Arrange
		LocalDate date = LocalDate.now();
		//Act
		Boolean result = DateUtils.isEqualOrFutureDate(date);
		//Assert
		Assert.assertTrue(result);
	}	
	
}
