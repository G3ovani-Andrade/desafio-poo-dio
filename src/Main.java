import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main
{

	public static void main( String[] args )
	{
		Curso curso1 = new Curso();
		curso1.setTitulo( "curso java" );
		curso1.setDescricao( "descricao curso java" );
		curso1.setCargaHoraria( 8 );

		Curso curso2 = new Curso();
		curso2.setTitulo( "curso js" );
		curso2.setDescricao( "descricao curso js" );
		curso2.setCargaHoraria( 4 );


		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo( "mentoria java" );
		mentoria.setDescricao( "descricao mentoria java" );
		mentoria.setData( LocalDate.now() );

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome( "Bootcamp java Developer" );
		bootcamp.setDescricao( " Descricao bootcamp java developer" );
		bootcamp.getConteudos().add( curso1 );
		bootcamp.getConteudos().add( curso2 );
		bootcamp.getConteudos().add( mentoria );

		Dev devCamila = new Dev();
		devCamila.setNome( "Camilla" );
		devCamila.increverBootCamp( bootcamp );

		Dev devJoao = new Dev();
		devCamila.setNome( "Joao" );
		devJoao.increverBootCamp( bootcamp );

		System.out.println( "Conteudos inscritos Camila" + devCamila.getConteudosInscritos() );
		devCamila.progredir();

		System.out.println( "Conteudos concluidos Camila" + devCamila.getConteudosConcluidos() );

		System.out.println( "Conteudos inscritos João" + devJoao.getConteudosInscritos() );
		devJoao.progredir();
		System.out.println( "Conteudos concluidos João" + devJoao.getConteudosConcluidos() );

		System.out.println( "Xp joão " + devJoao.calcularTotalXp() );
		System.out.println( "Xp Camila " + devCamila.calcularTotalXp() );
	}

}
