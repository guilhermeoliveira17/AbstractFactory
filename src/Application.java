
public class Application {
	
	private Botao botao;
	private Input input;
	
	
	public Application(AbstractFactory factory) {
		botao = factory.CriarBotao();
		input =  factory.CriarInput();
	}
	
	public void criar() {
		botao.botao();
		input.input();
	}
	
	

}
