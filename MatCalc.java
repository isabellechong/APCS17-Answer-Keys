public class MatCalc {

	public MatCalc()
	{
		
	}
	
	public boolean canAddSubtract(double[][] mat1, double[][] mat2)
	{
		if ((mat1.length == mat2.length) && (mat1[0].length == mat2[0].length))
			return true;
		else
			return false;
	}
	
	public boolean canMultiply(double[][] mat1, double[][] mat2)
	{
		if (mat1[0].length == mat2.length)
			return true;
		else
			return false;
	}
	
	public double[][] addition(double[][] mat1, double[][] mat2)
	{
		if (canAddSubtract(mat1, mat2) == false)
		{
			System.out.println("Cannot perform addition; matricies are not the same size");
			return null;
		}
		double[][] finalMat = new double[mat1.length][mat1[0].length];
		for (int i = 0; i<finalMat.length; i++)
		{
			for (int j = 0; j<finalMat[0].length; j++)
				finalMat[i][j] = mat1[i][j] + mat2[i][j];
		}
		return finalMat;
	}
	
	public double[][] subtraction(double[][] mat1, double[][] mat2)
	{
		if (canAddSubtract(mat1, mat2) == false)
		{
			System.out.println("Cannot perform subtraction; matricies are not the same size");
			return null;
		}
		double[][] finalMat = new double[mat1.length][mat1[0].length];
		for (int i = 0; i<finalMat.length; i++)
		{
			for (int j = 0; j<finalMat[0].length; j++)
				finalMat[i][j] = mat1[i][j] - mat2[i][j];
		}
		return finalMat;
	}
	
	public double[][] multiplication(double[][] mat1, double[][] mat2)
	{
		if (canMultiply(mat1, mat2) == false)
		{
			System.out.println("Cannot perform multiplication, matricies are not the proper sizes");
		}
		double[][] finalMat = new double[mat1.length][mat2[0].length];
		for (int i = 0; i<mat1.length; i++)
		{
			for (int j = 0; j<mat2[0].length; j++)
			{
				double entry = 0;
				for (int k = 0; k<mat1[0].length; k++)
				{
					entry += (mat1[i][k]*mat2[k][j]);
				}
				finalMat[i][j] = entry;
			}
		}
		return finalMat;
	}
}
