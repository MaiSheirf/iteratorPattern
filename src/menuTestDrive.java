public class menuTestDrive {
    public static void main(String args[]) {
        dinerMenu dinerMenu = new dinerMenu();
        waitress waitress = new waitress(dinerMenu);
        waitress.printMenu();
    }
}
