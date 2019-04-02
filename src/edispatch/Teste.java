package edispatch;

public class Teste {

	public static void main(String[] args) {
		Spaceship ship = new Spaceship();
		MilleniumFalcon falcon = new MilleniumFalcon();
		ship.getType();
		falcon.getType();
		Spaceship naveFalcon = new MilleniumFalcon();
		naveFalcon.getType();
		Asteroid asteroid= new Asteroid();
		Asteroid explodingAsteroid = new ExplodingAsteroid();
		asteroid.collideWith(ship);
		asteroid.collideWith(falcon);
		explodingAsteroid.collideWith(ship);
		explodingAsteroid.collideWith(falcon);		
		
		
	}
	public void maisUmMetodo(Spaceship ship) {
		if(ship instanceof MilleniumFalcon) {
			MilleniumFalcon mf = (MilleniumFalcon) ship;
			mf.outroMetodo();
		}
	}
}

class Spaceship {
	public void getType() {
		System.out.println("Sou uma nave genérica");
	}
}
class MilleniumFalcon extends Spaceship {
	@Override
	public void getType() {
		System.out.println("Sou uma Millenium Falcon");
	}
	public void outroMetodo() {
		
	}
}

class Asteroid {
	public void collideWith(Spaceship ship) {
		System.out.println("Asteroid bateu na nave generica");
	}
	
	public void collideWith(MilleniumFalcon ship) {
		System.out.println("Asteroid bateu na Millenium Falcon");
	}
}

class ExplodingAsteroid extends Asteroid {
	public void collideWith(Spaceship ship) {
		System.out.println("ExplodingAsteroid bateu na nave generica");
	}
	
	public void collideWith(MilleniumFalcon ship) {
		System.out.println("ExplodingAsteroid bateu na Millenium Falcon");
	}
}