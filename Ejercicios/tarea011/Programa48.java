package tarea011;

public class Programa48 {

	public static void main(String[] args)
	{
		int tabla, i;
		for (tabla=1; tabla<=10; tabla++)
		{
			System.out.println("\n\nTabla del " + tabla);
			System.out.println("-----------------");
			for(i=1; i<=10; i++)
			{
				System.out.println(tabla + " x " + i + " = " + tabla*i);
			}
		}
	}

}
