class Beta{
	public static void main(String k[]){
		Runnable rrr=new Runnable(){
			public void run(){
				int i=1000;
				while(i>0){
					System.out.println("hwee" + i);
					i--;
				}
			}
		};
		
		Thread th=new Thread(rrr);
		th.start();
	}
}