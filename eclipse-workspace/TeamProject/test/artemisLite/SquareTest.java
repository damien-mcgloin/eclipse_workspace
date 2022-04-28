package artemisLite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SquareTest {
	
	@Mock
	Player playerMock, ownerMock;

	// test data
	Square square;
	Square square2;
	
	String name;
	SquareType squareType;
	SquareType squareType2;
	int priceToAcquire;
	int priceOfRent;
	int priceToDevelop;
	int priceToMajorDevelop;
	int numOfDevelopments;
	Player owner;
	Player player;
	SystemGroup system;
	
	@BeforeEach
	void setup() {
		name = "validName";
		priceToAcquire = 200;
		priceOfRent = 100;
		priceToDevelop = 100;
		priceToMajorDevelop = 200;
		numOfDevelopments = 2;
		
		playerMock = new Player("validName", 200, 1);
		ownerMock = new Player("alsoValidName", 200, 1);
		
		square = new Square(name, squareType.GO);
		square2 = new Square(name, squareType2.PAUSE_RESEARCH, priceToAcquire, 
				priceOfRent, priceToDevelop, priceToMajorDevelop, 
				numOfDevelopments, owner, system);
		
	}
	
	@Test
	void testSquareNameTypeConstructor() {
		assertEquals(name, square.getName());
		assertEquals(squareType.GO, square.getSquareType());
	}

	@Test
	void testSquareConstructorWithAllArgs() {
		assertEquals(name, square2.getName());
		assertEquals(squareType2.PAUSE_RESEARCH, square2.getSquareType());
		assertEquals(priceToAcquire, square2.getPriceToAcquire());
		assertEquals(priceOfRent, square2.getPriceOfRent());
		assertEquals(priceToDevelop, square2.getPriceToDevelop());
		assertEquals(priceToMajorDevelop, square2.getPriceToMajorDevelop());
		assertEquals(numOfDevelopments, square2.getNumOfDevelopments());
		assertEquals(owner, square2.getOwner());
		assertEquals(system, square2.getSystem());
	}

	@Test
	void testGetSetName() {
		square.setName(name);
		assertEquals(name, square.getName());
	}

	@Test
	void testGetSetSquareType() {
		square.setSquareType(squareType.PURCHASABLE);
		assertEquals(squareType.PURCHASABLE, square.getSquareType());
	}

	@Test
	void testGetSetPriceToAcquire() {
		square.setPriceToAcquire(priceToAcquire);
		assertEquals(priceToAcquire, square.getPriceToAcquire());
	}

	@Test
	void testGetSetPriceOfRent() {
		square.setPriceOfRent(priceOfRent);
		assertEquals(priceOfRent, square.getPriceOfRent());
	}

	@Test
	void testGetPriceToDevelop() {
		square.setPriceToDevelop(priceToDevelop);
		assertEquals(priceToDevelop, square.getPriceToDevelop());
	}

	@Test
	void testGetSetPriceToMajorDevelop() {
		square.setPriceToMajorDevelop(priceToMajorDevelop);
		assertEquals(priceToMajorDevelop, square.getPriceToMajorDevelop());
	}

	@Test
	void testGetSetNumOfDevelopments() {
		square.setNumOfDevelopments(numOfDevelopments);
		assertEquals(numOfDevelopments, square.getNumOfDevelopments());
	}

	@Test
	void testGetSetOwner() {
		square.setOwner(owner);
		assertEquals(owner, square.getOwner());
	}

	@Test
	void testGetSetSystem() {
		square.setSystem(system.ARTEMIS_GENERATION_SPACESUITS);
		assertEquals(system.ARTEMIS_GENERATION_SPACESUITS, square.getSystem());
	}
	
	@Test
	void testLandedOn() {
		
		if (playerMock.getResources() < this.priceOfRent) {

			ownerMock.addResources(playerMock.getResources());
			playerMock.deductResources(playerMock.getResources());

		} else {

			ownerMock.addResources(this.priceOfRent);
			playerMock.deductResources(this.priceOfRent);
	
		}		
		
		assertEquals(100, playerMock.getResources());	
		
	}
	
	@Test
	void testDevelop() {

	}
}
