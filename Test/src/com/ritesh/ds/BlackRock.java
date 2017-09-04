package com.ritesh.ds;

public class BlackRock {

	public static void main(String[] args) {
		String[] quotes = new String[2];
		quotes[0] = "1.1837 1.3829 0.6102";
		quotes[1] = "1.1234 1.2134 1.2311";
		int[] result = convert(quotes);
		for (int ans : result) {
			System.out.println(ans);
		}
	}

	private static int[] convert(String[] quotes) {
		int[] arbitarage = new int[quotes.length];
		double transactionMoney = 100000;
		int k = 0;
		for (int i = 0; i < quotes.length; i++) {
			String quote[] = quotes[i].split(" ");
			Double[] doubleQuote = new Double[quote.length];
			for (int j = 0; j < quote.length; j++) {
				doubleQuote[j] = Double.parseDouble(quote[j]);
			}
			double usdEurCost = transactionMoney / doubleQuote[0];
			double eurGbpCost = usdEurCost / doubleQuote[1];
			double gbpUsdCost = eurGbpCost / doubleQuote[2];

			int totalProfitLoss = (int) (gbpUsdCost - transactionMoney);
			arbitarage[k++] = (totalProfitLoss <= 0) ? 0 : totalProfitLoss;
		}

		return arbitarage;

	}

}
