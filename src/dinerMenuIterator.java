public class dinerMenuIterator implements iterator{menuItem[] items;
    int position = 0;
    public dinerMenuIterator(menuItem [] items){
        this.items = items;
    }
    @Override
    public Object next() {
        menuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
