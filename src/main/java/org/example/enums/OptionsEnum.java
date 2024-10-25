package org.example.enums;

public enum OptionsEnum {
    SHOW_ALL_CUSTOMERS_AND_CARDS(1, "Müştərilərin siyahısını və onların sahib olduqları kartları göstər"),
    ADD_AND_DELETE_CUSTOMERS(2, "Müştəriləri əlavə et və ya sil"),
    BLOCK_AND_UNBLOCK_CARDS(3, "Müştərinin kartını blokla və ya blokdan çıxar"),
    CREATE_NEW_CARD(4, "Müştəriyə yeni kart yarat"),
    SHOW_MONEY_TRANSFER(5, "Müştərilər arasında gedən pul köçürmələrini göstər");
    private final String description;
    private final int index;

    OptionsEnum(int index, String description) {
        this.description = description;
        this.index = index;
    }

    public String getDescription() {
        return description;
    }

    public int getIndex() {
        return index;
    }

    public static OptionsEnum getEnumByIndex(int index) {
        for (OptionsEnum optionsEnum : OptionsEnum.values()) {
            if (optionsEnum.index == index) {
                return optionsEnum;
            }
        }
        throw new IllegalArgumentException("Invalid option" + " " + index);
    }
}
