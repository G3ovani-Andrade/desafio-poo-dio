package desafio.dominio;


public class Curso extends Conteudo
{
	private int cargaHoraria;

	@Override
	public double calcularXp()
	{
		return XP_PADRAO * this.cargaHoraria;
	}

	public int getCargaHoraria()
	{
		return this.cargaHoraria;
	}

	public void setCargaHoraria( int cargaHoraria )
	{
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString()
	{
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + this.cargaHoraria
				+ "]";
	}


}
