
public class DocumentoPDF implements Documento{
	@Override
	public String Exibir(String mensagem) {
		// TODO Auto-generated method stub
		String texto = "Documento PDF >> " + mensagem;
		return texto;
	}
}
