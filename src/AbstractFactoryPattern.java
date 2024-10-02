interface Button {
    void paint();
}

interface Window {
    void render();
}

class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in Windows style.");
    }
}

class WindowsWindow implements Window {
    @Override
    public void render() {
        System.out.println("Rendering a window in Windows style.");
    }
}

interface GUIFactory {
    Button createButton();
    Window createWindow();
}

class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}

public class AbstractFactoryPattern {
    public static void main(String[] args) {

        GUIFactory factory = new WindowsFactory();

        Button windowsButton = factory.createButton();
        Window windowsWindow = factory.createWindow();

        windowsButton.paint();
        windowsWindow.render();
    }
}
