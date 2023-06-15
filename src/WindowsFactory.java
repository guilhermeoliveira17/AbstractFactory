
public class WindowsFactory implements AbstractFactory{

	@Override
	public Botao CriarBotao() {
		// TODO Auto-generated method stub
		return new BotaoWindows();
	}

	@Override
	public Input CriarInput() {
		// TODO Auto-generated method stub
		return new InputWindows();
	}
	

}
