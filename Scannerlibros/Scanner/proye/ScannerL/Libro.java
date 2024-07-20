package proye.ScannerL;

public class Libro {
	public String ISBN;
	public String titulo;
	public String autor;
	public int numPaginas;

	public Libro(String iSBN, String titulo, String autor, int numPaginas) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + "]";
	}

}
