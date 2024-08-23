import java.time.LocalDate;

import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

public class Main
{

	public static void main( String[] args )
	{
		Curso curso = new Curso();
		curso.setTitulo( "curso js" );
		curso.setDescricao( "descricao curso js" );
		curso.setCargaHoraria( 10 );

		System.out.println( curso );

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo( "mentoria java" );
		mentoria.setDescricao( "descricao mentoria java" );
		mentoria.setData( LocalDate.now() );

		System.out.println( mentoria );
	}

}
