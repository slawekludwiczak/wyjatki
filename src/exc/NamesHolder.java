package exc;

public class NamesHolder {
    private int MAX_SIZE = 3;
    private String[] names = new String[MAX_SIZE];
    private int size = 0;

    public void add(String name) throws DuplicateException {
        if(name == null)
            throw new NullPointerException();
        if(contains(name))
            throw new DuplicateException("Nie możesz dodawać duplikatów");
        if(size == name.length())
            throw new ArrayIndexOutOfBoundsException();
        names[size] = name;
        size++;
    }

    public boolean contains(String name) {
        if (name == null)
            throw new IllegalArgumentException();
        for(int i=0; i < size; i++) {
            if(name.equals(names[i]))
                return true;
        }
        return false;
    }

    public int size() {
        return size;
    }
}
