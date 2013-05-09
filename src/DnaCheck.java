class DnaFanval{
	public static void main(String args[]){
		System.out.println("DNA 종류 : 아데닌A 시토닌C 구아닌G 티민T");
		char dna[][]=new char[][]{
			{'A','G','G','T','A'},{'T','C','T','G','A'},{'C','T','A','C','C'},{'G','G','G','A','T'},
			{'A','A','C','T','G'},{'G','G','G','C','T'},{'C','A','G','C','T'},{'A','T','G','T','G'},
			{'C','G','A','T','A'},{'C','A','T','G','C'}
		};
		char a[]=new char[5];
		System.out.println("유전자입력 (5글자)");
		System.out.print("입력된 유전자 : ");
		for(int j=0;j<args.length;j++){a[j]=args[0].charAt(j);System.out.print(a[j]);}
		System.out.println();
		int pursent[]=new int[10];
		for(int i=0;i<10;i++){
			for(int j=0;j<args.length;j++){
				if(dna[i][j]==a[j])pursent[i]+=20;
				System.out.print(dna[i][j]+" ");
			}
			System.out.println("입력된 유전자와"+pursent[i]+"%일치");
		}
	}
}