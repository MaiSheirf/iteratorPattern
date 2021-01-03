import java.util.Iterator;

public class waitress {
    dinerMenu dinerMenu;
    public waitress( dinerMenu dinerMenu) {
        this.dinerMenu = dinerMenu;
    }
    public void printMenu() {
        Iterator dinerIterator = (Iterator) dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            menuItem menuItem = (menuItem)iterator.next();
            System.out.print(menuItem.getName() + ",");
            System.out.print(menuItem.getPrice() + "__");
            System.out.println(menuItem.getDescription());
        }
}}
