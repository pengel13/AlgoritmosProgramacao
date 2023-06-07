package unisinos.Data;

public class Data {
	public int dia;
	public int mes;
	public int ano;

	public Data(int dia, int mes, int ano) {
		if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
			if (dia > 29) {
				if (mes == 2 && dia >= 30) {
					System.out.println("Data Inválida");
				} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia < 30) {
					System.out.println("Data Inválida");
				}
				else{
					this.dia = dia;
					this.mes = mes;
					this.ano = ano;
				}
			} else {
				this.dia = dia;
				this.mes = mes;
				this.ano = ano;
			}
		}
		else {
			System.out.println("Data Inválida");
		}
	}

	
	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public void escreverAData() {
		System.out.println(dia + "/" + mes + "/" + ano);
	}

	public void escreverOMes() {
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Mês inválido");
		}
	}

	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}
}

