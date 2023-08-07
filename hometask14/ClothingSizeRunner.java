package hometask14;

public class ClothingSizeRunner {
    public static void main(String[] args) {
        System.out.println("All sises: ");
        for (ClothingSize size : ClothingSize.values()) {
            System.out.println(size);
        }
        String input = "XS";
        ClothingSize selectedSize = ClothingSize.valueOf(input);

        System.out.println("Порядковый номер: " + selectedSize.ordinal());
        System.out.println("Euro Size: " + selectedSize.getEuroSize());
        System.out.println("Description: " + selectedSize.getDescription());
    }
}

