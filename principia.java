package agragacao;

public class principia {
	public static void main(String[] args) {
		Motor motor = new Motor("Dodge");
		Carro carro = new Carro("Mustang", motor);
		
		System.out.println("Carro é:" + carro.getModelo() + "\nMotor: " + motor.getTipo());
	}
}
