package net.swing;

public class Lotto {
	int[] lotto= new int[6];
	public int getLotto(int a){
		int b=lotto[a];
		return b;
	}
	public int[] getLotto() {
		return lotto;
	}
	public void setLotto() {
		// TODO Auto-generated method stub
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(((Math.random())*45)+1);
			if(i>0)
			{
				for(int j=0;j<i;j++)
				{
					if(lotto[i]==lotto[j])
					{
						i--;
					}
					else if(i<lotto.length&&lotto[i]<lotto[j])
					{
						int SwapTemp=lotto[i];
						lotto[i]=lotto[j];
						lotto[j]=SwapTemp;
					}
				}
			}
		}
	}
}