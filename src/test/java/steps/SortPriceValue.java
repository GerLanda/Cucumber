package steps;

public enum SortPriceValue {
    по_умолчанию("По умолчанию"),
    дешевле("Дешевле"),
    дороже("Дороже"),
    по_дате("По дате");

    String value;

    SortPriceValue(String value) {
        this.value = value;
    }
    }
