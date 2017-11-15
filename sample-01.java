
public static double sumOfYearsDigits (double initialCost, double residualValue, int usefulLifeInYears, int numYearsPassed)
{
    double totalDepreciation = 0;
    
    double sumOfYears = usefulLifeInYears;
    for (int i = 1; i < usefulLifeInYears; i++)
    {
        sumOfYears += i;
    }

    double depreciableAmt = initialCost - residualValue;
    int undepreciatedLifeInYears = usefulLifeInYears - numYearsPassed;
    
    for (int b = usefulLifeInYears; b > undepreciatedLifeInYears; b--)
    {
        double calcTotalDep = (b / sumOfYears) * depreciableAmt;
        totalDepreciation += calcTotalDep;
    }
    
    return totalDepreciation;
}


