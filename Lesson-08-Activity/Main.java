class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void print(String msg){
		System.out.println(msg);
	}

	FtoC(double F){
		double C = (F - 32) * 9/5.0;
		return C;
	}
  void init(){
	print("Hello");
	double cel = FtoC(73.6);
  }

  
 
}