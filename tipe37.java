//Theodorus Karli
//51019020

class tipe37 extends PatokInput {
	private int harga;
	private int kembalian;
	
	public void setHarga() {
		
		if (blok == 'A'){
			harga=800000;
		} else 
		if (blok == 'B'){
			harga=600000;
		}
		
	}
	
	public int getHarga(){
		return harga;
	}
	
	public void setKembalian(int bayar) {
		kembalian=bayar-harga;
	}
	
	public int getKembalian() {
		return kembalian;
	}
}