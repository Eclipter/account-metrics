package by.bsuir.account.statistics.domain;

public enum Currency {

	USD, EUR, RUB;

	public static Currency getBase() {
		return USD;
	}
}
