// Product interface for Button
interface Button {
    void paint();
}

// Product interface for Window
interface Window {
    void render();
}

// Windows Button implementation
class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in Windows style.");
    }
}

// Windows Window implementation
class WindowsWindow implements Window {
    @Override
    public void render() {
        System.out.println("Rendering a window in Windows style.");
    }
}

// Abstract Factory interface
interface GUIFactory {
    Button createButton();
    Window createWindow();
}

// Windows Factory implementation
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

// Test class
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        // Creating Windows Factory
        GUIFactory factory = new WindowsFactory();

        // Creating Windows Button and Window
        Button windowsButton = factory.createButton();
        Window windowsWindow = factory.createWindow();

        // Using the created objects
        windowsButton.paint();  // Output: Rendering a button in Windows style.
        windowsWindow.render();  // Output: Rendering a window in Windows style.
    }
}
