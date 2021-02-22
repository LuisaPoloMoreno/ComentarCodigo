package comentarCodigo;

/**
 * @author linuxmint20
 *Clase para manejar las entradas de un blog.
 *La clase se creo el 22/02/2021 por Luisa Fernanda Polo Moreno.
 *Esta es la version 2.4
 */
public class EntradaBlogLFPM {
	
	/**
	 * Separador es el caracter que separa ENTRADA del nombre del autor.
	 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**
	 * @param id
	 * @param autor
	 * @param texto 
	 * @throws IllegalArgumentException
	 * Constructor de la clase, recibe el numero de entrada, el nombre del autor de la entrada
	 * y el texto que contiene la entrada. Si el numero de entrada es negativo, lanza una excepcion.
	 */
	public EntradaBlogLFPM(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * @return 
	 * Devuelve el numero de la entrada.
	 */
	public int getId(){
		return this.id;
	}

	/**
	 * @return
	 * Devuelve el texto completo de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * @return
	 * Devuelve el nombre del autor de la entrada en mayusculas.
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	
	/**
	 * @return
	 * Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor.
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	
	/**
	 * @param args
	 * No tiene por que tener argumentos.
	 */
	public static void main(String[] args) {
                
		EntradaBlogLFPM e1=new EntradaBlogLFPM(-3,"ana","Ultimas noticias, esta disponible BixBy 2.0");
		System.out.println(e1);
	}
}