//Belle Nguyen
//Student ID: 302115229

package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class GiftCardTest {

	@Test
	public void getIssuingStore() {
		double		balance;
		GiftCard	card;
		int			issuingStore;
		
		issuingStore = 1337;
		balance      = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getIssuingStore()",
				issuingStore, card.getIssuingStore());
	}
	@Test
	public void getBalance() {
		double 		balance;
		GiftCard 	card;
		int 		issuingStore;
	
		issuingStore = 1337;
		balance 	 = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getBalance()",
				balance, card.getBalance(), 0.001);
	}
	@Test
	public void deduct() {
		double		balance;
		GiftCard	card;
		int			issuingStore;
		 
		issuingStore = 1337;
		balance      = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("deduct()",
				"Remaining Balance:90.00",card.deduct(10));
		
		
		
	}
}

