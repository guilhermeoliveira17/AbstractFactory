
public class MacOsFactory implements AbstractFactory {

	@Override
	public Botao CriarBotao() {
		return new BotaoMacOS();
	}

	@Override
	public Input CriarInput() {
		return new InputMacOs();
	}
	

}
