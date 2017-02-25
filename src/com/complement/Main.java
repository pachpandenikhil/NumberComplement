package com.complement;

public class Main {
	
	public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        String complement = getComplement(binary);
        return Integer.parseInt(complement, 2);
    }

	private String getComplement(String binary) {
		char[] bits = binary.toCharArray();
		for (int i = 0; i < bits.length; i++) {
			char complement = complement(bits[i]);
			bits[i] = complement;
		}
		String complement = new String(bits);
		return complement;
	}

	private char complement(char bit) {
		return bit == '1'?'0':'1';
	}

	public static void main(String[] args) {
		Main obj = new Main();
		int num = 5;
		System.out.println(obj.findComplement(num));
	}

}