package desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp
{
	private String nome;
	private String descricao;
	private final LocalDate dataInicio = LocalDate.now();
	private final LocalDate dataFinal = this.dataInicio.plusDays( 45 );
	private Set<Dev> devsInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();

	public String getNome()
	{
		return this.nome;
	}

	public void setNome( String nome )
	{
		this.nome = nome;
	}

	public String getDescricao()
	{
		return this.descricao;
	}

	public void setDescricao( String descricao )
	{
		this.descricao = descricao;
	}

	public Set<Dev> getDevsInscritos()
	{
		return this.devsInscritos;
	}

	public void setDevsInscritos( Set<Dev> devsInscritos )
	{
		this.devsInscritos = devsInscritos;
	}

	public Set<Conteudo> getConteudos()
	{
		return this.conteudos;
	}

	public void setConteudos( Set<Conteudo> conteudos )
	{
		this.conteudos = conteudos;
	}

	public LocalDate getDataInicio()
	{
		return this.dataInicio;
	}

	public LocalDate getDataFinal()
	{
		return this.dataFinal;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash( conteudos, dataFinal, dataInicio, descricao, devsInscritos, nome );
	}

	@Override
	public boolean equals( Object obj )
	{
		if ( this == obj )
		{
			return true;
		}
		if ( obj == null )
		{
			return false;
		}
		if ( getClass() != obj.getClass() )
		{
			return false;
		}
		Bootcamp other = (Bootcamp) obj;
		if ( !Objects.equals( this.conteudos, other.conteudos ) )
		{
			return false;
		}
		if ( !Objects.equals( this.dataFinal, other.dataFinal ) )
		{
			return false;
		}
		if ( !Objects.equals( this.dataInicio, other.dataInicio ) )
		{
			return false;
		}
		if ( !Objects.equals( this.descricao, other.descricao ) )
		{
			return false;
		}
		if ( !Objects.equals( this.devsInscritos, other.devsInscritos ) )
		{
			return false;
		}
		if ( !Objects.equals( this.nome, other.nome ) )
		{
			return false;
		}
		return true;
	}

}
