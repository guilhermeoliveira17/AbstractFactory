
public class Main {
	
	private static Application configureApplication() {
        Application app;
        AbstractFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

	public static void main(String[] args) {
		Application app = configureApplication();
		app.criar();

	}

}
