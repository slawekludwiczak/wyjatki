package exc;

public class NamesHolderTest {
    public static void main(String[] args) {
        NamesHolder holder = new NamesHolder();
        try {
//            holder.add("Jan");
//            holder.add("Jan");
//            holder.add(null);

            holder.add("A");
            holder.add("A");
            holder.add("C");
            holder.add("D");
            System.out.println(holder.contains("Jan"));
            System.out.println(holder.contains(null));

        } catch (NullPointerException e) {
            System.out.println("Nie można dodawać nulli");
        } catch (IllegalArgumentException e) {
            System.out.println("Nie można sprawdzić, czy null jest w tablicy");
        } catch (DuplicateException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wyczerpano miejsce w tablicy");
        }


        int asd = holder.size();
    }
}
