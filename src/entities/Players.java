package entities;


import enums.Symbol;

class Players {
    private final String name;
    private final Symbol symbol;
    public Players(String name, Symbol symbol) {
        if(symbol == Symbol.EMPTY){
            throw new IllegalArgumentException("player cannot be EMPTY");
        }
        this.name = name;
        this.symbol = symbol;
    }

    public String getName(){
        return name;
    }
    public Symbol getSymbol(){
        return symbol;
    }

    @Override
    public String toString(){
        return name + "(" + symbol.getDisplayChar() + ")";
    }
}
