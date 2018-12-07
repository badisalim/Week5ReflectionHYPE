package week5reflection;

public class XXXLutzApplication {

    public static void main(String[] args) {

        TvTableBuilder tvTableBuilder = new TvTableBuilder();
        TvTable buildATvTable = tvTableBuilder.build();

        System.out.println(buildATvTable);
    }

}
