package enums;

enum Sysmbol {
    X('X'),
    O('O'),
    EMPTY('_');

    private final char displayChar;

    Sysmbol(char displayChar){
        this.displayChar = displayChar;
    }

    public char getDisplayChar(){
        return displayChar;
    }
}
