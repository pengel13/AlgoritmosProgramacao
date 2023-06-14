package Casa;

public class Casa {
	Parede p1 = new Parede();
	Parede p2 = new Parede();
	Parede p3 = new Parede();
	Parede p4 = new Parede();
	
	Janela j1 = new Janela();
	Janela j2 = new Janela();
	
	Porta door = new Porta();
	
	public Casa() {}
	
	public Casa(Porta door) {
		this.door = door;
	}
	public Casa(Parede p1, Parede p2, Parede p3, Parede p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		
	}
	public Casa(Janela j1, Janela j2) {
		this.j1 = j1;
		this.j2 = j2;
	}
	
	public Casa(Porta door,Parede p1, Parede p2, Parede p3, Parede p4, Janela j1, Janela j2 ) {
		this.door = door;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.j1 = j1;
		this.j2 = j2;
	}
	
}
