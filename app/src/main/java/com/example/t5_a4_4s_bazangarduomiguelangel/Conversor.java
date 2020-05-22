package com.example.t5_a4_4s_bazangarduomiguelangel;

public class Conversor {
    public int convertirDecimal(int num){return Integer.parseInt(String.valueOf(num));
    }
    public String convertirBinario(int num){
        return Integer.toBinaryString(num);
    }
    public String convertirOctal(int num){
        return Integer.toOctalString(num);
    }
    public String convertirHexadecimal(int num){
        return Integer.toHexString(num);
    }

}
