class DnaFanval{
	public static void main(String args[]){
		System.out.println("DNA ���� : �Ƶ���A �����C ���ƴ�G Ƽ��T");
		char dna[][]=new char[][]{
			{'A','G','G','T','A'},{'T','C','T','G','A'},{'C','T','A','C','C'},{'G','G','G','A','T'},
			{'A','A','C','T','G'},{'G','G','G','C','T'},{'C','A','G','C','T'},{'A','T','G','T','G'},
			{'C','G','A','T','A'},{'C','A','T','G','C'}
		};
		char a[]=new char[5];
		System.out.println("�������Է� (5����)");
		System.out.print("�Էµ� ������ : ");
		for(int j=0;j<args.length;j++){a[j]=args[0].charAt(j);System.out.print(a[j]);}
		System.out.println();
		int pursent[]=new int[10];
		for(int i=0;i<10;i++){
			for(int j=0;j<args.length;j++){
				if(dna[i][j]==a[j])pursent[i]+=20;
				System.out.print(dna[i][j]+" ");
			}
			System.out.println("�Էµ� �����ڿ�"+pursent[i]+"%��ġ");
		}
	}
}