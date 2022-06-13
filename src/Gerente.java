
public class Gerente extends Funcionario {

	private double gratificacao;

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
	
	public String listarFuncionario()
	{
		return "" + getNome() + "\n" + getCpf() + "\n" + getSalarioBase();
	}
	
	public void calcularSalarioFinal(double gratificacao, double salarioFinal)
	{
		this.gratificacao = gratificacao;
		
		salarioFinal = this.gratificacao + getSalarioBase() + getValorBonificacao();
	}
	
	public String apresentarSalario()
	{
		return ""+ getNome() + "\n" + getSalarioBase() + "\n" + getSalarioFinal() + "\n" + getValorBonificacao() + "\n" + gratificacao + "\n" + getSalarioFinal();
	}

}
