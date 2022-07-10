package secao8Entities;

public class Alunes {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double pontos() {
		return nota1 + nota2 + nota3;
	}

	public String apOrRep() {
		if (pontos() < 60) {
			double falta = 60 - pontos();
			return "Reprovado faltam " + falta + "pontos";
		} else {
			return "Total de pontos: " + pontos() + "Aprovado";
		}
	}
}
