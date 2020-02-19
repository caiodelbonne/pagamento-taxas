package entidades;

public class pessoaJuridica extends taxaAnual {

	private Integer numeroDeFuncionario;

	public pessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionario) {
		super(nome, rendaAnual);
		this.numeroDeFuncionario = numeroDeFuncionario;
	}

	public Integer getNumeroDeFuncionario() {
		return numeroDeFuncionario;
	}

	public void setNumeroDeFuncionario(Integer numeroDeFuncionario) {
		this.numeroDeFuncionario = numeroDeFuncionario;
	}

	@Override
	public Double taxa() {
		if (numeroDeFuncionario > 10) {
			return getRendaAnual() * 0.14;
		} else {
			return getRendaAnual() * 0.16;
		}

	}

}
