package MeasurementConverter;

import MeasurementConverter.view.ConsoleService;

public class Application {

    private final ConsoleService consoleService = new ConsoleService();

    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    public void run() {
        consoleService.displayWelcome();
        int startingUnit = consoleService.printMenu();
        int startingQuantity = consoleService.requestQuantity();
        int endingQuantity = consoleService.requestEndingUnit();




    }


}
