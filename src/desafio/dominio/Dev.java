package desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev
{
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

	public void increverBootCamp(Bootcamp bootcamp){
		this.conteudosInscritos.addAll( bootcamp.getConteudos() );
		bootcamp.getDevsInscritos().add( this );
	}
	public void progredir() {
		Optional<Conteudo> conteudo =  this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add( conteudo.get() );
			this.conteudosInscritos.remove( conteudo.get() );
		}else {
			System.err.println("Você não esta inscrito em nenhum conteúdo");
		}
	}

	public double calcularTotalXp()
	{
		return this.conteudosConcluidos.stream()
				.mapToDouble( Conteudo::calcularXp )
				.sum();
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setNome( String nome )
	{
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos()
	{
		return this.conteudosInscritos;
	}

	public void setConteudosInscritos( Set<Conteudo> conteudosInscritos )
	{
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos()
	{
		return this.conteudosConcluidos;
	}

	public void setConteudosConcluidos( Set<Conteudo> conteudosConcluidos )
	{
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash( this.conteudosConcluidos, this.conteudosInscritos, this.nome );
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
		Dev other = (Dev) obj;
		if ( !Objects.equals( this.conteudosConcluidos, other.conteudosConcluidos ) )
		{
			return false;
		}
		if ( !Objects.equals( this.conteudosInscritos, other.conteudosInscritos ) )
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
