
public class TesteImpressora {
	public static void main(String[] args) {
		Impressora hp = new Impressora();
		DocumentoHTML html = new DocumentoHTML();
		DocumentoPDF pdf = new DocumentoPDF();
		hp.imprimir(html, "Impressão HTML");
		hp.imprimir(pdf, "Impressão PDF");
	
	}
}
