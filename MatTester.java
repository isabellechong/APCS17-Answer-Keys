import java.util.Arrays;
public class MatTester {

	public static void main(String[] args) {
		double[][] mat1 = {{4, 5, 6}, {6, 2, 5}, {8, 0, 3}};
		double[][] mat2 = {{7, 8}, {6, 7}, {2, 5}};
		
		MatCalc calculator = new MatCalc();
		double[][] solution = calculator.multiplication(mat1, mat2);
		for (int i = 0; i<solution.length; i++)
		{
			System.out.println(Arrays.toString(solution[i]));
		}

	}

}
