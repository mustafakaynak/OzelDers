package der3Diziler;

public class OdevMay�nTarlas� {

	public static void main(String[] args) {
	String[][] may�nTarlas�=new String[5][5];
	
	may�nTarlas�[0][0]="bos ";
	may�nTarlas�[0][1]="bayrak ";
	may�nTarlas�[0][2]=" may�n";
	may�nTarlas�[0][3]="may�n ";
	may�nTarlas�[0][4]="bos";
    
	
	may�nTarlas�[1][0]="may�n";
	may�nTarlas�[1][1]="bos";
	may�nTarlas�[1][2]="bos";
	may�nTarlas�[1][3]="may�n";
	may�nTarlas�[1][4]="bayrak";
	
	may�nTarlas�[2][0]="bos";
	may�nTarlas�[2][1]="may�n";
	may�nTarlas�[2][2]="may�n";
	may�nTarlas�[2][3]="bos";
	may�nTarlas�[2][4]="bayrak";
	
	may�nTarlas�[3][0]="bayrak";
	may�nTarlas�[3][1]="bos";
	may�nTarlas�[3][2]="bos";
	may�nTarlas�[3][3]="may�n";
	may�nTarlas�[3][4]="may�n";
	
	may�nTarlas�[4][0]="may�n";
	may�nTarlas�[4][1]="bos";
	may�nTarlas�[4][2]="may�n";
	may�nTarlas�[4][3]="bayrak";
	may�nTarlas�[4][4]="bayrak";
	
	
	
	
	for(int i=0;i<may�nTarlas�.length;i++)
	{
		for(int j=0;j<may�nTarlas�[i].length;j++)
		{
			System.out.print("   "+may�nTarlas�[i][j]);
		}
		System.out.println();
		System.out.println();
	}
	}

}
