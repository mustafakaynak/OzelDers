package der3Diziler;

public class Dizi6 {

	public static void main(String[] args) {
	
//TODO Ýki boyutlu dizi:Dýzýlerin dizisi diye gecer
	//TODO  ilk index satýrlarý ikinci index sutunlarý verir.	
		
		String[][] satrancTahtasi= new String[8][8];
		
		satrancTahtasi[0][0]="Siyah kale";
		satrancTahtasi[0][1]="Siyah at";
		satrancTahtasi[0][2]="Siyah fil";
		satrancTahtasi[0][3]="Siyah vezir";
		satrancTahtasi[0][4]="Siyah sah";
		satrancTahtasi[0][5]="Siyah fil";
		satrancTahtasi[0][6]="Siyah at";
		satrancTahtasi[0][7]="Siyah kale";
		
		satrancTahtasi[1][0]="siyah piyon";
		satrancTahtasi[1][1]="siyah piyon";
		satrancTahtasi[1][2]="siyah piyon";
		satrancTahtasi[1][3]="siyah piyon";
		satrancTahtasi[1][4]="siyah piyon";
		satrancTahtasi[1][5]="siyah piyon";
		satrancTahtasi[1][6]="siyah piyon";
		satrancTahtasi[1][7]="siyah piyon";
		
		for(int i=2;i<satrancTahtasi.length-2;i++)
		{
		    for(int j=0;j<satrancTahtasi[i].length;j++)
		    {
		    	satrancTahtasi[i][j] ="*********";
		    }
		
		}
		satrancTahtasi[7][0]="Beyaz kale";
		satrancTahtasi[7][1]="Beyaz at";
		satrancTahtasi[7][2]="Beyaz fil";
		satrancTahtasi[7][3]="Beyaz vezir";
		satrancTahtasi[7][4]="Beyaz sah";
		satrancTahtasi[7][5]="Beyaz fil";
		satrancTahtasi[7][6]="Beyaz at";
		satrancTahtasi[7][7]="Beyaz kale";
	
		satrancTahtasi[6][0]="Beyaz piyon";
		satrancTahtasi[6][1]="Beyaz piyon";
		satrancTahtasi[6][2]="Beyaz piyon";
		satrancTahtasi[6][3]="Beyaz piyon";
		satrancTahtasi[6][4]="Beyaz piyon";
		satrancTahtasi[6][5]="Beyaz piyon";
		satrancTahtasi[6][6]="Beyaz piyon";
		satrancTahtasi[6][7]="Beyaz piyon";
		for(int i=0;i<satrancTahtasi.length;i++)
		{
		    for(int j=0;j<satrancTahtasi[i].length;j++)
		    {
		    	//TODO \t býr ozel karakterdir tab yerine gecer.
		    	System.out.print(satrancTahtasi[i][j]+" \t"); 
		    }
		    System.out.println();
		
		}
		
		
		
		
		
		
	}

}
