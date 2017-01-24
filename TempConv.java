import javax.swing.JOptionPane;

public class TempConv
{
	public static void main(String [] args)
	{
		String choice;
		String a;
		String b;

		choice = (JOptionPane.showInputDialog("Choose Measuring System, A = Fahrenheit B = Celsius"));

		if(choice.equals("a") || choice.equals("A"))
		{
			fahrenheit();
		}

		else if(choice.equals ("b") || choice.equals("B"))
		{
			celsius();
		}

		else
		{
			System.out.println("Invalid Command, Choose Between A Or B");
			System.exit(0);
		}


	}

	public static void fahrenheit()
	{
		double temp1;
		double result;

		temp1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Fahrenheit Temperature"));

		result = ((temp1 -32.00) * (5.00/9.00));

		System.out.println("The Temperature is: " +result+ " Celsius");
	}
	public static void celsius()
	{
		double temp1;
		double result;

		temp1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Celsius Temperature"));

		result = ((temp1 * 5.00 / 9.00) + 32.00);

		System.out.println("The Temperature is:" +result+ " Fahrenheit");
	}
}
