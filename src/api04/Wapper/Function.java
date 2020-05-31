package api04.Wapper;

public class Function {

	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		int byteSu = Integer.BYTES;
		int size = Integer.SIZE;
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("byteSu: " + byteSu);
		System.out.println("size: " + size);
		
		String binary = Integer.toBinaryString(10);
		String octal = Integer.toOctalString(10);
		String hex = Integer.toHexString(10);
				
		System.out.println("binary: " + binary);
		System.out.println("octal: " + octal);
		System.out.println("hex: " + hex.toUpperCase()); // 대문자
		
		//문자를 숫자로 바꾸기
		String su = "10";
		int value = Integer.parseInt(su);
		byte bValue = Byte.parseByte(su);
		long IValue = Long.parseLong(su);
		System.out.println(su + "\t" + value + "\t" + bValue + "\t" + IValue);

		//숫자를 문자로 바꾸기
		int imsi = 10;
		String str = String.valueOf(imsi);
		System.out.println(str);
		
	}

}
