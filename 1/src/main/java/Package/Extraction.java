package Package;


public class Extraction {
	public double Square_Root(double Calculation_Number)
	{
		int Number_Length = (int)Math.log10(Calculation_Number)+1;
		double Result_Number = 0;   //Результат
        double Proccess_Number = 0; //Промежуточное число для вычислений
        int Shift = 0;  //Смещение запятой влево
        while (Number_Length > 2)
        {
            Number_Length -= 2;
            Shift += 2;
        }
        Calculation_Number /= Math.pow(10, Shift);
        for (int i = 9; i >= 1; i--)
            if (Math.pow(i, 2) <= (int)(Calculation_Number))
            {
                Shift -= 2;
                Proccess_Number = (int)(Calculation_Number) - Math.pow(i, 2);
                Result_Number = i;
                Calculation_Number = (Calculation_Number - (int)(Calculation_Number)) * 100;
                if (Shift >= 0 && Shift <= 14)
                {
                	Calculation_Number = Math.round(Calculation_Number * Math.pow(10, Shift));
                	Calculation_Number /= Math.pow(10, Shift);
                }
                break;
            }
        while (true)
        {
            for (int j = 9; j >= 0; j--)
            {
                if ((Result_Number * 20 + j) * j <= Proccess_Number * 100 + (int)(Calculation_Number))
                {
                    Shift -= 2;
                    Proccess_Number = Proccess_Number * 100 + (int)(Calculation_Number) - (Result_Number * 20 + j) * j;
                    Result_Number = Result_Number * 10 + j;
                    Calculation_Number = (Calculation_Number - (int)(Calculation_Number)) * 100;
                    if (Shift >= 0 && Shift <= 14)
                    {
                    	Calculation_Number = Math.round(Calculation_Number * Math.pow(10, Shift));
                    	Calculation_Number /= Math.pow(10, Shift);
                    }
                    break;
                }
            }
            if (Calculation_Number == 0 && Proccess_Number == 0 || Shift < -20)
                break;
        }
        Result_Number *= Math.pow(10, (Shift + 2) / 2);
        return Result_Number;
	}
}
