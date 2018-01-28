package der3Diziler;

public class OdevMayınTarlası {

	public static void main(String[] args) {
	String[][] mayınTarlası=new String[5][5];
	
	mayınTarlası[0][0]="bos ";
	mayınTarlası[0][1]="bayrak ";
	mayınTarlası[0][2]=" mayın";
	mayınTarlası[0][3]="mayın ";
	mayınTarlası[0][4]="bos";
    
	
	mayınTarlası[1][0]="mayın";
	mayınTarlası[1][1]="bos";
	mayınTarlası[1][2]="bos";
	mayınTarlası[1][3]="mayın";
	mayınTarlası[1][4]="bayrak";
	
	mayınTarlası[2][0]="bos";
	mayınTarlası[2][1]="mayın";
	mayınTarlası[2][2]="mayın";
	mayınTarlası[2][3]="bos";
	mayınTarlası[2][4]="bayrak";
	
	mayınTarlası[3][0]="bayrak";
	mayınTarlası[3][1]="bos";
	mayınTarlası[3][2]="bos";
	mayınTarlası[3][3]="mayın";
	mayınTarlası[3][4]="mayın";
	
	mayınTarlası[4][0]="mayın";
	mayınTarlası[4][1]="bos";
	mayınTarlası[4][2]="mayın";
	mayınTarlası[4][3]="bayrak";
	mayınTarlası[4][4]="bayrak";
	
	
	
	
	for(int i=0;i<mayınTarlası.length;i++)
	{
		for(int j=0;j<mayınTarlası[i].length;j++)
		{
			System.out.print("   "+mayınTarlası[i][j]);
		}
		System.out.println();
		System.out.println();
	}
	}

}
