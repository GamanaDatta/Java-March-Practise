package OOPEncapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launch browser");
		checkBrowserVersion();
		checkOSCompatible();
		checkRAMSize();
		checkUpgrade();
		System.out.println("browser is launched");

	}

	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}

	private void checkOSCompatible() {
		System.out.println("checkOSCompatible");
	}

	private void checkRAMSize() {
		System.out.println("checkRAMSize");
	}

	private void checkUpgrade() {
		System.out.println("checkUpgrade");
	}

}
